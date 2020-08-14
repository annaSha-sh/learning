public class MultyTable {
    public static void main (String args []) {
        System.out.println("Multiply table:");
        for (int j=1; j<=9; j++) {
            for (int i=1; i<=9; i++) {
                if ((j>=3)&&(i<j)&&(i!=1)) System.out.print ("X\t");
                else System.out.print ((i*j)+"\t");
            }
            System.out.println();
        }
    }
}