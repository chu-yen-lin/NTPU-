public class EmployeeTest{

public static void main (String args[]) {
    System.out.println(Employee.getAddress());	
    System.out.println(Employee.getPhone());	
	Employee e1 = new Employee("Sam");
	Employee e2 = new Employee("David");
	System.out.println(e1.getAddress());
	System.out.println(e2.getPhone());
	System.out.println(e1.call());
	System.out.println(e2.call());
	
	//System.out.println("\n\n公司搬家改電話!");
	//Employee.setAddress("台北中山區公園路");
	e1.phone = "02-2446-6277";
	e2.phone = "2112-3322";
	
	//System.out.println(Employee.getAddress());
	//System.out.println(Employee.getPhone());
	//System.out.println(e1.getAddress());
	System.out.println(e1.getPhone());
	System.out.println(e2.getPhone());
	System.out.println(e1.call());
	System.out.println(e2.call());


}}