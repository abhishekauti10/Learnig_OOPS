package learning_OOPS;

public class Encapsulation {
// using AccountForEncap
	
	
	public static void main(String[] args) {
		
		AccountForEncap acc1 = new AccountForEncap();
		
		acc1.setAccNo(1000);
		acc1.setName("RAM");
		acc1.setBalance(222);
		
		System.out.println(acc1.getAccNo());
		System.out.println(acc1.getBalance());
		System.out.println(acc1.getName());

	}

}
