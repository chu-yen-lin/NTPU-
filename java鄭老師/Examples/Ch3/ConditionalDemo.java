public class ConditionalDemo {
	public static void main(String[] args) {
		int i = 2;
		int j = 3;
		int k = 4;

		System.out.println("�ܼƭ�...");
		System.out.println(" i = " + i);
		System.out.println(" j = " + j);
		System.out.println(" k = " + k);

		//&&�B��
		System.out.println("�B...");
		System.out.println(" i<j �B j<k "+((i<j)&&(j<k)));

		//||�B��
		System.out.println("��...");
		System.out.println(" i<j �� k>j "+((i<j)||(k<j)));

		//&&�B��
		System.out.println("�D...");
		System.out.println(" i<j ���D "+(!(i<j)));

	}
}
