package Problem;

public class EmployeeWage {
	public static final int Is_Part_Time = 1;
    public static final int Is_Full_Time = 2;
	final int Emp_Rate_Per_Hour;
	final int Num_of_Working_Days;
	final int Max_Hrs_In_Month;
	//Constructor 
	public EmployeeWage(int Emp_Rate_Per_Hour,int Num_of_Working_Days, int Max_Hrs_In_Month) {
		this.Emp_Rate_Per_Hour = Emp_Rate_Per_Hour;
		this.Num_of_Working_Days=Num_of_Working_Days;
		this.Max_Hrs_In_Month = Max_Hrs_In_Month;
		
	}
	//Method
	public int Calculate_Wage()
	{   	
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
	EmployeeWage Compony_1 = new EmployeeWage(20, 20, 100);
	EmployeeWage Compony_2 = new EmployeeWage(10, 2, 10);
	System.out.println("Total Emp Wage Company_1:"+Compony_1.Calculate_Wage());
	System.out.println("Total Emp Wage Company_2:"+Compony_2.Calculate_Wage());
}
}