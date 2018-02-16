import java.util.Scanner; 
public class test22 { 
	public static void main (String args []) {
		Scanner scan = new Scanner(System.in);
		int q=1, L, k=1;
		String Input, Output="", A="", B="";
		System.out.println("Введите набор букв для кодирования");
		Input = scan.nextLine()+" ";
		L = Input.length();
		A += Input.charAt(0);
		for (int i=1;i<L; i++) {
			B = "";
			B += Input.charAt(i);
			if (A.charAt(0)==B.charAt(0)) {
				k++;
				q = 0;}
			else {
				Output=Output+k+A;
				A=B;
				k=1;
				q = 1;}
		}
		System.out.println(Output);
	}
}