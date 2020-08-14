import java.util.*;

public class InputTest {
    public static void main (String args[]) throws java.io.IOException {
        Scanner inn = new Scanner(System.in);

        System.out.print("Name? ");
        String name=inn.nextLine();

        System.out.print("Age? ");
        int age=inn.nextInt();

        System.out.print("Print any letter ");
        char word = (char)System.in.read();

        System.out.println("You are already "+age+", "+name+". "+word);
        

        inn.close();
    }
}