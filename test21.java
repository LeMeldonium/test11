import java.util.Scanner; 
public class test21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputint, maxN1, maxN2, i=0, n;
        boolean flag = true;
        String input, output="";
        System.out.println("введите n-ый элемент");
        n=scan.nextInt();
        if (n>0) {
        int max[]=new int[n];
        System.out.println("Введите целое число. Для выхода введите любой другой символ");       
        while (i>= 0) {       	
        if(scan.hasNextLine() && !(input = scan.nextLine()).equals("")) { 
        	i++;
          try {
        	  inputint = Integer.parseInt(input);
        	  output+=inputint+", ";
              if (i<=n) {
            	  max[i-1]=inputint;}
              if (i==n) {
            	      flag = false;
            		  for (int k=n; k>0; k--) {
            		   for (int j=1; j<k; j++) {            			
            			 if (max[j-1]>max[j]) {
            				  maxN1=max[j];
            				  max[j]=max[j-1];
            				  max[j-1]=maxN1;}
            		   }
            		  }
              }
              if (i>n) {
            	  if (max[n-1] <= inputint) {
            		  for (int l=n-1; l>-1; l--) {
    					  maxN1=max[l];
    					  max[l]=inputint;
    					  inputint=maxN1;}
            	  }
            	  else {
            		  if (max[0]<inputint) {
            			  for (int k=1; k<n; k++) {
            				  if (max[k]>inputint) {
            					  maxN1=max[k];
            					  max[k]=inputint;
            					  for (int l=k; l>-1; l--) {
            						  maxN2=max[l];
            						  max[l]=maxN1;
            						  maxN1=maxN2;}
            					  k=n;}
            			  }
            		  }
            	  }
              }
          } catch (NumberFormatException e) {  
              i=-2;}           
        }}
        if (flag) System.err.println("Введено слишком мало чисел");
        else {
        	System.out.println("В последовательности чисел " + output);
        	System.out.println(n+"-й по величине элемент равен "+max[0]);}}
        else {System.err.println("Введён не корректный номер");}
    }
}