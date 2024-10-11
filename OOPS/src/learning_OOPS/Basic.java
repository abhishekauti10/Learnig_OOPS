package learning_OOPS;

//Class
public class Basic {
	
	// Variables
	int ID;
	String Name;
	String Designation;
	int SALARY;
	
	//Menthod
	void display() {
		
		System.out.println(ID);
		System.out.println(Name);
		System.out.println(Designation);
		System.out.println(SALARY);
		
	}
	
	//Main Method
	public static void main(String[] args) {
		
		// Object
		Basic     emp1     =   new Basic();
    //classname //variable   //constructo = [new + className + ()]
		
		
		emp1.ID = 123;
		emp1.Name = "RAM";
		emp1.Designation = "qa";
		emp1.SALARY = 10000;
		
		emp1.display();

	}

}
