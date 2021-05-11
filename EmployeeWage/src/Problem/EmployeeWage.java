package Problem;

public class EmployeeWage {
	int totalEmpHrs, totalEmpWage, totalWorkingDays;
	public static final int Is_Part_Time =1;
	public static final int Is_Full_Time =2;
	public static final int Emp_Rate_Per_Hour = 20;
	public static final int Num_of_Working_Days= 20;
	public static final int Max_Hrs_In_Month = 100;
	
	EmployeeWage(){
		int totalEmpHrs = 0, totalEmpWage = 0, totalWorkingDays = 0;
	}
	
	public  int Calculate_Wage()
	{
		while( totalEmpHrs <= Max_Hrs_In_Month && totalWorkingDays < Num_of_Working_Days)
		{	int empHrs =0 ;
			totalWorkingDays++;
	 	int empCheck = (int)Math.floor(Math.random() * 10) % 3;
		switch(empCheck) {
		case Is_Full_Time:
			empHrs = 8;
			break;
		case Is_Part_Time:
			empHrs=4;
			break;
		default:
			empHrs= 0;
		}
		totalEmpHrs += empHrs;
		int empWage = empHrs * Emp_Rate_Per_Hour;
		totalEmpWage += empWage;
		System.out.println("Emp Wage :" + empWage );
	}
		return totalEmpWage;
	}
	public static void main(String[] args)
	{	
	EmployeeWage obj = new EmployeeWage();
	System.out.println("Total Emp Wage:"+obj.Calculate_Wage());
}
}