public class MakeupExam {
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int score = sc.nextInt();
		if(score>=40 && score<60)
			System.out.println("�ѥ[�ɦ�");
		else
			System.out.println("����(�o)�ѥ[�ɦ�");			
	}
}