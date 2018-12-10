import java.util.*;
public class ÅðÁ÷±Ý
{
	
	public static void main(String[] args)
	{
		double pv;
		double pmt;
		double i;
		double n;
		
		Scanner in = new Scanner(System.in);
		System.out.println("input pmt");
		pmt = in.nextDouble();
		System.out.println("input i");
		i = in.nextDouble();
		System.out.println("input n");
		n = in.nextDouble();
		
		
		
		pv = pmt*(Math.pow(1+i, n-1)/i/Math.pow(1+i, n-1)+1);
		System.out.println("ÅðÁ÷±Ý : " + (int)pv);
	}
}
