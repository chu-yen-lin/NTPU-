public class SwitchStringStatement1{    
	public static void main(String args[]){        
		String gender = "Male";
		String lastName = "�G";
		String nameFormat;
		switch (gender){
			case "Male":
				nameFormat = lastName + "����";
				break;
			case "Female":
				nameFormat = lastName + "�p�j" ;
				break;
			default:
				nameFormat = lastName + "�g" ;
		}        
		System.out.println(nameFormat + "�A�n!" );
	}
}
