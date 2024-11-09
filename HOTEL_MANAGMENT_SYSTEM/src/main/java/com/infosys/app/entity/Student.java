package com.infosys.app.entity;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String name;

@ManyToMany
@JoinTable(name="techer_student",
joinColumns = @JoinColumn(name="studentId"),
inverseJoinColumns = @JoinColumn(name="techerId")
)
private List<Teacher> techers;
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", techers=" + techers + "]";
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Teacher> getTechers() {
	return techers;
}
public void setTechers(List<Teacher> techers) {
	this.techers = techers;
}

}
