package Class_Work_sort;

import java.util.Comparator;

public class EmployeeRoleComparator implements Comparator <Employee> {

	@Override
	public int compare(Employee p1, Employee p2) {
		
	/*	String s1=p1.role;
		String s2=p2.role;
		int r=s1.compareTo(s2);
		return r; */
		
		
		return (p1.role).compareTo(p2.role);
	}
	

}
