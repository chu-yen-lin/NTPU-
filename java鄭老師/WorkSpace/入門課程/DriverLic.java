class DriverLic {
public static void main(String[]args) {
	java.util.Scanner sc = new java.util.Scanner (System.in);

while(true){
System.out.print("輸入學號(輸入-1離開):");
int id = sc.nextInt();
if(id==-1)
break;
System.out.print("輸入筆試成績:");
int exam1 = sc.nextInt();
if(exam1<85)
	continue;

System.out.print("輸入路考成績:");
int exam2 = sc.nextInt();
if(exam2<70)
	continue;
System.out.print("輸入上路成績:");
int exam3 = sc.nextInt();
if(exam3<70)
	continue;
System.out.println(id+"號取得駕照");
}
}

}
