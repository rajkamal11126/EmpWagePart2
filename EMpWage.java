//Welcome to Employee Wage Simulation 
public class EMpWage
{
	static final int isFullTime=1;
	static final int isPartTime=2;
	static final int workingDays=20;
	static final int maxHrsInMonth=100;
	static int totalHours=0;
	static final double randomValue=Math.floor(Math.random()*10)%2;
	static final int empRatePerHr=20;
	static int salary;
	static int empHrs;

	public static void getEmpHrs()
	{
	while (totalHours<maxHrsInMonth && totalWorkingDays < workingDays ){
		totalWorkingDays++;
		
		switch((int)randomValue)
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
		totalHours=totalHours+empHrs;
		totalSalary=empRatePerHr*totalHours;
	}
	System.out.println("Total Salary="+totalSalary);
	public static void main(String args[])
	{
		getEmpHrs();
	}
}
