package com.example.demo.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="burgers")
public class Burger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "must not be null")
    @Size(min=1,max=20 ,message = "must be between 0 and 5")
    private String burgerName;
    @NotNull(message = "must not be null")
    @Size(min=1,max=20 ,message = "must be between 0 and 5")
    private String restName;
    @NotNull(message = "must not be null")
    private String rate;
    @NotNull(message = "must not be null")
    @Size(min=1,max=200 ,message = "must be between 0 and 200")
    private String note;

    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;

    public Burger() {

    }
    public Burger(String burgerName, String restName, String rate, String note) {
        this.burgerName = burgerName;
        this.restName = restName;
        this.rate = rate;
        this.note = note;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getBurgerName() {
        return burgerName;
    }
    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }
    public String getRestName() {
        return restName;
    }
    public void setRestName(String restName) {
        this.restName = restName;
    }
    public String getRate() {
        return rate;
    }
    public void setRate(String rate) {
        this.rate = rate;
    }
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}
