package technical;
import java.text.DecimalFormat;
import java.util.Scanner;
public class CI{
	public static void main(String[] args) {
		Scanner in = new  Scanner(System.in);
		int p;
		float t, r, c;
		p = in.nextInt();
		r = in.nextFloat();
		t = in.nextFloat();
		c = p *(float) Math.pow(1+r/100, t);
		System.out.println("Compound Interest : " + 
				(new DecimalFormat("#.00").format(c)));
	}

}
