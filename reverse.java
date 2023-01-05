package technical;
import java.util.Scanner;
public class tech1 
{
	public static void main(String args[])
	{
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the arryay");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0,j=n-1;i<n/2;i++,j--)
		
		
		{
			a[i]=(a[i]+a[j])-(a[j]=a[i]);
		}
		
		System.out.println("reverse order");
		for(int i=0;i<n;i++)
		{
		System.out.println(a[i]);
		}
	}
}
