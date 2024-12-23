public class Person {
private StringBuilder name;
private StringBuilder phoneNumber;

public Person(String firstName, String phone){
name = new StringBuilder(firstName);
phoneNumber = new StringBuilder(phone);
}

public void addLastName(String lastName){
	
	name.append("");
	name.append(lastName);
	//0298226688
	phoneNumber.insert(2, "-");
	//02-98226688
	phoneNumber.insert(2, "-");
	//02-9822-6688
	
}

public void displayInfo(){
	System.out.println("姓名:" + name.toString());
	int pos = name.indexOf("");
	System.out.println("姓氏: " +name.substring(pos+1));
	System.out.println("名字: " +name.substring(0, pos));
	System.out.println("姓名長度:" + name.length());
	System.out.println("姓名容量:" + name.capacity());
	System.out.println("姓名:" + phoneNumber.length());
	System.out.println("姓名:" + phoneNumber.capacity());
}

}
