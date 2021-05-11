package Problem;

public class EmployeeWage
{
public static void main(String[] args)
{
		System.out.println("Welcome to Employee Wage Computation");
		//Constant
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR =20;
		//Computation
		int empHrs=0;
		int empWage=0;
		double empCheck = Math.floor(Math.random()*10)%2;
		if(empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
		if(empCheck == IS_FULL_TIME)
			empHrs=8;
		else
			empHrs=0;
		empWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage:"+empWage);
}
}