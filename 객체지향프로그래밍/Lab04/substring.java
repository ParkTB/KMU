
public class substring
{

	public static void main(String[] args)
	{
		String str = new String("The quick brown fox jumps over the lazy dog");
		String a = str.substring(0,1);
		String b = str.substring(2,3);
		String c = str.substring(22,24);
		String d = str.substring(21,22);
		String e = str.substring(24,26);
		String f = str.substring(16,17);

		String h = str.substring(5,6);
		String i = str.substring(42,43);
		String j = str.substring(6,7);
		String k = str.substring(31,32);
		
		System.out.print(a+b+c+d+e+f+h+i+j+k);
	}
}
