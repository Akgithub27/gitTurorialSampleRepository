package udemy;

public class operators {
public static void main(String args[])
{
	shouldWakeUp(true,1);
	shouldWakeUp(false,2);
	shouldWakeUp(true,8);
	shouldWakeUp(true,-1);
}
public static void shouldWakeUp(boolean barking , int hourOfDay)
{
	if((hourOfDay<8 || hourOfDay>22) && barking==true)
	{
		barking = true;
		System.out.println(barking);
		
	}
	if((hourOfDay>0 || hourOfDay>23) ||barking==false)
	{
		barking = false;
		System.out.println(barking);
		
	}
	
}
}

