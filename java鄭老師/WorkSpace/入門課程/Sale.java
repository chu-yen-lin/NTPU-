class Sale {
public static void main(String[]args) {
java.util.Scanner sc = new java.util.Scanner (System.in,"Big5");



System.out.print ("輸入價格:");

int sale = sc.nextInt();

if(sale >= 0 && sale <2000)
System.out.print("九折後價格為"+(sale*0.9));

else if(sale >= 2000 && sale < 3000)
System.out.print("八五折後價格為"+(sale*0.85));

else if(sale >= 3000 && sale < 5000)
System.out.print("八折後價格為"+(sale*0.8));
else if(sale >= 5000)
System.out.print("七折後價格為"+(sale*0.7));
}
}
