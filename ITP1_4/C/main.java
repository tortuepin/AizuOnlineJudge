import java.io.*;


class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){

			String str = br.readLine();
			String p; 
			String strArr[] = str.split(" ");
			double a = Double.parseDouble(strArr[0]);
			double b = Double.parseDouble(strArr[2]);
			

			p = strArr[1];
			int i=0;
			double ans;
			
			if("?".equals(p)){
				break;
			}
			else if("+".equals(p)){
				ans = a+b;
				System.out.println((int)ans);
			}
			else if("-".equals(p)){
				ans = a-b;
				System.out.println((int)ans);
			}
			else if("*".equals(p)){
				ans = a*b;
				System.out.println((int)ans);
			}
			else if("/".equals(p)){
				ans = a/b;
				System.out.println((int)ans);
			}
			
			/*switch(p){
				case "+":
					ans = a+b;
					System.out.println((int)ans);
					break;
				case "-":
					ans = a-b;
					System.out.println((int)ans);
					break;
				case "*":
					ans = a*b;
					System.out.println((int)ans);
					break;
				case "/":
					ans = a/b;
					System.out.println((int)ans);
					break;
				case "?":
					i=4;
					break;
				default:
					break;
			}
			if(i==4)
				break;
				*/

			}



		}
	}