package Problem;

public class CompanyEmpWage {
	public final int empRatePerHour;
	public final int numofWorkingDays;
	public final int maxHourPerMonth;
	public int totalEmpWage;
	
	public CompanyEmpWage(int empRatePerHour,int numofWorkingDays,int maxHourPerMonth){
		this.empRatePerHour = empRatePerHour;
		this.numofWorkingDays = numofWorkingDays ;
		this.maxHourPerMonth = maxHourPerMonth;
		
	}
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	
}
