import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int h, m, s;

		String str = br.readLine();
		s = Integer.parseInt(str);

		h = s/3600;
		m = s/60;
		m = m%60;
		s = s%60;

		System.out.println(h + ":" + m + ":" + s);

	}
}