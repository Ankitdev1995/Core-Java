package Class_Work_sort;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee p1, Employee p2 ) {
	/*  Float f1=p1.salary;
		Float f2=p2.salary;
		int r=f1.compareTo(f2);
		return r;  */

	return new Float (p1.salary).compareTo(p2.salary);
	
	}

}
