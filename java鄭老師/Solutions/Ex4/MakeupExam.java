public class MakeupExam {
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int score = sc.nextInt();
		if(score>=40 && score<60)
			System.out.println("參加補考");
		else
			System.out.println("不需(得)參加補考");			
	}
}