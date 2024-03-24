package this_student;
//Information related devotees in temple
public class Devotee {
int D_id;
String D_name;
String Address;
int room_rent;
int room_no;
String room_type;
String Gender;


void Accept(int D_id,String D_name,String Address,int room_rent,int room_no,String room_type,String Gender){

	this.D_id= D_id;
	this.D_name= D_name;
	this.Address = Address;
	this.room_rent= room_rent;
	this.room_no= room_no;
	this.room_type= room_type;
	this.Gender= Gender;
}
	
	void display(){
	System.out.println("============");
	System.out.println("Devotee id is:"+D_id);
	System.out.println("Name:"+D_name);
	System.out.println("Address:"+Address);
	System.out.println("Room Rent:"+room_rent);
	System.out.println("Room no:"+room_no);
	System.out.println("Room type:"+room_type);
	System.out.println("Gender:"+Gender);
}
}