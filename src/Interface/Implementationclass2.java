package Interface;

public class Implementationclass2 implements Interfaceclass2
{

	@Override
	public void method1() 
	{
			System.out.println("method 1 - Implementationclass2");
	}

	@Override
	public void method2() 
	{
		System.out.println("method2 - Implementationclass2");	
	}
	
	public static void main(String[] args) 
	{
		Implementationclass2 x = new Implementationclass2();
		
		x.method1();
		x.method2();
		x.method3();
	}
}
