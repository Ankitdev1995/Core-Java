package Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageCopy {
public static void main(String[] args)throws Exception {
	FileInputStream fis=new FileInputStream("C:\\Users\\ASus\\Desktop\\Broo.jpg");
	FileOutputStream fos=new FileOutputStream("C:\\Users\\ASus\\Desktop\\Broo2.jpg");
	int a=0;
	while((a=fis.read())!=-1){
		fos.write(a);
	}
	fis.close();
	fos.close();
	}
}

