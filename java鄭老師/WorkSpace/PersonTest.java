public class PersonTest{
	public static void main(String[] args){
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("輸入名字: ");
	String fn = sc.nextLine();
	System.out.println("輸入電話: ");
	String ph = sc.nextLine();
	Person p1 = new Person(fn, ph);
	System.out.println("輸入姓氏: ");
	String ln = sc.nextLine();
	p1.addLastName(ln);
	p1.displayInfo();
	
	}
	
}