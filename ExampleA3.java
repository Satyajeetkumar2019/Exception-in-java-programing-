class ExampleA3 { 
	public static void main(String[] args) {
		System.out.println("main start :");
		System.out.println("Result :"+m1(5));
		System.out.println("end main ");
	}//end mm
	static int m1(int x){
		System.out.println("in m1 start ");
		int i=0;
	while(++i<=x){
		System.out.println("in nwhile start :"+i);
	try{
		System.out.println("in try block :"+i);
		return 10/0;
	}finally{
		System.out.println("in finally block :"+i);
		System.out.println("in break exceuting :");
		//continue;
		break;
		}
	}//end loop
	System.out.println("After while loop ");
	System.out.println("end method :");
	return 20;
	}//end m
}
