import java.util.Scanner; 
public class test12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputint=0, i=3; 
        String output = "";
        boolean chet = true;
        System.out.println("Введите целое положительное число");    
        inputint = scan.nextInt();
        if (inputint>=2) output += inputint + "=";
        else System.out.println("У введённого числа нет простых множителей");
        while (chet) {        	
        	if (inputint % 2 == 0) {
        		inputint/=2;
        		output += 2;
        		if (inputint !=1) {output += "*";}
        	}
        	else {
        		chet = false;}
        	
        }
        	while (i*i<=inputint) {
        	if (inputint % i == 0) {
        		inputint/=i;        		
        		output += i + "*";}
        	else i+=2;}
        		i+=2;
        if (inputint > 1) {output += inputint;}
        System.out.println(output);}}