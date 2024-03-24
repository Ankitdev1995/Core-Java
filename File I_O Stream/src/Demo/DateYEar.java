package Demo;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateYEar {
public static void main(String[] args) {
	DateTimeFormatter dtf =DateTimeFormatter.ofPattern("YYYY/MMMM/dd HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();
	System.out.println(dtf.format(now));

	
	SimpleDateFormat formatter=new SimpleDateFormat("dd/MMMM/YYYY HH:mm:ss");
	Date date =new Date();
	System.out.println(formatter.format(date));
}
}