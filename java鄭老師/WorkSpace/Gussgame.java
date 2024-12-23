public class Gussgame{
	public static void main(String[] args){
	if(args.length==0 ||args[0].equalsIgnoreCase("help")){
	System.out.println("程式用法: java Gussgame[1-5數字]");
	}else if(!args[0].matches("[-]?\\d+")){
		System.out.println("猜測內容須為數字");
	}else {
	
		int guess = Integer.parseInt(args[0]);
		if(guess>5||guess<1){
			System.out.println("猜測數字需在1-5之間");
		}else{
			int answer = (int)(Math.random()*5)+1;
			if(guess==answer){
				System.out.println("猜對");
			}else{
	System.out.println("猜錯了, 答案是"+answer);
	}
	}
	}
	}}