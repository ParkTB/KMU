import java.util.*;
import java.math.*;
public class cirlce {
	static double a;
	public static void circle(double a) {
		double b = a*a*Math.PI;
		System.out.println("���� �ѷ� : "+2*a*Math.PI+"���� ���� : "+b);
	}
	public static int compareRadius(double radius, double radius2) {
		final double EPSILON = 1E-12;
		double diff = radius - radius2;
		if (Math.abs(diff) < EPSILON) return 0;
		if (diff < 0) return -1;
		if (diff>0) return 1;
		return 2;
	}
	public static void main(String[] args) 
    { 
		System.out.println("�������� �Է��ϼ���");
		Scanner in = new Scanner(System.in);
		a = in.nextDouble();
		circle(a);
		System.out.println("ũ�⸦ ���ϰ� ���� ���� �������� �Է��ϼ���");
		Scanner kk = new Scanner(System.in);
		double c = kk.nextDouble();
		System.out.println(compareRadius(a,c));
    }
	
}
