package learning_OOPS;

// INHERITANCE TYPE
// Overriding = same method reused by modifiying it without changing its parameters
class Bank{
	
	double roi() {
		return 0;
	}
}

class ICICI extends Bank{
	
	double roi() {
		return 11;
	}
}

class SBI extends Bank{
	
	double roi() {
		return 22;
	}
}


public class Overriding {

	public static void main(String[] args) {
		
		ICICI ir = new ICICI();
		SBI sr = new SBI();
		
		System.out.println(ir.roi());
		System.out.println(sr.roi());

	}

}
