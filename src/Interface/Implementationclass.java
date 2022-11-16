package Interface;

public class Implementationclass implements Interfaceclass
{

	@Override
	public void method1() 
	{
		System.out.println("method 1 - Implementationclass ");
	}

	@Override
	public void method2() 
	{
		System.out.println("method 2 - Implementationclass");	
		
	}

	@Override
	public void menthod3() 
	{
		System.out.println("method 3 - Implementationclass");
	}
	
public static void main(String[] args) 
{
	Implementationclass x = new Implementationclass();
	
	x.method1() ;
	x.method2() ; 
	x.menthod3() ;
	
	
	
}
}
