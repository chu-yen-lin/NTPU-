public class CustomerTest {

    public static void main(String[] args) {
        Customer cust1 = new Customer();
		Customer cust2 = new Customer();
		cust1.display();
		System.out.println();
		cust2.display();
        cust1.setCustomerInfo(1, "Harry", "234 Maple St.", "02-9876-5432");
        cust2.setCustomerInfo(2, "Sally", "567 Oak St.", "04-2345-6789", "sally@gmail.com");      
        
        cust1.display();
		System.out.println();
		cust2.display();
		
		System.out.println("cust2=cust1.....");
		cust2=cust1;
		
		cust1.display();
		System.out.println();
		cust2.display();
                   
        
    }
    
}