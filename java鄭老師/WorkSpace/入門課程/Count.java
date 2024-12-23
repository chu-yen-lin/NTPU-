class Count {
public static void main(String[]args) {
java.util.Scanner sc = new java.util.Scanner (System.in,"Big5");
System.out.print("輸入計算範圍:");
int MAX_COUNT = sc.nextInt();

int sum = 0;
for(int i=1; i<=MAX_COUNT;i++)
sum+=i;

System.out.print ("總和是:"+MAX_COUNT+"="+sum);



}
}