package super_this;

public class StudentTestOverloading_4 {

	public static void main(String[] args) {

		StudentData_4 obj=new StudentData_4();

		System.out.println("Student Name is:" + obj.getstuName());
		System.out.println("Student age is:" + obj.getstuAge());
		System.out.println("Student ID is :" + obj.getstuID());


		StudentData_4 obj2=new StudentData_4(555,"JavaByKiran",25);

		System.out.println("Student Name is:" +obj2.getstuName());
		System.out.println("Student age is:" + obj2.getstuAge());
		System.out.println("Student ID is :" + obj2.getstuID());

	}
}