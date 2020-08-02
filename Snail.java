import java.util.Scanner;

class Snail {
    public static void main (String args[]) {
        Scanner inn = new Scanner(System.in);
        int h = inn.nextInt();
        int a = inn.nextInt();
        int b = inn.nextInt();
        int high=0, i=0;
        while (high<h) {
            i++;
            high += a;
            if (high<h) high-=b;
        }
        inn.close();
        System.out.print(i);
    }
}
