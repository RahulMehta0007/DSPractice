package com.rahul.corejava;

public class Student {

	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}


	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object o)
	{	
		if(o==null)return false;
		if(this==o)return true;
		if (! ( o  instanceof Student )) return false;
		return this.getId()== ((Student)o).getId(); 
	}
	
	public Student(){}
}
