class Example8{ 
	static int m1(){
	try{
		System.out.println("in try block :");
	return 10;
	}
	catch (ArithmeticException e ){
	System.out.println("in catch block :");
	}//end catch block
	finally {
	System.out.println("in finally Block :");
	if(false){
	return 80;
	}
	}//end finally 
	System.out.println("After the try/catch/finally block :");
	return 20;
	}//end method m1
	public static void main(String[] args) {
	
System.out.println(m1());



		//System.out.println("Hello World!");
	}//end main method 
}//end class
