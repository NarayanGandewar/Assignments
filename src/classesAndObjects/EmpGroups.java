package classesAndObjects;

public class EmpGroups {

	public static void main(String[] args) {
		//Create Employees object
		Employees emp = new Employees();
		
		 // Arrays to store employee names 
		String[] empNames = emp.employeeNames;
		
		// Arrays to store employee IDs
		
		int[] empIds = emp.employeeIds;
		
		//Printing the each employee's name along with their corresponding ID.
		
		System.out.println("Employee Name:" + emp.employeeNames[0] + ", Employee ID: " + emp.employeeIds[0]);
		System.out.println("Employee Name:" + emp.employeeNames[1] + ", Employee ID: " + emp.employeeIds[1]);
		System.out.println("Employee Name:" + emp.employeeNames[2] + ", Employee ID: " + emp.employeeIds[2]);
		
		

	}

}
