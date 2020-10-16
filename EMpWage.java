//Welcome to Employee Wage Simulation 
public class EmpWage
{
	static final int isFullTime=1;
	static final double randomValue=Math.floor(Math.random()*10)%2;
	static final int empRatePerHr=20;
	static int salary;
	static int empHrs;

	public static void getEmpHrs()
	{
		if(randomValue==isFullTime)
		{
			empHrs=8;
		}
		else
		{
			empHrs=0;
		}
	}
	salary=empRatePerHr*empHrs;
	System.out.println("salary= "+salary);
	public static void main(String args[])
	{
		getEmpHrs();
	}
}
