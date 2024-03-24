package Array_2D;
/* jagged array 
   rows are fixed 
   columns are varies 
   It is also called as arrays of array
                       */
public class Jagged_Array {
public static void main(String[] args) {
	int a[][]={ {10,20,30},
			    {40,50,60,70},
		       	{90,100,110,120,130,140}
			  };
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a[i].length;j++){
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}
}