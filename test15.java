import java.util.Scanner; 
public class test15 {
	public static void main (String args []) {
		int i=0;
		boolean flag = true;
		String input, k;
		Scanner scan = new Scanner(System.in);
		System.out.println("введите строку");
        input=scan.nextLine();
        System.out.println("введите желаемый элемент строки");
        k = scan.nextLine();
        for (i=0;i<=input.length();) {
        	if (input.indexOf(k,i)>=0) {
        		i=input.indexOf(k,i)+1;  //+1 тут лишнее
        		flag = false;
        		System.out.println("Подстрока встречается с " + (i-1) + " позиции");
        		}
        	i++;
        	}
        if (flag)
        	System.err.println("Подстрока не является частью строки");
        }
}
