public class CheckPalindrome{
public static boolean isPalin(String str){
	str= str.toLowerCase();
	int low=0, high=str.length()-1;
	while(low<high){
		char c1 = str.charAt(low);
		char c2 = str.charAt(high);
		if (c1!=c2)
			return false;
		low++;
		high--;
		
	}
	return true;


}
public static void main(String[] args){
	java.util.Scanner sc = new java.util.Scanner(System.in, "big5");
	System.out.print("輸入字串 輸入exit結束:");
	String input = sc.nextLine();
	while(!input.equals("exit")){
		System.out.printf("%s %s 迴文%n", input , (isPalin(input)?"是":"不是"));
		System.out.printf("輸入字串");
	input = sc.nextLine();}
	System.out.println("結束");
}}