package technical;
import java.util.Scanner;
public class tech3 {

	public static void main(String[] args)  
	{
		Scanner sc=new Scanner(System.in);

		int flag=0;
		System.out.println("Enter the size of the arryay");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the key element");
		int key =sc.nextInt();

			for(int j=0;j<n;j++)
			{
				if(a[j]==key)
				{
					System.out.println("Element found at location " + j);
					flag=1;
					
				}
			}
			if(flag==0)
				System.out.println("Element not found");
			
				

	}

}
