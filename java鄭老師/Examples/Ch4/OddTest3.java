public class OddTest3 {
	public static void main(String[] args) {
		java.util.Scanner scanner = 
		new java.util.Scanner(System.in);
		
		System.out.print("輸入整數: ");
		int input = scanner.nextInt();
		
		int remain = input % 2;

		System.out.println(input + " 是" +
			((remain==0) ? "偶數" : "奇數"));	
	}
}