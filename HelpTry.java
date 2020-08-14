import java.util.Scanner;

public class HelpTry {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        enough: //метка выхода, если нажали 0
        while (true) { //работает, пока не будет выхрд break
            System.out.print ("\nLogic help:\n1. if\n2. switch\n3. for\n4. while\n0 - Exit\nChoose number:");
            int n = in.nextInt(); //ввод № пункта меню
            switch (n) {
                case 1: //if
                    System.out.println("\nIF:\nif(condition) operator;\n\n1 - MENU\n0 - EXIT");
                    int m = in.nextInt(); //запрос о возврате в меню или выходе
                    if (m==0) break enough; //выход, если m==0
                    break;
                case 2: //switch
                    System.out.println("\nSWITCH\nswitch (var) {\n\tcase 1: (operator);\n\t\tbreak;\n\tcase 2:operator;\n\t\tbreak;\n\tdefault: (operator);\n\n1 - MENU\n0 - EXIT");
                    m = in.nextInt();
                    if (m==0) break enough;
                    break;
                case 3: //for
                    System.out.println("\nFOR:\nfor (i=0; i>0; i++) operator;\n\n1 - MENU\n0 - EXIT");
                    m = in.nextInt();
                    if (m==0) break enough;
                    break;
                case 4: //while
                    System.out.println("\nWHILE:\nwhile (condition) operator;\n\n1 - MENU\n0 - EXIT");
                    m = in.nextInt();
                    if (m==0) break enough;
                    break;
                case 0:
                    break enough; //выход из меню из программы
                default:
                    System.out.println("\nYou've wrote wrong number =(. Try again.");
            }
        }        
        in.close();
        System.out.println("Good bye!");
    }
}
