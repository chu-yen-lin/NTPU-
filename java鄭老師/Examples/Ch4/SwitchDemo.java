public class SwitchDemo {
	public static void main(String[] args) {
		java.util.Scanner scanner = 
		new java.util.Scanner(System.in);

		System.out.print("��J����: ");
		int score = scanner.nextInt();
		int level = (score/10);

		switch(level) {
			case 10:
			case  9:
				System.out.println("�o A ");
				break;
			case  8:
				System.out.println("�o B ");
				break;
			case  7:
				System.out.println("�o C ");
				break;
			case  6:
				System.out.println("�o D");
				break;
			default:
				System.out.print("�o E(���ή�)");
		}
	}
}
