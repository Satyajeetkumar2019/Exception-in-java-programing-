class Example4{ 
public static void main(String[] args) {	
System.out.println(m1());
		//System.out.println("Hello World!");
	}//end main method 


	static int m1(){
	try{
		System.out.println("in try block :");
	System.out.println(10/0);
	}
	catch (NullPointerException  e ){
	System.out.println("in catch block :");

	}//end catch block
	finally {
	System.out.println("in finally :");
	}//end finally 
	return 30;
	}//end method m1
}//end class
