package technical;
import java.util.Scanner;
public class tech1 
{
	public static void main(String[] args)
	{
		Scanner in = new  Scanner(System.in);
		int P;
		float T,R,SI;
		P = in.nextInt();
		R = in.nextFloat();
		T= in.nextFloat();
		SI = P*T*R / 100;
		System.out.println("Simple Interest : " + SI);
	}

}



