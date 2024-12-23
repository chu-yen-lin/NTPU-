public class CustomerTest {
	public static void main(String[] args){
	
	
	
	Customer cust1 = new Customer();
	Customer cust2 = new Customer();
	
	cust1.setCustomerInfo(1,"Mary Smith","234 Mapl Str.", "0987654321");
	cust2.setCustomerInfo(2,"frank","567 oal Str.", "0944554321", "Kary.Smith2@gmail.com");
	
	cust1.display();
	System.out.println();
	cust2.display();
	System.out.println("cust2=cust1...");
	
	cust2=cust1;
	
	
	
	}}
	