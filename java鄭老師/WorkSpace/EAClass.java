public class EAClass{
public static void main(String[] arg){
java.util.Scanner sc = new java.util.Scanner(System.in);
System.out.print("輸入星期(Mon/Tue/Wed/Thu/Fri/Sat/Sun):");
String weekday = sc.next();
String class1 ="";
switch(weekday){
	case"Mon":
	class1 = "鋼琴課";
	break;
	case"Tue":
	class1 = "圍棋課";
	break;
	case"Wed":
	class1 = "英文課";
	break;
	case"Thu":
	class1 = "桌球課";
	break;
	case"Fri":
	class1 = "跆拳道";
	break;
	case"Sat":
	class1 = "電腦課";
	break;
	case"Sun":
	class1 = "作文課";
	break;
	
}
System.out.println(weekday+"小明要上"+class1);
}}