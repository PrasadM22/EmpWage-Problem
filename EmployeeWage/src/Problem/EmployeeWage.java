package Problem;

public class EmployeeWage {
	
	public  int Calculate_Wage(int Emp_Rate_Per_Hour, int Num_of_Working_Days, int Max_Hrs_In_Month)
	{   
		final int Is_Part_Time = 1;
	    final int Is_Full_Time = 2;
	    
		int totalEmpHrs = 0, totalEmpWage = 0, totalWorkingDays = 0;
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
	System.out.println("Total Emp Wage Company_1:"+obj.Calculate_Wage(20, 20, 100));
	System.out.println("Total Emp Wage Company_2:"+obj.Calculate_Wage(10, 2, 10));
}
}