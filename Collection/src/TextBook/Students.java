package TextBook;

public class Students implements Comparable<Students>{
String name;
int age;

public int compareTo(Object obj) {
	Students s=(Students)obj;
	if(age==s.age)
		return 0;
	else if(age>s.age)
		return -1;
	
}

@Override
public int compareTo(Students o) {
	// TODO Auto-generated method stub
	return 0;
}
}
