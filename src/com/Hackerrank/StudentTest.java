	package com.Hackerrank;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		s.setAge(100);
		System.out.println(s.getAge());
		
		Animal a=new Dog();
		a.eat();
		
		xyz(a);
	}

	public static void xyz(Animal a)
	{
		
		a.eat();
	}
	
	
	
}

class Student 
{
private int age;
static int count;
public int getAge() {
	return age;
}


Student()
{
count++;
System.out.println(count);
}

public void setAge(int age) {
	
	if(age==100)
		System.out.println("Error");
	else
	this.age = age;
}


	 
	 
}
 
class Animal
{
public void eat()
{
	System.out.println("Animal's Eat");
	
System.out.println(Math.PI);
}


}
 class Dog extends Animal
 {
	 
	 public void eat()
	 {
	 	System.out.println("Dog's Eat");}

	 
 }
 
 interface xyz
 {
	 int abc();
	 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 