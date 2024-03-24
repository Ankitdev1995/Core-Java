package Abstraction;

public  class AbstractsubclassEx3 extends AbstclassEx3{
	String name,gender,city,country;
		void getName(String name){
			this.name=name;
		}
		void getGender(String gender){
			this.gender=gender;
		}
		void getCity(String city){
			this.city=city;
		}
		void getCountry(String country){
			this.country=country;
		}
		void display(){
			System.out.println("name:"+name);
			System.out.println("Sex:"+ gender);
			System.out.println("city:"+city);
			System.out.println("Country:"+country);
		}
}
