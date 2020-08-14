import java.util.Scanner;

public class Help {
    public static void main (String args[]) {
        System.out.print ("Logic help:\n1. if\n2. switch\n Выберете пункт:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        switch (n) {
            case 1:
                System.out.println("if(condition) operator;");
                break;
            case 2:
            System.out.println("swith (var) {\n\tcase 1: (operator);\n\t\tbreak;\n\tcase 2:operator;\n\t\tbreak;\n\tdefault: (operator);");
                break;
            default:
                System.out.println("You wrote wrong number =(");
        in.close();
        }
    }
}