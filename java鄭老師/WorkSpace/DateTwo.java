public class DateTwo{
private int day;
	private int month;
	private int year;
	public int getDay(){
	return day;}
	public int getMonth(){
	return month;}
	
	public int getYear(){
	return year;}

	public int setDay(int day){
	if(day>0 & day<=31)
		this.day=day;
	else
		System.out.println("日期錯誤");}
	
	public int setDay(int day){
	if(day>0 & month<=31)
		this.day=day;
	else
		System.out.println("日期錯誤");}
	
	public int setYear(int day){
	if(Year>0 & day<=31)
		this.day=day;
	else
		System.out.println("日期錯誤");}
	
	}