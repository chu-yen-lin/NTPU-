public class WhileDemo {
	public static void main(String[] args) {
		java.util.Scanner scanner = 
			new java.util.Scanner(System.in);
		
		System.out.print("��J���榸��: ");
		int input = scanner.nextInt();

		int count = 0; //�p�ƥ�

		while(count < input){ //�P�_����
			System.out.println("Hello World!");
			count++; //�C������Ỽ�W
		}
	}
}
