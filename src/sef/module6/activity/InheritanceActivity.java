package activity;

public class InheritanceActivity {

	public static void main(String[] args) {
		
		// Create Person object p. Write code to and set name of Person as Sarah Johnson
		// and age as 21
		Person_I person = new Person_I("Sarah Johnson", 21);
		
		System.out.println("-----------------------------");
		//Create Employee object e and 
		// set salary as 70000, title as Developer, age as 32 and name as Shawn Cun
		Employee_I employee = new Employee_I();
		employee.setSalary(70000);
		employee.setTitle("Developer");
		employee.setAge(32);
		employee.setName("Shawn Cun");
		
		// Print Info using Employee object
		System.out.println("-----------------------------");
		System.out.println("Employee's Name is   : " + employee.getName());
		System.out.println("Employee's Age is    : " + employee.getAge());
		System.out.println("Employee's Title is  : " + employee.getTitle());
		System.out.println("Employee's Salary is : " + employee.getSalary());

		// Print Info using Person object
		System.out.println("-----------------------------");
		System.out.println("Person's Name is    : " + person.getName());
		System.out.println("Person's Age is     : " + person.getAge());
	}

}
