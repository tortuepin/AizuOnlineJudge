import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=1; i>0; i++)
		{
			String str = br.readLine();
			int num = Integer.parseInt(str);
			if(num==0)
				break;
			System.out.println("Case "+ i + ": " + num);
		}

	}
}