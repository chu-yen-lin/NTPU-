public class PrimeNumber {
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("��J�����:");
		int num = sc.nextInt();
		boolean isPrime = true;
		for(int i=2; i<num; i++){
			if(num%i==0){
				isPrime = false;
				break;
			}
		}
		System.out.println(num+(isPrime?"�O���":"���O���"));
	}
}