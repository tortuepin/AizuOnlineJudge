import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		int x;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		x = Integer.parseInt(str);

		System.out.println(x*x*x);
	}
}