package learning_OOPS;

interface Shape{
	 
	int length = 10; 					// static + final by default
	int width = 20;						// static + final by default
	
	void circle();						// Abstract method
	
	default void square(){
		System.out.println("Square of interface");
	}
	
	static void rectangle(){
		System.out.println("Rectangle of interface");
	}
	
}

public class InterfaceDemo implements Shape {
	
	int a = 2;
	int b = 3;
	
	public void circle(){
		System.out.println("Circle of abrstract method");
	}
	
	public void triangle(){
		System.out.println("triangle of same classs");
	}

	public static void main(String[] args) {
		
		// CASE 1 
		InterfaceDemo id = new InterfaceDemo();				// Variable type is class
		
		id.circle();					// Abstract
		id.square();					// Default
		id.triangle();					// Belongs to this class only
		Shape.rectangle(); 				// Static method can directly access from interface
		
		System.out.println(Shape.length * Shape.width);
		//System.out.println(Shape.a * Shape.b); 			// Not alolowed
		System.out.println(id.length * id.width);
		System.out.println(id.a * id.b);
		
		// CASE 2
		Shape sh = new InterfaceDemo();						// Variable type is interface
				
		sh.circle();					// Abstract
		sh.square();					// Default
		//sh.triangle();				// Not possible as it is not from interface
			
		Shape.rectangle(); 				// Static method can directly access from interface
		System.out.println(sh.length * sh.width);
		//System.out.println(sh.a * sh.b);					// Not allowed
		
	
	}
}