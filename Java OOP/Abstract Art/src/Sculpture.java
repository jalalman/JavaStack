public class Sculpture extends Art{
    private String material;
    public void viewArt(){
        System.out.printf("Title: %s ,Author : %s ,Desc: %s ,Materials : %s \n",this.title,this.author,this.description,this.material);
    }

    public Sculpture(String material,String title,String author,String description) {
        this.material = material;
        this.title=title;
        this.author= author;
        this.description=description;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

}
