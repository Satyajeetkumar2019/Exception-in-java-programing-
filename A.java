class A { 
	public static void main(String[] args) {
	int a=10;
	try
	{
		int b=20;
		System.out.println(a);
		System.out.println(b);
	}catch (ArithmeticException e){
	a=30;
	//b=40;
	}
	System.out.println(a);
//	System.out.println(b);
		//System.out.println("Hello World!");
	}
}
