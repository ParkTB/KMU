import java.util.*;
import java.math.*;
public class cirlce {
	static double a;
	public static void circle(double a) {
		double b = a*a*Math.PI;
		System.out.println("원의 둘레 : "+2*a*Math.PI+"원의 넓이 : "+b);
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
		System.out.println("반지름을 입력하세요");
		Scanner in = new Scanner(System.in);
		a = in.nextDouble();
		circle(a);
		System.out.println("크기를 비교하고 싶은 원의 반지름을 입력하세요");
		Scanner kk = new Scanner(System.in);
		double c = kk.nextDouble();
		System.out.println(compareRadius(a,c));
    }
	
}
