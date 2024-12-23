class Sale2 {
public static void main(String[]args) {
java.util.Scanner sc = new java.util.Scanner (System.in,"Big5");



System.out.print ("輸入價格:");

int sale = sc.nextInt();
int total = 0;
if(sale>=5000)
	total = (int)(sale*0.7);
else if(sale>=3000)
	total = (int)(sale*0.8);
else if(sale>=2000)
	total = (int)(sale*0.85);
else if(sale>0)
	total = (int)(sale*0.9);
if(total!=0)
	System.out.print("價格為"+total+"元");
else
System.out.print("消費金額錯誤:"+sale);}
}
