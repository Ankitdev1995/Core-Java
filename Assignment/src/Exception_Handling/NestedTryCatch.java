			package Exception_Handling;
			
			public class NestedTryCatch {
			public static void main(String[] args) {
				try{
					try{
						System.out.println("Inside Block 1");
						int b=45/0;
						System.out.println(b);
					}catch(ArithmeticException e){
						e.printStackTrace();
						System.out.println("Exception e1");
					}
					try{
					System.out.println("Inside block2");
					int b=45/0;
					System.out.println(b);
					
					}catch(ArrayIndexOutOfBoundsException e2){
						e2.printStackTrace();
					System.out.println("Exception e2");
					}System.out.println("just other statement");
				
					}catch(ArithmeticException e3){
						e3.printStackTrace();
					System.out.println("Arithmetic Exception");
					System.out.println("Inside Parent try catch block");
					
					}catch(ArrayIndexOutOfBoundsException e4){
						e4.printStackTrace();
					System.out.println("ArrayIndexOutOfBoundsException");
					System.out.println("Inside Parent try catch block");
					
					}catch(Exception e5){
						e5.printStackTrace();
					System.out.println("Exception");
					System.out.println("Inside parent try catch block");
					}
					System.out.println("Next Statement");
			}
			}
				