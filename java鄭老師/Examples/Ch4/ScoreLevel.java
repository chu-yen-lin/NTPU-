public class ScoreLevel {
	public static void main(String[] args) {
		java.util.Scanner scanner = 
		new java.util.Scanner(System.in);
		
		System.out.print("��J����: ");
		int score = scanner.nextInt();

		if(score >= 90)
			System.out.print("�o A ");
		else if(score >= 80 && score < 90)
			System.out.print("�o B ");
		else if(score >= 70 && score < 80)
			System.out.print("�o C ");
		else if(score >= 60 && score < 70)
			System.out.print("�o D ");
		else 
			System.out.print("�o E(���ή�)");
	}
}
