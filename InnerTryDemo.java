class InnerTryDemo { 
	public static void main(String[] args) {
try {
	int a=Integer.parseInt(args[0]);
//int a='s';
	System.out.println("a :"+a);
	try{
		int[] ia=new int[a];
		System.out.println("Size of array :"+ia.length);
	}//end inner try
	catch (NegativeArraySizeException e) {
		int[] ia=new int[3];
		System.out.println("array size :"+ia.length);
	}//end inner catch
	int b=a+20;
	System.out.println("B value :"+b);
}//end outer try bl
catch (ArrayIndexOutOfBoundsException e)
{
	System.out.println("only int pass value :");
}//end oute catch
catch(NumberFormatException e){
e.printStackTrace();
}




		//System.out.println("Hello World!");
	}//end mm
}//end class
