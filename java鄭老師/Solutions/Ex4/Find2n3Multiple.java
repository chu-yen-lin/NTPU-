public class Find2n3Multiple {
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("��J���: ");
		int num = sc.nextInt();
		System.out.print(num);
		if(num%2==0){
			System.out.print("�O2������");
			if(num%3==0)				
				System.out.print(",�]�O3������");
		} else {
			if(num%3==0)				
				System.out.print("�O3������");
			else				
				System.out.print("���O2�����Ƥ]���O3������");	
		}
		System.out.println();
	}
}