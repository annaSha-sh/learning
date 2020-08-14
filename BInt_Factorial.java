import java.math.*;
import java.util.*;
public class BInt_Factorial {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        BigInteger f = BigInteger.valueOf(1);
        for (int i=1; i<=value; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        System.out.print(f);
        in.close();
    }
}