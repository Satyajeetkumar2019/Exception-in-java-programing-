//Rule in try block and catch block
class  Rule_try_catch {

	public static void main(String[] args) {
	//Rule #01
try{
} catch(Exception e){
	}
finally{}
//.........................................
//Rule #02
try
{
	
}
finally{}
//.......................................
//Rule #03
 /*try{}
finally{}
catch(Exception e){}
*/		
//..........................................
//Rule #04
//try{}
//catch(Exception e){}
//try{}
//int n=90;
//catch(Exception e){}
//.................................
try{
	System.out.println("try block");
	}//end try BL
	catch(Exception e){
	System.out.println("catch block");
	}
	System.out.println("notmal text ");
	try
	{
		System.out.println("another try block");
	}
	catch (Exception e){
	System.out.println("another catch block :");
	}
System.out.println("another block ");
//SOME Special reule 
/*try{}
catch(ArithmeticException e){}
catch(NullPointerException f){}
//catch(){}
//catch(){}
*/
try{}
//catch(Exception j){}
catch(ArithmeticException e){}
catch(NullPointerException f){}
//catch(){}










//finally{}
	}//end mm
}//end class
