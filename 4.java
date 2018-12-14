
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
		System.out.println("Odd numbers under "+n+":");
		for(int i=0;i<=n;i++)
		{
			if(i%2==1)
			System.out.print(i+" ");
		}
		System.out.println("\nEven numbers under "+n+":");
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			System.out.print(i+" ");
		}
	}
}
