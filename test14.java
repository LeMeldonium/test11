import java.util.Scanner; 
public class test14 {
	public static void main (String args []) {
		int i,j,k,n, kolvo = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("введите сумму элемент");
        n=scan.nextInt();		
		for (i=0;i<=n; i+=3)
			for (j=i; j<=n;j+=5)
				for (k=j;k<=n;k+=7)
					if (k==n) {
						System.out.printf("%d по 3 коп, %d по 5 коп, %dпо 7 коп\n", i/3, (j-i)/5, (k-j)/7);
						kolvo++;}
		if (kolvo>1) System.out.println("Число вариантов равно:"+kolvo);
		else System.err.println("Введённая сумма слишком мала или её невозможно разменять");
					}
	}