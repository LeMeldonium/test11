import java.util.Scanner; 
public class test23 { 
	public static void main (String args []) {
		Scanner scan = new Scanner(System.in);
		int q=1, L, i=0, k=0;
		String Input, Output="", A="", B="";
		char c=' ';
		System.out.println("Введите набор букв для кодирования");
		Input = scan.nextLine();
		L = Input.length();
		while (i<L) {
			A += Input.charAt(i);
			c = Input.charAt(i);
			if (c>='0'&&c<='9') {
				k =k*10+Integer.parseInt(A);}
			else {
				for (int j=1;j<=k;j++) {
				Output+=A;}
				k=0;}
			A ="";
			i++;}
		System.out.println(Output);}
	}
