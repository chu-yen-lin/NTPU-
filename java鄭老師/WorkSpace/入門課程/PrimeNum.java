class PrimeNum {
public static void main(String[]args) {
	java.util.Scanner sc = new java.util.Scanner (System.in);
	System.out.print("輸入整數:");
	int num=sc.nextInt();
	checkPrime:{
	
	for(int i=2; i<num; i++){
	if(num%i==0){
		System.out.println(num+"不是質數");
	break checkPrime;
	}
	}
	
	
	System.out.println(num+"是質數");
	
	}}
}
	