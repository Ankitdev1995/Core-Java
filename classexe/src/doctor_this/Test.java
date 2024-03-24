package doctor_this;

public class Test {

	public static void main(String[] args) {
	Doctor d1= new Doctor();
	Doctor d2= new Doctor();
	Doctor d3= new Doctor();
	
	d1.accept(101,"sushil","MBBS","ENT",2.5f);
	d2.accept(102,"sameer","BAMS","PILES",5.5f);
	d3.accept(103,"sandhya","BDS","MDS",3.5f);
	
	d1.display();
	d2.display();  
	d3.display();
}
	}