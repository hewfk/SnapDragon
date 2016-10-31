package com.snap.app.common.web.testing;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//Master Branch

	private Long id;
	private String name;
	private String test;

	public Student() {}
	public Student(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	@Override
	public Student clone() {
		return new Student(id, name);
	}

	public void restore(Student student) {
		this.id = student.getId();
		this.name = student.getName();
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
}
