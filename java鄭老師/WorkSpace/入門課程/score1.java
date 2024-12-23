class score {
public static void main(String[]args) {
java.util.Scanner sc = new java.util.Scanner (System.in,"Big5");



System.out.print ("這次考試分數:");

int pts = sc.nextInt();

if(pts>=40&& pts<60 )
	System.out.print("是");
else 
System.out.print("否");}
}
