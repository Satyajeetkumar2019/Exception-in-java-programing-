//Divisions.java
import java.io.*;
public class  Divisions {
	public static void div(){
		int a=0;
		int b=0;
		int c=0;
	try {
		BufferedReader br=new BufferedReader(new InputStream(System.in));
		while(true){
		try{
		System.out.println("Enter the First numb :");
		a=Integer.parseInt(br.nextLine());
		break;
		}catch(NumberFormatException e){
		System.out.println("inter the only integer number :");
		}
		}///end while loop
while(true){
		try{
		       System.out.println("Enter the Second  numb :");
		         b=Integer.parseInt(br.nextLine());
		              try{
	                        c=a/b;
	                        System.out.println("Result :"+c);
	                         break;
		}catch (NumberFormatException e){
		e.printStackTrace();
		System.out.println("only inter integer number :");
		}
		}
}//end while loop
	}//end outer try block
		catch(NumberFormatException e){
			System.out.println("only inter integer number :");
       }catch (NumberFormatException e){
	   System.out.println("only pass integer number ");
	}catch(IOException io){
	  io.printStackTrace();
	  }
	}//end div method
}//end class 
