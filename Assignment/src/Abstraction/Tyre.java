package Abstraction;

public class Tyre implements MoveableEx2,Rollable{
	
	int width;
	public boolean isMoveable(){
		return false;
	}
	public boolean isRollable(){
		return true;
	}
	
	
	
	
	public static void main(String[] args) {
		Tyre tr=new Tyre();
		System.out.println(tr.isRollable());
		System.out.println(tr.isMoveable());
	}
	}
	

