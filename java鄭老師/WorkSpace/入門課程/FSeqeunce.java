class FSeqeunce {
public static void main(String[]args) {
java.util.Scanner sc = new java.util.Scanner (System.in,"Big5");
System.out.print("輸入計算範圍");
int MaxValue = sc.nextInt();
int num1=1, num2=1;
System.out.print(num1+","+num2);
int numN = num1+num2;
while(numN<=MaxValue){
     System.out.print(","+numN);
	 num1 = num2;
	 num2 = numN;
	 numN = num1+num2;
}}}