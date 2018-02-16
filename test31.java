import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer; 
public class test31 {
	static int F (int arg) {
		int f=1;
		for (int i=2; i<=arg;i++) {
			f *= i;
		}
		return f;
	}
	static int rec (int arg1, int arg2) {
		if (arg1==0) {
			return arg2+1;}
		else {
			if (arg2==0) {return rec(arg1-1,1);}
			else {return rec(arg1,arg2-1);}
		}
	}

	static int ACK (int arg1, int arg2) {
		int i=0;//{{1}, {1}};
		if (arg1==0) {
			return arg2+1;}
		else if (arg2==0) return ACK(arg1-1,1);
			else return ACK(arg1-1,ACK(arg1, arg2-1));
	}
	static int FIB (int arg1) {
		int a = 1, b = 1, i=2, fib=2;
		while (i<arg1) {
			fib = a+b;
			a = b;
			b = fib;
			i++;
		}
		return fib;
	}
	public static void main (String args []) {
		int N=0, j=0, i=0, arg1, arg2;
		boolean flag; 
		String k, stroka, input[];
		try { FileInputStream fstream = new FileInputStream ("C://data.txt");
		BufferedReader br = new BufferedReader (new InputStreamReader (fstream));
		
		String strline;
		while ((strline = br.readLine()) != null) {
			N++;
			System.out.print(strline);
			input = strline.split(" ");
			flag = true;
			k = input[0];
			while (flag) {
				if (k.equals("F")) {
					System.out.println(" = " + F(Integer.parseInt(input[1])));}
					else if (k.equals("ACK")) {
						System.out.println(" = " + ACK(Integer.parseInt(input[1]),Integer.parseInt(input[2])));}
						else if (k.equals("FIB")) {
							System.out.println(" = " + FIB(Integer.parseInt(input[1])));}
				else {System.err.println(" - неизвестная функция. Проверьте правильность ввода или обратитесь к разработчику");}
				flag = false;
			}
		}
		if (N==0) {System.err.println("Файл пуст");}
		}
		catch (IOException e ) {
			System.err.println("Файл data.txt в корневом каталоге диска C не найден");
		}
        }
}