import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Even_Prime
{
	public static void main(String [] a)throws Exception
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Even & Odd ");
		System.out.println("Prime or not ");
		System.out.println("");
		System.out.println("Choose your option = ");
		int ch=Integer.parseInt(bf .readLine());
		
		switch(ch)
		{
			case 1:
				//	System.out.println("case1" +evenOdd());
				evenOdd(1);
				break;
				
			case 2:
				
				//System.out.println("case2" + isPrime());
				isPrime(1);
				break;
			default :
				System.out.println("exit");
		}
		
		
	}
	
	public static boolean  evenOdd(int value)  
	{
		int n;
		System.out.println("Enter the value=");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		
		if(n % 2 == 0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		return true;
	}
	
	public static boolean isPrime(int value) 
	{
		int temp,n1;
		boolean isPrime=true;
		System.out.println("Enter the value=");
		Scanner input1=new Scanner(System.in);
		n1=input1.nextInt();
		
		for (int i = 2; i <= n1 / 2; i++)   
        {  
                    temp = n1 % i;  
                    if (temp == 0)   
                    {  
                        isPrime = false;  
                        break;  
                    }  
        }  
        //If isPrime is true then the number is prime else not  
         if (isPrime) 
		 {
			System.out.println(n1 + " is a Prime Number");  
		 }
         else
		 {
			 System.out.println(n1 + " is not a Prime Number");  
		 } 
		 return true;
	}
}