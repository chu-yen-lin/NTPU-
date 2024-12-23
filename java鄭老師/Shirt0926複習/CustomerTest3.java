public class CustomerTest3{
 public static void main(String[] args){
   Customer cust1 = new Customer();
   Customer cust2 = new Customer();
   int i = 3;
   
   
   cust1.customerID=1;
   cust1.name="Mary Smith";
   cust1.emailAddress="mary.smith@gmail.com";
   cust2.customerID=2;
   cust2.name="Frank Jones";
   cust2.emailAddress="frank.fones@gmail.com";
   
   System.out.println("====客戶一資訊====");
   System.out.println("編號:"+cust1.customerID);
   System.out.println("姓名:"+cust1.name);
   System.out.println("Email:"+cust1.emailAddress);
   System.out.println("==================");
   
   System.out.println("====客戶二資訊====");
   System.out.println("編號:"+cust2.customerID);
   System.out.println("姓名:"+cust2.name);
   System.out.println("Email:"+cust2.emailAddress);
   System.out.println("==================");
   
   cust2=cust1;
   System.out.println("cust2=cust1;....");
 System.out.println("====客戶一資訊====");
   System.out.println("編號:"+cust1.customerID);
   System.out.println("姓名:"+cust1.name);
   System.out.println("Email:"+cust1.emailAddress);
   System.out.println("==================");
   
   System.out.println("====客戶二資訊====");
   System.out.println("編號:"+cust2.customerID);
   System.out.println("姓名:"+cust2.name);
   System.out.println("Email:"+cust2.emailAddress);
   System.out.println("==================");
}
public void tesa(){
	
}

}
