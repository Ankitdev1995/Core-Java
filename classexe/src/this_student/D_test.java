package this_student;

public class D_test {
	public static void main(String[] args) {
		

 Devotee d1= new Devotee();
 Devotee d2= new Devotee(); 
 Devotee d3= new Devotee(); 
 Devotee d4= new Devotee();
 
 d1.Accept(101,"Amar","Nagpur",900,01,"AC","Male");
 d2.Accept(102,"Anil","Chandrapur",750,02,"NON_AC","Male");
 d3.Accept(103,"Shreya","Amaravti",1000,03,"AC","Female");
 d4.Accept(104,"Sandhya","Wardha",800,04,"NON_AC","Female");

 d1.display();
 d2.display();
 d3.display();
 d4.display();
	}
}