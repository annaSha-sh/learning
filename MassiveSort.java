import java.util.Arrays;
import java.util.Scanner;

public class MassiveSort {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        Arrays.sort(a1);
        Arrays.sort(a2);
        
        System.out.println("Sorted");
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        int[] c = new int[a1.length+a2.length]; //c[] dim.

        System.out.println("Empty c[]:"+Arrays.toString(c));

        filling:
        for (int k=0, i=0, j=0; k<c.length; k++) {
            c[k]=(a1[i]<=a2[j])?a1[i++]:a2[j++]; //find min from two elements

            System.out.println("Filling c[]:"+Arrays.toString(c));
            System.out.println("i:"+i);
            System.out.println("j:"+j);

            if (i>=a1.length) {for (int m=k+1; m<c.length; m++) {c[m]=a2[j]; j++;} break filling;} //if massiv a1 is over
            if (j>=a2.length) {for (int m=k+1; m<c.length; m++) {c[m]=a1[i]; i++;} break filling;} //if massiv a2 is over
        }
        return (c); 
    }
    public static void main (String args []) {
        Scanner in = new Scanner(System.in);
        System.out.println("Length a1:");
        int a1l = in.nextInt();
        System.out.println("Length a2:");
        int a2l = in.nextInt();
        
        int[] b1 = new int[a1l];
        int[] b2 = new int[a2l];
        int i = 0; 
        System.out.println("Input a1:");
        for (int x:b1) {b1[i]=in.nextInt(); i++;}
        i = 0;
        System.out.println("Input b1:");
        for (int x:b2) {b2[i]=in.nextInt(); i++;}
        
        System.out.println(Arrays.toString(b1));
        System.out.println(Arrays.toString(b2));
        in.close();
        System.out.println(Arrays.toString(MassiveSort.mergeArrays(b1, b2)));
    }
}