import java.util.Scanner;
public class WeekDays {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. to get the weekdays");
		
		int a=sc.nextInt();	 
			if (a==1)
		 
		  {
			  System.out.println("Monday");  
		  }
		  if (a==2)
		  {
			  System.out.println("Tuesday");  
		  }
		  if (a==3)
		  {
			  System.out.println("Wednesday");  
		  }
		  if (a==4)
		  {
			  System.out.println("Thursday");  
		  }
		  if (a==5)
		  {
			  System.out.println("Friday");  
		  }
		  if (a==6||a==7)
		  {
			  System.out.println("Weekend");  
		  }
		   if (a<1||a>7) 
		   { 
			  System.out.println("enter valid input");    
		   }
	}
}