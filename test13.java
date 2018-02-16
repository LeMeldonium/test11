import java.util.Scanner; 
public class test13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L; 
        String input;
        boolean chet = false;                               
        int max[]=new int[2];
        System.out.println("Введите любой текст для проверки на палиндром");    
        input = scan.nextLine();
        L = input.length()-1;
        for (int i=0; i<=L;i++)
        	if (input.charAt(i) == input.charAt(L-i)) {
        		chet = true;}
        	else {chet = false;
        	i = L;}
        if (chet) {System.out.println("Палиндром");}
        else {System.out.println("Не палиндром");}
    }
}