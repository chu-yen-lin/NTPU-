public class DateFour{
private int day =1;
private int month =1;
private int year =2024;

public DateFour(int year, int month, int day){
	this.setDate(year, month, day);
}

public int getDay(){
return day;}

public int getMonth(){
return month;}

public int getYear(){
return year;}

public String getDate(){
	return year+"/"+month+"/"+day;
}
public void setDate(int year, int month, int day){
if(year>=1900 & year<=2024){
	if(month>=1 & month<=12){if(day>0 & day<=this.calcDaysInMonth(year,month)){
this.year = year;
this.month = month;
this.day = day;
	} else 
	System.out.println("日期錯誤!");
	}else 
System.out.println("月份錯誤!");

}else 
	System.out.println("年份錯誤!");
}

private int calcDaysInMonth(int y,int m){
	int days = 0; 
switch(m){
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
	days= 31;
	break;
	case 4:
	case 6:
	case 9:
	case 11:
	days= 30;
	break;
	case 2:
	if(isLeapYear(y))
		days=29;
	else
		days=28;
}	
return days;
}
private boolean isLeapYear(int y){
if((year%4==0&&year%100!=0)||year%400==0)
	return true;
else
	return false;
}



}