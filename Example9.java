class Example9 { 
static int m1(int i){
while(i==5){
try{

try{
i=10;
}//end inner try
finally{
i=20;
}
i=30;
return i;
}//end outer try
finally{
if(i==30)
	break;
}
}
return 40;
}//end m1
	public static void main(String[] args) {
		System.out.println(m1(5));}}

