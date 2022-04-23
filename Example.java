import java.util.Scanner;
class Example { 
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int a=0;
	int b=0;
	int c=0;
	try{
		System.out.println("Enter the first number ");
	a=scn.nextInt();
	System.out.println("Enter the second number ");
	b=scn.nextInt();
	 c=a+b;
	System.out.println("Result :"+c);
	}catch(ArrayOutofException  e){
	
	System.out.println("error ");
	}catch(ArithmeticException e){
	System.out.println(e.toString());
	}




		System.out.println("Hello World!");
	}//end main methode 
}//end class
