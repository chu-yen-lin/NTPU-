public class ForDemo {
	public static void main(String[] args) {
		java.util.Scanner scanner = 
			new java.util.Scanner(System.in);
		
		System.out.print("��J���榸��: ");
		int input = scanner.nextInt();

		for(int i = 0; i < input; i++){
			System.out.println("Hello World!");
		}
	}
}
