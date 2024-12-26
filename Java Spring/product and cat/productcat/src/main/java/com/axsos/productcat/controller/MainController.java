package com.axsos.productcat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.productcat.model.Category;
import com.axsos.productcat.model.Product;
import com.axsos.productcat.service.CategoryService;
import com.axsos.productcat.service.ProductService;

import jakarta.validation.Valid;

@Controller
public class MainController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    ProductService productService;
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("products", productService.allProducts());
        model.addAttribute("categories", categoryService.allCategories());
        return "index.jsp";
    }
    @RequestMapping("/products/new")
    public String newProduct(@ModelAttribute("product") Product product) {
        return "newproduct.jsp";
    }
    @RequestMapping("/categories/new")
    public String newCategory(@ModelAttribute("category") Category category) {
        return "newcategory.jsp";
    }
    @RequestMapping("/addCategory")
    public String addCategory(@Valid @ModelAttribute("category") Category category , BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "newcategory.jsp";
        } else {
            categoryService.createCategory(category);
            return "redirect:/categories/new";
        }

    }
    @RequestMapping("/addProduct")
    public String addProduct(@Valid @ModelAttribute("product") Product product, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "newproduct.jsp";
        } else {
            productService.createProduct(product);
            return "redirect:/products/new";
        }

    }


    @RequestMapping("/categories/{id}")
    public String showCategory(@PathVariable("id") Long id ,
    @ModelAttribute("product") Product productCategory,
    Model model) {
        model.addAttribute("category", categoryService.findCategory(id));
        model.addAttribute("otherProducts", productService.findsByCategoriesNotContains(categoryService.findCategory(id)));

        return "showcategory.jsp";
    }

    @RequestMapping("/products/{id}")
    public String showProduct(@PathVariable("id") Long id ,
    @ModelAttribute("category") Category category,
    Model model) {
        model.addAttribute("product", productService.findProduct(id));
        model.addAttribute("othercategories", categoryService.findsCategoriesNotInProduct(productService.findProduct(id)));

        return "showproduct.jsp";
    }
    @RequestMapping("/producs/{prodductId}/addcategory")
    public String addCategoryToProduct(@PathVariable Long prodductId ,
    @ModelAttribute("category") Category category,
    Model model) {
        Product product = productService.findProduct(prodductId);
        product.getCategories().add(category);
        productService.createProduct(product);
        return "redirect:/products/"+prodductId;
    }

    @RequestMapping("/categories/{categoriesId}/addProduct")
    public String addCategoryToProduct(@PathVariable Long categoriesId ,
    @ModelAttribute("product") Product product,
    Model model) {
        Category category = categoryService.findCategory(categoriesId);
        category.getProducts().add(product);
        categoryService.createCategory(category);
        return "redirect:/categories/"+categoriesId;
    }
}
