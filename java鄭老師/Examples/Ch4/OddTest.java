public class OddTest {
	public static void main(String[] args) {
		java.util.Scanner scanner = 
		new java.util.Scanner(System.in);
		
		System.out.print("��J���: ");
		int input = scanner.nextInt();

		if(input % 2 == 0) //�p�G�l�Ƭ� 0
			System.out.println(input + " �O����");

		if(input % 2 != 0) //�p�G�l�Ƥ��� 0
			System.out.println(input + " �O�_��");
		
	}
}
