import java.util.Scanner;
import java.math.*;

public class Geometry {
	public static void circleCircumference() {
		System.out.println("�������� �Է��ϼ���");
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		System.out.println("���� �ѷ� : "+ 2*Math.PI*a);
	}
	
	public static void circleArea() {
		System.out.println("�������� �Է��ϼ���");
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		System.out.println("���� ���� : "+ Math.PI*a*a);
	}
	public static void main(String[] args) 
    { 
		circleCircumference();
		circleArea();
    }
}
