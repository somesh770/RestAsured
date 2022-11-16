package inheritance;

public class Superclass  extends Supermostclass
{
/////////////////////////////////////////////////////////////////
	/// single level inheritance

//   int a = 100;   /// non static variable - non return type
//	 
//   public void method1()    /// non static method 
//{
//   int b = 200;
//   
//   System.out.println("non static method "+b);
//	
// }
/////////////////////////////////////////////////////////////////
	/// multilevel inheritance
// extends propertis of supermost class
	
//public static void main(String[] args) 
//{
//Superclass x = new Superclass();  //// create object
//		
//System.out.println(x.a);      /// calling varible
//		
//x.method1();


		
//} 
	public static void main(String[] args) {
		
		Superclass x = new Superclass();
		
		System.out.println(x.a);       /// calling variable
		
		x.method1();      /// calling method
				
	}
   
}
