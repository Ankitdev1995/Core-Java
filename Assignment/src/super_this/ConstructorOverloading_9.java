package super_this;

public class ConstructorOverloading_9 {
	private int RollNum;
	
	ConstructorOverloading_9(){
		RollNum=100;

	}
	ConstructorOverloading_9(int rnum){
		this();

		RollNum=RollNum+rnum;

	}
	public int getRollNum(){
		return RollNum;
	}
	public void setRollNum(int rollNum){
		this.RollNum = RollNum;
	}
}


