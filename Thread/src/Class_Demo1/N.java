package Class_Demo1;

import java.util.ArrayList;

public class N<T> {
	void display(ArrayList<T>list){
		System.out.println("===========");
		list.forEach(s->System.out.println(s));
	}
}
