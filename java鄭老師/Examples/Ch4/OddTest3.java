public class OddTest3 {
	public static void main(String[] args) {
		java.util.Scanner scanner = 
		new java.util.Scanner(System.in);
		
		System.out.print("��J���: ");
		int input = scanner.nextInt();
		
		int remain = input % 2;

		System.out.println(input + " �O" +
			((remain==0) ? "����" : "�_��"));	
	}
}