package Problem;

public class EmployeeWage
{
public static void main(String[] args)
{
		System.out.println("Welcome to Employee Wage Computation");
		//Constant
		final int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR =20;
		final int IS_PART_TIME=2;
		final int NUM_OF_WORKING_DAYS = 20;
		int Max_Hrs_In_Month=100;
		//Computation
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		int totalEmpWage=0;
		while(totalEmpHrs<=Max_Hrs_In_Month && totalWorkingDays<NUM_OF_WORKING_DAYS){
		int empHrs=0;
		totalWorkingDays++;
		int empCheck =(int) Math.floor(Math.random()*10)%3;
		if(empCheck == IS_FULL_TIME || empCheck == IS_PART_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
		switch (empCheck) {
		case (IS_FULL_TIME):
		     empHrs=8;
		     break;
		case IS_PART_TIME:
		     empHrs=4;
		     break;
		default:
			empHrs=0;
		}
		totalEmpHrs+=empHrs;
		int empWage = empHrs * EMP_RATE_PER_HOUR;
		totalEmpWage+=empWage;
		System.out.println("Emp Wage:"+empWage);
}
		System.out.println("Total Emp Wage:" + totalEmpWage);
}
}