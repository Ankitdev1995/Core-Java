package Array_exe;
// Merging of an Array
public class Exe16 {
public static void main(String[] args) {
	int a[]={10,20,30,40};
	int b[]={60,70,80,90,87,67,89};

	
	int an=a.length;
	int bn=b.length;
	
	int cn=an+bn;
	int[]c =new int[cn];        /* new array creation 
						           which we will get after merge */
	for(int i=0;i<a.length;i++){
	c[i]=a[i];
	}
	for(int i=0;i<b.length;i++){
		c[a.length+i]=b[i];
	}
	for(int i=0;i<c.length;i++){
	System.out.print(c[i]+ " ");   
	}
}
}

