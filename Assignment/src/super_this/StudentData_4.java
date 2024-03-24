package super_this;

public class StudentData_4 {
	private int stuID;
	private String stuName;
	private int stuAge;
	
	StudentData_4(){
		
	stuID=100;
	stuName="New Student";
	stuAge=18;
	
}
	StudentData_4(int num1,String str,int num2){
		stuID=num1;
		stuName=str;
		stuAge=num2;
	}	
	
	public int getstuID(){
		return stuID;
		
	}
	public void setstuID(int stuID){
		this.stuID=stuID;
	}
	public String getstuName(){
		return stuName;
	}
	public void setstuName(String stuName){
		this.stuName=stuName;
	}
	public int getstuAge(){
		return stuAge;
	}	
	public void setstuAge(int stuAge){
		this.stuAge=stuAge;
		}
	}




