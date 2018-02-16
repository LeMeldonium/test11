import java.util.Scanner; 
public class test24 {
	public static void main (String args []) {
		Scanner scan = new Scanner(System.in);
		int Sum, stop, abs=0, q=1, n=3, kolvo = 0;	
		boolean cikl=false;
		n=4;
		System.out.println("укажите количество монет размена");
		n = scan.nextInt();
		if (n>0) {
		int m=n+2;
		int j[]=new int [m];
		int k[]=new int [n];
		n--;
		for (int i=0; i<=n; i++) {
			System.out.println("укажите монету размена");
			k[i] = scan.nextInt();	
			j[i+1] = 0;}
		System.out.println("введите сумму");
		Sum=scan.nextInt();
		stop = 0;
		j[stop]=Sum+1;		
		while (n>=q){
			while (j[1]<=Sum) {
			for (j[n+1]=stop;j[n+1]<=Sum;) { 					
				if (j[n+1]==Sum) {
					abs=Sum;
					for (int w=n-1;w>=0;w--) {
						abs-=j[w+1];}
					System.out.printf("%d по "+k[n]+" копеек ",abs/k[n]);
					for (int w=n-1;w>=0;w--) {
					System.out.printf(", %d по "+k[w]+" копеек ",j[w+1]/k[w]);}
					System.out.println();
					kolvo++;}
					cikl=true;
					j[n+1]+=k[n];}
			if (j[1]==Sum) {
				j[1]++;}
			while (cikl) {
				if (n>=q) {
				if (j[n-q+1]/*+k[n-q]*/<=Sum){
					j[n-q+1]+=k[n-q];
					cikl=false;
					stop = 0;
					for (int w=0;w<n;w++) {
						stop+=j[w+1];}
					q=1;}
				else {
					j[n-q+1]=0; 
				q++;}}
				else {cikl=false;}}
			if (stop>=Sum) {cikl=true;}}
			n--;}
		if (kolvo>1) System.out.println("Число вариантов равно:"+kolvo);
		else System.err.println("Введённая сумма слишком мала или её невозможно разменять");}
		else {System.out.println("Введено не корректное число монет размена");}
}}