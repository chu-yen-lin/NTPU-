public class DaysInMonth{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("��J���:");
		int month = sc.nextInt();
		int days = 0;
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			case 2:
				System.out.print("��J�~��:");
				int year = sc.nextInt();
				if((year%4==0&&year%100!=0)||year%400==0)
					days = 29;
				else
					days = 28;		
		}
		if(days!=0)
			System.out.println(month+"�릳"+days+"��");
		else
			System.out.println("������~:"+month);
	}
}