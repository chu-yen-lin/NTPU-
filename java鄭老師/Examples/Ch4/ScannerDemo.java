public class ScannerDemo {
   public static void main(String args[]) {
      java.util.Scanner scanner = new java.util.Scanner(System.in);
      
      System.out.print("��J���:");
      int input1 = scanner.nextInt();

      System.out.print("��J�B�I��:");
      double input2 = scanner.nextDouble();

      System.out.print("��J���L��:");
      boolean input3 = scanner.nextBoolean();

	  System.out.print("��J�r��:");
      String input4 = scanner.next();


      System.out.println("��ƿ�J:" + input1);
      System.out.println("�B�I�ƿ�J:" + input2);
      System.out.println("���L�ȿ�J:" + input3);
	  System.out.println("�r���J:" + input4);
      
      scanner.close();
   }
}
