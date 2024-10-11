package learning_OOPS;


//POLYMORPHISM
public class Overloading {
	
	int a = 10; int b = 15;
	
	void sum() {
		System.out.println(a+b);
	}
	
	
	//overloading does not all changes in return type
//	int sum() {
//		return(a+b);
//	}
	
	//Dtatype is given
	void sum(int x, int y) {
		System.out.println(x+y);
	}
	
	//datatype is different
	void sum(int x, double y) {
		System.out.println(x+y);
	}
	
	//No. of parameters in different
	void sum(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloading sum1 = new Overloading();
		
		sum1.sum();
		sum1.sum(2, 100);
		sum1.sum(20, 20.55);
		sum1.sum(10, 20, 300);

	}

}
