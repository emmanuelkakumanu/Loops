
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0,temp=n;
		while(n>0)
		{
			int r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(temp==sum)
		System.out.print("Armstrong Number");
		else
		System.out.print("Not an Armstrong Number");
	}
}
