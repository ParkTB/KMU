import java.util.*;
public class random
{

	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		System.out.println("난수를 생설할 횟수는?");
		int b = a.nextInt();
		Scanner e = new Scanner(System.in);
		System.out.println("원하는 난수 값은 0부터 시작해서 모두 몇 개인가?");
		int c = e.nextInt();
		Random r = new Random();
		int d[] = new int[b];
		int f[] = new int[c];
		int k;
		for(int i=0; i<b; i++) {
			d[i] = r.nextInt(c);
		}
		for(k = 0; k<c; k++) {
			f[k] = 0;
			for (int j=0; j<d.length; j++) {
				if (d[j]==k)
				    f[k] = (f[k]+1);
				
			}
		    System.out.println(k + " " + f[k]);
		}
	}
}
