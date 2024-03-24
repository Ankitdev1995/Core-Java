package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Fruits_Test {
	public static void main(String[] args) {
		/*
		  HashSet<Fruits>fruit=new HashSet<Fruits>();
		  
		  fruit.add(new Fruits(101,"Orange","Sweet",40.4f,"Nagpur"));
		  fruit.add(new Fruits(102,"Banana","sweet",40.0f,"Jalgaon"));
		  fruit.add(new Fruits(103,"Grapes","sour",80.4f,"Nashik"));
		  fruit.add(new Fruits(104,"Alphonso Mango","Sweet",600.50f,"Ratnagiri"));
		  fruit.add(new Fruits(105,"Strawberries","Sweet",200.7f,"Mahabaleshwar"));
		  
		  System.out.println("==================================");
		 */
		List<Fruits> fruit1 = new ArrayList<>();

		fruit1.add(new Fruits(101, "Orange", "Sweet", 40.4f, "Nagpur"));

		fruit1.add(new Fruits(102, "Banana", "sweet", 40.0f, "Jalgaon"));

		fruit1.add(new Fruits(103, "Grapes", "sour", 80.4f, "Nashik"));

		fruit1.add(new Fruits(104, "Alphonso Mango", "Sweet", 600.50f, "Ratnagiri"));

		fruit1.add(new Fruits(105, "Strawberries", "Sweet", 200.7f, "Mahabaleshwar"));

		fruit1.forEach(s -> System.out.println(s));
	}
}
