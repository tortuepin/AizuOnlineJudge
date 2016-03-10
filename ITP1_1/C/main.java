import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b;


		String str = br.readLine();
		String strArr[] = str.split(" ");

		a = Integer.parseInt(strArr[0]);
		b = Integer.parseInt(strArr[1]);

		System.out.println(a*b + " " + (a*2 + b*2));
	}
}