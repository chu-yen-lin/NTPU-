public class NestedWhileDemo {
	public static void main(String[] args) {
		java.util.Scanner scanner = 
			new java.util.Scanner(System.in);
		
		System.out.print("��J��: ");
		int length = scanner.nextInt();

		System.out.print("��J�e: ");
		int width = scanner.nextInt();

		int widthCount = 0;

		while(widthCount < width){
			int lengthCount = 0;
			
			while(lengthCount < length){
				System.out.print("@");
				lengthCount++; 
			} //���h while
		
			System.out.println(); //����
			widthCount++;
		} //�~�h while
	}
}
