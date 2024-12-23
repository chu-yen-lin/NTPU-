public class MathTools{
 
 public static double getHypotenus(double bottom, double height){
 return Math.sqrt(bottom*bottom+height*height);}
 
 public static boolean isPrimeNum(int num){
	 for(int i=2; i<num; i++){
		 //if(num%i==0)
 return false;} return true;}
		 
 
 public static int getFC(int cels){
	 return 9*cels/5+32;
 }
 public static double getBMI(int height, int weight){
	 double h =(double)height/100.0;
	 return weight/Math.pow(h,2);
 }

 
 
 
 
 
 



public static void main(String[] args){
	//System.out.println("底為6,高為8的直角三角形, 斜邊長為"+MathTools.getHypotenus(6,8));
	//System.out.println("底為5,高為12的直角三角形, 斜邊長為"+MathTools.getHypotenus(5,12));
	//System.out.println("88"+(MathTools.isPrimeNum(88)?"是":"不是")+"質數");
	//System.out.println("89"+(MathTools.isPrimeNum(89)?"是":"不是")+"質數");
	//for(int i=0; i<=200; i+=10)
	//System.out.println("攝氏"+i+"度等於華氏"+MathTools.getFC(i)+"度");
	System.out.println("身高178公分,體重67公斤的BMI數值為"+MathTools.getBMI(178,67));
}
}



	 