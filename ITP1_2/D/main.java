import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String strArr[] = str.split(" ");

		int w, h, x, y, r;

		w = Integer.parseInt(strArr[0]);
		h = Integer.parseInt(strArr[1]);
		x = Integer.parseInt(strArr[2]);
		y = Integer.parseInt(strArr[3]);
		r = Integer.parseInt(strArr[4]);

		if(x+r<=w && x-r>=0 && y+r<=h && y-r>=0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}