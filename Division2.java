import java.util.Scanner;
import java.io.*;
class Division2 { 
private static int a;
private static int b;
	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
int c=0;
try{
System.out.println("Enter the Fno");
a=scn.nextInt();
System.out.println("Enter the Second number :");
b=scn.nextInt();
c=a/b;
System.out.println("Result :"+c);
}
catch (ArithmeticException e){
	e.printStackTrace();
}//end catch block

catch(NullPointerException e){
e.printStackTrace();
}catch(ClassCastException e){
	e.printStackTrace();
}catch(NumberFormatException e){
	System.out.println("only enter the integer number ");
//	System.out.println(e.toString());
//System.out.println(e.getMessage());
//1e.printStackTrace();
}catch(IOException e){
e.printStackTrace();
}

	}//end mm
}//end class
