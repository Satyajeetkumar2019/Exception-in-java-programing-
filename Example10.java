class Example10 { 
static int m1(int i){
	System.out.println("in m1 start :");
while(i==5){
	System.out.println("in while  start :");
try{
System.out.println("in try  start :");
try{
	System.out.println("in inner try  start :");
i=10;
}//end inner try
finally{
	System.out.println("in inner finally  start :");
i=20;
}
i=30;
return i;
}//end outer try
finally{
	System.out.println("in outer finally  start :");
if(i==30)
	System.out.println("in  if condiation  start :");
	break;
//continue;
}
}
return 40;
}//end m1
	public static void main(String[] args) {
		System.out.println(m1(5));}}

