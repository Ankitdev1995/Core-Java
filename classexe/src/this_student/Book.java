package this_student;

public class Book {
	
int bid;
String bname;
String Author;
float cost;
long ISBNno;
String Publisher;

void accept(int bid,String bname,String Author,float cost,long ISBNno,String Publisher){
	this.bid=bid;
	this.bname=bname;
	this.Author=Author;
	this.cost=cost;
	this.ISBNno=ISBNno;
	this.Publisher=Publisher;
}
void display(){
	System.out.println("===========");
	System.out.println(bid);
	System.out.println(bname);
	System.out.println(Author);
	System.out.println(cost);
	System.out.println(ISBNno);
	System.out.println(Publisher);

}
@Override
public String toString() {
	return "Book [bid=" + bid + ", bname=" + bname + ", Author=" + Author + ", cost=" + cost + ", ISBNno=" + ISBNno
			+ ", Publisher=" + Publisher + "]";
}

}
