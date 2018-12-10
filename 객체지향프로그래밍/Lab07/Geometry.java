import java.util.Scanner;
import java.math.*;

public class Geometry {
	public static void circleCircumference() {
		System.out.println("반지름을 입력하세요");
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		System.out.println("원의 둘레 : "+ 2*Math.PI*a);
	}
	
	public static void circleArea() {
		System.out.println("반지름을 입력하세요");
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		System.out.println("원의 넓이 : "+ Math.PI*a*a);
	}
	public static void main(String[] args) 
    { 
		circleCircumference();
		circleArea();
    }
}
