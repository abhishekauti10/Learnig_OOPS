package learning_OOPS;

// Heirarchy Inheritance >> Single parent multiple childs
class Parent{
	
	void display(int a) {
		
		System.out.println(a);
	}
	
}

class Child1 extends Parent{
	
	void show(int b) {
		
		System.out.println(b);
	}
	
}

class Child2 extends Parent{
	
	void view(int c) {
		
		System.out.println(c);
	}
}


public class HeirarchyInheritance {

	public static void main(String[] args) {
		
		Child1 c1 = new Child1();
		
		Child2 c2 = new Child2();
		
		c1.display(100);
		c1.show(200);
		
		c2.display(3);
		c2.display(4);

	}

}
