class Example5{ 
public static void main(String[] args) {	
	m1();
System.out.println("After method executing :");
		//System.out.println("Hello World!");
	}//end main method 

	static void  m1(){
	try{
		System.out.println("in try block :");
	System.out.println(10/0);
	}catch (NullPointerException  e ){
	System.out.println("in catch block :");

	}//end catch block
	catch(ArithmeticException e){
	e.printStackTrace();
	}
	finally {
	System.out.println("in finally :");
	return ;
	}//end finally 

	}//end method m1

}//end class
