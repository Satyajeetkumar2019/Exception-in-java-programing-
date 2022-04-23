class Example6{ 
public static void main(String[] args) {	
System.out.println("in main method ");
m1();
		//System.out.println("Hello World!");
	}//end main method 
	static void  m1(){
	try{
		System.out.println("in try block :");
	System.out.println(10/0);
	}
	catch (NullPointerException  e ){
	System.out.println("in catch block :");

	}//end catch block
	finally {
	System.out.println("in finally :");
	int[] is=new int[-5];
	}//end finally 
	}//end method m1
}//end class
