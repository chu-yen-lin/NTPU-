public class DoWhileDemo {
	public static void main(String[] args) {
		java.util.Scanner scanner = 
			new java.util.Scanner(System.in);

		int answer =30;
		int input = 0;		
		do{
			System.out.print("��J�Ʀr: ");
			input = scanner.nextInt();
		} while(input!=answer);

		System.out.println("���߱z!�q��F!");
	}
}
