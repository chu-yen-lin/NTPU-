public class OddTest2 {
	public static void main(String[] args) {
		java.util.Scanner scanner = 
		new java.util.Scanner(System.in);
		
		System.out.print("輸入整數: ");
		int input = scanner.nextInt();

		if(input % 2 == 0) {
			System.out.println(input + " 是偶數");
		} else {
			System.out.println(input + " 是奇數");
		}
		
	}
}