import java.io.BufferedReader;
import java.io.*;
class Division1 { 
     private static int a;
	private static int  b;
	public static void main(String[] args) {
		int c=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try  {
	System.out.println("Enter the first number :");
	a=Integer.parseInt(br.readLine());
	System.out.println("Enter the saecond number :");
	b=Integer.parseInt(br.readLine());
	 c=a/b;
	System.out.println(c);
}//end try block
catch (ArithmeticException e){
	e.printStackTrace();
}//end catch block
catch(IOException e){
e.printStackTrace();
}
catch(NullPointerException e){
e.printStackTrace();}
catch(ClassCastException e){e.printStackTrace();
}catch(NumberFormatException e){
	//System.out.println("only enter the integer number ");
//	System.out.println(e.toString());
System.out.println(e.getMessage());
//1e.printStackTrace();

}
	}//end main 
}//end class
