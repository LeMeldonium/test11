import java.util.Scanner; 
public class test11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputint, maxN1, i=0; 
        boolean flag = true;
        String input;
        int max[]=new int[2];
        System.out.println("Введите любую букву для выхода.");       
        while (i>= 0) {       	
            System.out.println("Введите целое число: ");
            if(scan.hasNextLine() && !(input = scan.nextLine()).equals("")) { 
            	i++;
            		try {
            			inputint = Integer.parseInt(input);        	  
            			if (i<=2) {
            				max[i-1]=inputint;
            				if (i==2){
            					flag = false;
            					if (max[0]>max[1]){maxN1=max[0];
            					max[0]=max[1];
            					max[1]=maxN1;}
            					System.out.println(max[0]);}}            	  	
            			else {
            				if (max[1] <= inputint) {
            					for (int l=1; l>=0; l--) {
            						maxN1=max[l];
            						max[l]=inputint;
            						inputint=maxN1;}
            				}
            				else {
            					if (max[0]<inputint) {
            						maxN1=max[0];
            						max[0]=inputint;
            						inputint=maxN1;
            					}}	
            				System.out.println(max[0]);}}
            		catch (NumberFormatException e) {i=-2;}	  	  	           
            }
        }
        if (flag) System.err.println("Введено слишком мало чисел");
        else System.out.println("Требуемое число - "+max[0]);
        }
	}