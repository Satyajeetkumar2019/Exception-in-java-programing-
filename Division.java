class Division { 

	public static void main(String[] args) {
try
{
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int c=a/b;
	System.out.println(c);
}catch (ArrayIndexOutOfBoundsException e){
	System.out.println("please inter the integer number :");

}catch(NumberFormatException e){
	System.out.println("plese inter the integer number :");

}catch(ArithmeticException e){
System.out.println("plese inter the only enteger number :");
}





		System.out.println("Hello World!");
	}
}
