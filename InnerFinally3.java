class InnerFinally3 {
static void  m1(){
try{
	System.out.println("in outer try  start :");
	     try{
		System.out.println("in inner try  start :");
		System.out.println(10/0);
	}catch (NullPointerException e) {
	System.out.println("in inner catch  start :");
	}
	//System.out.println("After try/catch/finally:");
	finally{System.out.println("in inner finally :");

	}
}
catch (NullPointerException e){
System.out.println("in outer catch  start :");
}finally{
System.out.println("in outer finally ");

}//end outer finally 
System.out.println("in  outer After/try/catch start :");
}//end m1 method 


	public static void main(String[] args) {
	m1();
		//System.out.println("Hello World!");
	}
}
