import java.util.*;
public class random
{

	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		System.out.println("������ ������ Ƚ����?");
		int b = a.nextInt();
		Scanner e = new Scanner(System.in);
		System.out.println("���ϴ� ���� ���� 0���� �����ؼ� ��� �� ���ΰ�?");
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
