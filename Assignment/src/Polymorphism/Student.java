package Polymorphism;
// Program for method overloading
public class Student {
	String name;
	int age;
	String email;
	
	public void setData(String name,int age){
		this.name=name;
		this.age=age;
		}
	public void setData(String name,int age,String email){
		this.name=name;
		this.age=age;
		this.email=email;
	}
	public void display(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(email);
	}
}
