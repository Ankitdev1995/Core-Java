package students_result;

public class Student {
	int id;
	String name;
	float total_marks;
	float obtain_marks;
	float per;
	int sub1;
	int sub2;
	int sub3;	
	void obtain_marks(){
	obtain_marks =sub1+sub2+sub3;
	}
	void per(){
	per=(obtain_marks/total_marks)*100;
		}
		
	}

