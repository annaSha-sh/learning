import java.util.Scanner;

public class Fibonach {
    public static void main (String args []) {
        Scanner in = new Scanner(System.in);
        int m1=1, m2=1, n = in.nextInt();
        for (int i=1; i<=n; i++) {
            if (i%2==0){
                System.out.print(m2+" ");
                m2+=m1;}
            else {
                System.out.print(m1+" ");
                m1+=m2;}
        }
        in.close ();
    }
}
