public class Times{
	public static void main(String[] args){
		int years = 3;
		int months = years*12;
		int days = years*365;
		int hours = days*24;
		int minutes = hours*60;
		int seconds = minutes*60;
		long millSeconds = (long)seconds*1000;
		
		System.out.println(years+"�~����");
		System.out.println(months+"�Ӥ�");
		System.out.println(days+"��");
		System.out.println(hours+"�p��");
		System.out.println(minutes+"����");
		System.out.println(seconds+"��");
		System.out.println(millSeconds+"�@��");
	}
}