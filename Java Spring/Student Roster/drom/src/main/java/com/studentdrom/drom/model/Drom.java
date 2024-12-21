package com.studentdrom.drom.model;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;


@Entity
@Table(name="droms")
public class Drom {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@NotNull(message = "cant be null value")
@Size(min=1,max=20)
private String name;

@OneToMany(mappedBy = "drom", fetch=FetchType.LAZY)
private List<Student> students;
@Column(updatable = false)
@DateTimeFormat(pattern = "yyyy-MM-dd")
private Date createdAt;

@DateTimeFormat(pattern = "yyyy-MM-dd")
private Date updatedAt;

public Drom() {
}

public Drom( String name, List<Student> students) {

    this.name = name;
    this.students = students;
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

public List<Student> getStudents() {
    return students;
}

public void setStudents(List<Student> students) {
    this.students = students;
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
