import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String strArr[] = str.split(" ");
		int a, b, c, count=0;

		a = Integer.parseInt(strArr[0]);
		b = Integer.parseInt(strArr[1]);
		c = Integer.parseInt(strArr[2]);

		for(int i=a; i<=b; i++){
			for(int t=1; t*i<=c; t++){
				if(i*t==c)
					count++;
			}
		}

		System.out.println(count);
	}
}