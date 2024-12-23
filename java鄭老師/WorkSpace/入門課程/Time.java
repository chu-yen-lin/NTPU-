public class Time {
	public static void main(String[] args) {
	    int  year = 3 ; 
	    int  month = year*12 ; 
	    int  ds = year*365 ; 
	    int  hours = ds*24 ;
	    int  mins = hours*60 ;
	    int  seconds = mins*60 ;
	    long  milSecs = (long)seconds*1000L ;
		 
		System.out.println(year + "年等於");
		System.out.println(month + "個月等於");
		System.out.println(ds + "天等於");
		System.out.println(hours + "小時等於");
		System.out.println(mins + "分鐘等於");
		System.out.println(seconds + "秒鐘等於");
		System.out.println(milSecs + "毫秒");
		
		

		
	}
} 