public class OddTest2 {
	public static void main(String[] args) {
		java.util.Scanner scanner = 
		new java.util.Scanner(System.in);
		
		System.out.print("��J���: ");
		int input = scanner.nextInt();

		if(input % 2 == 0) {
			System.out.println(input + " �O����");
		} else {
			System.out.println(input + " �O�_��");
		}
		
	}
}