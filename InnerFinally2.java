class InnerFinally2  {
static int  m1(){
try{
	System.out.println("in outer try  start :");
	     try{
		System.out.println("in inner try  start :");
	}catch (NullPointerException e) {
	System.out.println("in inner catch  start :");
	}
	//System.out.println("After try/catch/finally:");
	finally{System.out.println("in inner finally :");
	return 10;
	}
}
catch (NullPointerException e){
System.out.println("in outer catch  start :");
}finally{
System.out.println("in outer finally ");
return 30;
}//end outer finally 
//System.out.println("in  outer After/try/catch start :");
//return 30;
}//end m1 method 


	public static void main(String[] args) {
	m1();
		//System.out.println("Hello World!");
	}
}
