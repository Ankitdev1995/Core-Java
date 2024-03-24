package com.ankit.FlatMap;
// flatmap will return the stream of objects
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentTest {

public static void main(String[] args) {
	
	List<Student>studlist1 =  new ArrayList<Student>();
	studlist1.add(new Student("raman",101, 'C'));
	studlist1.add(new Student("shewanti",102, 'B'));
	studlist1.add(new Student("prathameshwari",103, 'A'));

	List<Student>studlist2 =  new ArrayList<Student>();
	studlist1.add(new Student("mery",101, 'B'));
	studlist1.add(new Student("jagruti",102, 'C'));
	studlist1.add(new Student("lochan",103, 'A'));

	List<List<Student>>studlist = Arrays.asList(studlist1,studlist2);
		
	// before java 8
	for(List<Student> s :studlist ) {
		for(Student stu :s) {
			System.out.println(stu.sname +":"+stu.grade );
		}
	}
	System.out.println("********************");
	
	// using java 8 streams/flatMap()
	
	 List<String>nameslist  = studlist.stream()
			 .flatMap(st->st.stream())
			 .map(s->s.sname)
			 .collect(Collectors.toList());	
	System.out.println(nameslist);
// we have new stream now and we add stud1, stud2 list in the new stream then we apply flatMap method,
// from the new stream we have pass the variable as the flat map in the stream	
// from stud1 it will create 1 stream and from stud2 it will create another stream
}
}
