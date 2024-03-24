package Book_Ex2;

import java.util.Stack;

public class ThreadsB extends Thread{
	Stack  st=null;
	public ThreadsB(Stack st,String tname){
		super(tname);
		this.st=st;
		start();
	}
	public void run(){
		for(int i=1;i<=5;i++){
			int x=st.pop();
			System.out.println(x+"is poped by B");
			Try{
				Thread.sleep(500);
			}catch(Exception e){
					
				}
			}
		}
	}

