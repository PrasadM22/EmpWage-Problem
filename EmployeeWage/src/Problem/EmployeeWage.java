package Problem;

public class EmployeeWage {
	public static final int Is_Part_Time = 1;
    public static final int Is_Full_Time = 2;
    
    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWageArray;
    public EmployeeWage()
    {
    	companyEmpWageArray = new CompanyEmpWage[5];
    }
    private void addCompanyEmpWage(int Emp_Rate_Per_Hour,int Num_of_Working_Days, int Max_Hrs_In_Month)
    {
    	companyEmpWageArray[numOfCompany] = new CompanyEmpWage(Emp_Rate_Per_Hour, Num_of_Working_Days, Max_Hrs_In_Month);
    	numOfCompany++;
    }
   
    private void Calculate() {
    	for(int i=0;i<numOfCompany;i++)
    	{	
    		companyEmpWageArray[i].setTotalEmpWage(this.Calculate_Wage(companyEmpWageArray[i]));
    		System.out.println(companyEmpWageArray[i]);
    	}
    }
	//Method
	public int  Calculate_Wage( CompanyEmpWage companyEmpWage)
	{   	
		//Veriables
		int totalEmpHrs = 0, totalEmpWage = 0, totalWorkingDays = 0;
		while( totalEmpHrs <= companyEmpWage.maxHourPerMonth && totalWorkingDays < companyEmpWage.numofWorkingDays)
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
		System.out.println("Day#: " + totalWorkingDays + "EMp Hr:" + empHrs);
	}
		return totalEmpHrs * companyEmpWage.empRatePerHour;
	}
	
	public static void main(String[] args)
	{	
	System.out.println("Welcome to Employee Wage Computation");
	EmployeeWage empWageBuilder = new EmployeeWage();
	empWageBuilder.addCompanyEmpWage(20, 2, 10);
	empWageBuilder.addCompanyEmpWage(10, 4, 20);
	empWageBuilder.Calculate();
}
}
