import java.util.Arrays;
import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt(); // m - mas length
        int[] mas = new int[m];
        for (int i=0;i<m;i++) mas[i]=in.nextInt();
        in.close(); //make array "mas" from input
        System.out.println();
        
        int count=1,count2=0; //counting position
        for (int i=1;i<mas.length;i++) {
            if (mas[i]>mas[i-1]) {
                count++; 
                if (count==mas.length) count2=count;
                
            }
            else if (count>count2) {count2=count; count=1;}
            else count=1;
        }
        System.out.println(count2); //we have count2 == dimension of cut
        
        int[] cut = new int[count2]; //for temp cut
        int[] cutCompare = new int[count2]; //to know if cut[] is real
        StringBuilder outp = new StringBuilder();
        
        counting:
        for (int i=0;i<mas.length;i++) {
            for (int j=0;j<count2;j++) {
                if (i+j<mas.length) cut[j]=mas[j+i];
                else break counting;
            } //we have cut[] with numbers

            cutCompare = Arrays.copyOf(cut,count2);
            Arrays.sort(cutCompare);
            if (Arrays.equals(cut,cutCompare)) 
                outp.append(Arrays.toString(cut)).append(" \n"); 
            
        }
        System.out.println(outp.toString().replaceAll("[\\[]|[\\,]|[\\]]", ""));
    }
}