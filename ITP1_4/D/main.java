import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String nRead = br.readLine();
		String str = br.readLine();
		String strArr[] = str.split(" ");

		int n = Integer.parseInt(nRead);
		int a[] = new int[n];
		int min=1000000, max=-1000000, sum=0;

		for(int i=0; i<n; i++){
			a[i] = Integer.parseInt(strArr[i]);		
		}

		//int sumtmp = a[0];
		for(int i=0; i<n; i++){
			if(a[i]<min){
				min = a[i];
			}
			if(a[i]>max){
				max = a[i];
			}
			sum += a[i];
		}


		System.out.printf("%d %d %d\n", min, max, sum);

	}
}