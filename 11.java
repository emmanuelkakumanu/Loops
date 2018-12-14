
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
		switch(n%2)
		{
			case 0 : System.out.println("Even Number");break;
			case 1 : System.out.println("Odd Number");break;
		}
	}
}
