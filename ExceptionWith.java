import java.util.Scanner;
class ExceptionWith { 
private static int a;
private static int b;
private static int c;
	public static void main(String[] args) {
	
		Scanner scn=new Scanner(System.in);
	try
	{
		System.out.println("Enter the first number ");
      a=scn.nextInt();
	//  scn.nextInt();
      System.out.println("Enter the second number :");
      b=scn.nextInt();
	//  scn.nextInt();
	  c=a/b;
	  System.out.println(c);
	}
	catch(ArithmeticException e){
	System.out.println("Arithmetic exception");}
	catch (NegativeArraySizeException e){
		System.out.println("NegativeArraySizeException ");
	}catch(NumberFormatException  e){
	System.out.println("numberFormatException ");
	}//
finally{
	c=0;
System.out.println("finallyb block ");
}
	}//end mm
}//end class
