package Problem;

public class EmployeeWage {
	public static final int Is_Part_Time = 1;
    public static final int Is_Full_Time = 2;
	final int Emp_Rate_Per_Hour;
	final int Num_of_Working_Days;
	final int Max_Hrs_In_Month;
	private int totalEmpWage;
	//Constructor 
	public EmployeeWage(int Emp_Rate_Per_Hour,int Num_of_Working_Days, int Max_Hrs_In_Month) {
		this.Emp_Rate_Per_Hour = Emp_Rate_Per_Hour;
		this.Num_of_Working_Days=Num_of_Working_Days;
		this.Max_Hrs_In_Month = Max_Hrs_In_Month;
		
	}

	//Method
	public void  Calculate_Wage()
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
		System.out.println("Day#: " + totalWorkingDays + "EMp Hr:" + empHrs);
	}
		totalEmpWage = totalEmpHrs + Emp_Rate_Per_Hour;
	}
	@Override
	public String toString() {
		return "Total Emp Wage for Company is: " + totalEmpWage;
		}
	
	public static void main(String[] args)
	{	

	System.out.println("Welcome to Employee Wage Computation");
	
	EmployeeWage Company_1 = new EmployeeWage(20 ,2, 10);
	EmployeeWage Company_2 = new EmployeeWage(10 , 4, 20);
	Company_1.Calculate_Wage();
	System.out.println(Company_1);
	Company_2.Calculate_Wage();
	System.out.println(Company_2);
	
}
}
