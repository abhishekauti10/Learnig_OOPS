package learning_OOPS;

public class ChildForAbstract12 implements ParentForAbstract1 , ParentForAbstract2 {
	
	public void pa1() {
		System.out.println(l*m);
	}
	
	public void pa2() {
		System.out.println(m+l);
	}

	public static void main(String[] args) {
		
		
		ChildForAbstract12 p1 = new ChildForAbstract12();
		
		p1.pa1();
		p1.pa2();
		
		System.out.println(ParentForAbstract1.l);
		System.out.println(ParentForAbstract2.m);

	}

}
