class InnerTryDemo2 { 
	public static void main(String[] args) {
		System.out.println("Wellcome try block :");
		//System.out.println(10/0);
	try{
	System.out.println("outer try block");
	//System.out.println(10/0);
	try{
	System.out.println("inner try block :");
	System.out.println(10/0);
	}catch(Exception e){
	System.out.println("inner catch block");
    System.out.println(10/0);
	//e.printStackTrace();
	}//end inner catch
	}catch(Exception e){
	System.out.println("outer catch block :");
	e.printStackTrace();
	}//end outer catch
	}//end mm
}//end class
