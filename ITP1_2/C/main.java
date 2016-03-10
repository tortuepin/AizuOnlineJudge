import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String strArr[] = str.split(" ");

		int numArr[] = new int[3];
		int tmp;


		for(int i=0; i<numArr.length; i++){
			numArr[i] = Integer.parseInt(strArr[i]);
		}

		for(int i=0; i<numArr.length; i++){
			for(int t=i; t<numArr.length; t++){
				if(numArr[i] > numArr[t]){
					tmp = numArr[i];
					numArr[i] = numArr[t];
					numArr[t] = tmp;
				}
			}
		}

		System.out.println(numArr[0] + " " + numArr[1] + " " + numArr[2]);


	}
}