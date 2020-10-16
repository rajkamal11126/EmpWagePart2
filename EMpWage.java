//Welcome to Employee Wage Simulation 
public class EmpWage
{
	static final int isFullTime=1;
	public static void Attendance()
	{
		double randomValue=Math.floor(Math.random()*10)%2;
		if(randomValue == isFullTime)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}
	public static void main(String args[])
	{
		Attendance();
	}
}
