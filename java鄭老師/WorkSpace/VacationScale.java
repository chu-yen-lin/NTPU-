public class VacationScale {
	public int yearsOfService;
	public int[] vacationDays={10,15,15,15,20,20,25,25,25,25};
	
	
	
	public void displayVacationDays(){
System.out.println("年資有" + yearsOfService +"年,特休有");
if(yearsOfService<=6 &yearsOfService>=0)
System.out.println(vacationDays[yearsOfService] +"天");
else 
	System.out.println(vacationDays[0] +"天");
	}
}
