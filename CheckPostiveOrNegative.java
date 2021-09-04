package Week1.day1;

public class CheckPostiveOrNegative 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Change the value accordingly i.e,20,-20,0
byte number=-20;

if(number==0)
{
	System.out.println("The given number is  neither Positive nor negative");
}
else if(number<0)
{
	System.out.println("The "+number+" is Negative");
}
else if(number>0)
{
	System.out.println("The "+number+" is Positive");
}
   }

}
