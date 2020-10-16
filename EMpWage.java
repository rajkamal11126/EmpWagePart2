//Welcome to Employee Wage Simulation 
public class EMpWage
{
	static final int isFullTime=1;
	static final int isPartTime=2;
	static int workingDays=20;
	static final double randomValue=Math.floor(Math.random()*10)%2;
	static final int empRatePerHr=20;
	static int salary;
	static int empHrs;

	public static void getEmpHrs()
	{
		for(int i=0; i<=workingDays; i++){
			switch(randomValue)
			{
			case 1:
				empHrs=8;
				break;
			case 2:
            empHrs=4;
				break;
         default :
				empHrs=0;
			}
		salary=empRatePerHr*empHrs;
		totalSalary=totalSalary+salary;
	}
		System.out.println("Total Salary="+totalSalary);
	}
	public static void main(String args[])
	{
		getEmpHrs();
	}
}
