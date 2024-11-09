package com.infosys.app.entity;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

public class Teacher {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long Id;
private String name;
@ManyToMany(mappedBy = "techers")
private List<Student>students;
@Override
public String toString() {
	return "Teacher [Id=" + Id + ", name=" + name + ", students=" + students + "]";
}
public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
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
}
