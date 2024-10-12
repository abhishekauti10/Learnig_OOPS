package learning_OOPS;

class X {
	
	void id(int a) {
		System.out.println(a);
	}
	
	
	void name(int b) {
		System.out.println(b);
	}
}


class Y extends X{
	
	//Overriding 			>> Not possible without Inheritance
	void id(int a) {
		System.out.println(a*a);
	}
	
	//Overloading			>> Polymorphism concept >> Possible without Inheritance
	void name(int b, int c) {
		System.out.println(b+c);
	}
}

public class OverridingVsOverloading {

	public static void main(String[] args) {
		
		X x1 = new X();
		
		Y y1 = new Y();
		
		x1.id(2);
		x1.name(20);
		
		y1.id(4);
		y1.name(3);
		y1.name(2, 3);
		
		

	}

}
