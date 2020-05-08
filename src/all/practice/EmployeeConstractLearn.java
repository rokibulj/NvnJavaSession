package all.practice;

public class EmployeeConstractLearn {
	
	// This class is template/blueprint for Employee category.
	
	// Constructor: 2 Types- default, parameterized.
	// Constructor name will remain as Class name.
	// Constructor looks like a function but its not.
	// Constructor can not return any value.
	// The moment we create object immediately Constructor will be called. 
	// Constructor Overloading is possible.
	
	// Can I create parameterized with class variable? - YES.
	// It used to initialized class variable.
	// For static value we dont need to pass through constructor.
	// Remember after create class variable scope will change, only for Constructor.
	// THIS keyword uses for: this.classVariable = localVariable.(with same name)
	
	// Right click somewhere, click source, click generate constructor using fields.
	
	
	
	
	
	String empName;
	int empId;
	int empAge;
	String empDept;
	
	public EmployeeConstractLearn(){
		System.out.println("default Constructor.......");
		
	}
	
	public EmployeeConstractLearn(int i){
		System.out.println("default Constructor......." + i);
		
	}
	
	public EmployeeConstractLearn(String b){
		System.out.println("default Constructor......." + b);
		
	}
	
	public EmployeeConstractLearn(String empName, int empId, int empAge, String empDept){
		System.out.println("parameterized Constructor with class variable.");
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empDept = empDept;
		
	}
	
	public static void main(String[] args) {
		
		EmployeeConstractLearn emp = new EmployeeConstractLearn();
		
		emp.empName = "Hassan";
		emp.empId = 100;
		emp.empAge = 26;
		emp.empDept = "Elc";
		
		EmployeeConstractLearn emp1 = new EmployeeConstractLearn("Jony");
		
		EmployeeConstractLearn emp3 = new EmployeeConstractLearn("Md", 001, 33, "Soft");
		EmployeeConstractLearn emp4 = new EmployeeConstractLearn("Rokibul", 002, 34, "QA");
		EmployeeConstractLearn emp5 = new EmployeeConstractLearn("Hassan", 003, 35, "Dev");
		
		System.out.println(emp3.empName+ " "+ emp3.empId+ " "+ emp3.empAge+ " " + emp3.empDept);
		System.out.println(emp4.empName+ " "+ emp4.empId+ " "+ emp4.empAge+ " " + emp4.empDept);
		System.out.println(emp3.empName+ " "+ emp5.empId+ " "+ emp5.empAge+ " " + emp5.empDept);
		
	}

}
