class Example2{ 
	static int m1(){
	try{
		System.out.println("in try block :");
	return 10/0;
	}
	catch (ArithmeticException e ){
	System.out.println("in catch block :");
	return 20;
	}//end catch block
	finally {
	
	return 30;
	}//end finally 
	}//end method m1
	public static void main(String[] args) {
	
System.out.println(m1());



		//System.out.println("Hello World!");
	}//end main method 
}//end class
