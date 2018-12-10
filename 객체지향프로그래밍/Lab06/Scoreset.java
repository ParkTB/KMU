import java.util.Arrays;

public class Scoreset 
{ 
	private int [] scores;
	private int ix = 0;
	int sum;
	public Scoreset()
	{
		scores = new int[10];

	}
	public void add(int score)
	{
		scores[ix++] = score;
		int a = 0;
		if (ix==scores.length) {
			int []tmp = new int[scores.length+5];
		for(int i:scores) {
			tmp[a] = i;
			a = a+1;
			}
			scores = tmp;
		}	
	}

	public double averageWithhoutLowest2()
	{
		int low1 = scores[0];
		int low2 = scores[0];
		for(int l=0;l<ix;l++) {
			if(scores[l]<low1) {
				low1 = scores[l];
			    continue;
			}
			if(scores[l]<low2)
				low2 = scores[l];
		}
		for(int n:scores) {
			sum = sum + n;
		}
		sum = sum - low1 - low2;
		double aver = (double)sum/(ix-2);
		return aver;
	}
	public String toString(){
		String t="";
		for (int j : scores) {
			t = (String) (t+j+" ");
		}
		t = ("["+t+"]");
		return t;
	}
	public static void main(String[] args) {
		Scoreset s = new Scoreset();
		s.add(60);
		s.add(70);
		s.add(100);
		s.add(50);
		s.add(70);
		s.add(100);
		s.add(50);
		s.add(70);
		s.add(100);
		s.add(50);
		s.add(70);
		s.add(100);
		s.add(50);
		double v = s.averageWithhoutLowest2();
		System.out.println(v);
		String o = s.toString();
		System.out.println(o);
		System.out.println((double)(60+70+100+70+100+70+100+50+70+100+50)/11);
	}
}