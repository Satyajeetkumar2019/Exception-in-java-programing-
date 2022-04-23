class A2 { 
	public static void main(String[] args) {
	int a;
	try
	{
		a=20;
		System.out.println(a);
	}catch (ArithmeticException e){
	a=30;
	//b=40;
	}catch(NullPointerException e){System.out.println(a);}
	System.out.println(a);
//	System.out.println(b);
		//System.out.println("Hello World!");
	}
}
