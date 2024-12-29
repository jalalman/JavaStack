package com.axsos.login.model;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;


@Entity
@Table(name = "classes")
public class StuClass {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@NotEmpty(message = "Name is required")
private String className;

public String getClassName() {
    return className;
}
public void setClassName(String className) {
    this.className = className;
}
@OneToMany(mappedBy="stuClass", fetch = FetchType.LAZY)
private List<Student> students;

@Column(updatable=false)
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date createdAt;
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date updatedAt;

public StuClass() {
}
public StuClass(String className) {
    this.className = className;
}
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}

public List<Student> getStudents() {
    return students;
}
public void setStudents(List<Student> students) {
    this.students = students;
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


