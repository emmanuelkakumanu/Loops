
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
		int tmp=n,rev=0;
		while(n>0)
		{
			int t=n%10;
			rev=(rev*10)+t;
			n=n/10;
		}
		if(tmp==rev)
		System.out.println("Palindrome");
		else
		System.out.println("Not a Palindrome");
	}
}
