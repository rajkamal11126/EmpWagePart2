//Welcome to Employee Wage Simulation 
public class EMpWage
{
	static final int isFullTime=1;
	static final int isPartTime=2;
	static final double randomValue=Math.floor(Math.random()*10)%2;
	static final int empRatePerHr=20;
	static int salary;
	static int empHrs;

	public static void getEmpHrs()
	{
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
	salary=empRatePerHr*empHrs;
	System.out.println("salary= "+salary);
	}
	public static void main(String args[])
	{
		getEmpHrs();
	}
}
