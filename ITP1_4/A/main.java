import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String strArr[] = str.split(" ");

		int a, b;

		a = Integer.parseInt(strArr[0]);
		b = Integer.parseInt(strArr[1]);

		int d, r;
		double f;

		d = a/b;
		r = a%b;
		f = (double)a/b;

		System.out.printf("%d %d %.5f\n", d, r, f);
	}
}