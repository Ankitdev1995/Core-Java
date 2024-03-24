package doctor_this;

public class Doctor {
 int id;
 String name;
 String degree;
 String specialization;
 float experience;
 
void accept(int id,String name,String degree,String specialization,float experience){

	this.id=id;
	this.name=name;
	this.degree=degree;
	this.specialization=specialization;
	this.experience=experience;
}
void display(){
	System.out.println("============");
	System.out.println("id= "+id);
	System.out.println("name= "+name);
	System.out.println("degree= "+degree);
	System.out.println("specialization= "+specialization);
	System.out.println("experience= " +experience);

	}

}
