package this_student;

public class Student {
int id;
String name;
float obtained_marks;
float totalmarks;
float per;
int sub1;
int sub2;
int sub3;


void accept (int id,String name,float totalmarks,int sub1,int sub2,int sub3){
this.id=id;
this.name=name;
this.totalmarks=totalmarks;
this.sub1=sub1;
this.sub2=sub2;
this.sub3=sub3;
}
void operation(){
	obtained_marks=sub1+sub2+sub3;
	per=(obtained_marks/totalmarks)*100;
}
void display(){ 
	System.out.println("=======================");
	System.out.println("student name=="+ name );
	System.out.println ("student id=="+id  );
	System.out.println("student obtained marks=="+obtained_marks);
	System.out.println("student per=="+per );
}
}