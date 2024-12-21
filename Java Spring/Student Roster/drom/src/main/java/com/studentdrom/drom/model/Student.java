package com.studentdrom.drom.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "cant be null")
    @Size(min=1,max=20)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="drom_id")
    private Drom drom;

    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drom getDrom() {
        return drom;
    }

    public void setDrom(Drom drom) {
        this.drom = drom;
    }

    @PrePersist
    protected void onCreate(){
    this.createdAt=new Date();
    }
    @PreUpdate
    protected void onUpdate(){
    this.updatedAt=new Date ();
    }


}
