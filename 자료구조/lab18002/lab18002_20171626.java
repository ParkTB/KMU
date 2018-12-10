import java.util.*;

/**
 * Lab 002 
 * @version 1.0
 * @author Sanghwan Lee
 * @id 20181234
 */

class LabTest {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		while (true){
			System.err.println("Enter n m :");
			int n = a.nextInt();

			if (n==0)
				System.exit(0);

			int m = a.nextInt();
			if (n<m){
				System.out.println("n은 m보다 큰 숫자여야 합니다.");
				continue;
			}

			int q = Combi(n, m);
			System.out.printf("Combination(%d, %d) : %d\n", n, m, q);

			}

	}
	static int Combi(int n, int m) {
		if (n == m || m==0)
			return 1;
		else
			return Combi(n-1, m-1) + Combi(n-1, m);
	}
}

