package learning_OOPS;


//SINGLE INHERITANCE till B
//MULTI LEVEL INHERITANCE till C
class A {
	
	int a = 100;
	
	void display() {
		System.out.println(a);
	}
}

class B extends A {
	
	int b = 200;
	
	void show() {
		System.out.println(b);
	}
}

class C extends B{
	
	int c = 300;
	
	void view() {
		System.out.println(c);
	}
}



public class InheritanceType {

	public static void main(String[] args) {
		
		A aobj = new A();
		B bobj = new B();
		C cobj = new C();
		
		System.out.println(bobj.a);
		System.out.println(bobj.b);
		//System.out.println(bobj.c);
		
		System.out.println(aobj.a);
		//System.out.println(aobj.b);
		//System.out.println(aobj.c);
		
		
		System.out.println(cobj.a);
		System.out.println(cobj.b);
		System.out.println(cobj.c);
		
		aobj.display();
		
		bobj.display();
		bobj.show();
		
		cobj.display();
		cobj.show();
		cobj.view();
		
	}

}
