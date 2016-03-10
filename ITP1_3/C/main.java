import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String str = br.readLine();
			String strArr[] = str.split(" ");
			int a, b;
			a = Integer.parseInt(strArr[0]);
			b = Integer.parseInt(strArr[1]);
			

			if(a == 0 && b == 0){
				break;
			}
			else if(a < b){
				System.out.println(a + " " + b);
			}
			else{
				System.out.println(b + " " + a);
			}

		}

	}
}