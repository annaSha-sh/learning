import java.util.ArrayList;
import java.util.Scanner;

public class Poem {
    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder poem = new StringBuilder(); //here will be iur text
        for (String r:roles) { //take a role
            poem.append(r+":\n"); //add role name
            for (int i=0; i<textLines.length; i++) { //take another textline
                if (textLines[i].startsWith(r+":"))  //if textline is good
                    poem.append((i+1)+")"+textLines[i].substring(r.length()+1)+"\n"); //add textline
                
            }
            poem.append("\n"); //add space between roles
        }
        return (poem.toString());
    }
    public static void main (String args []) {
        Scanner in = new Scanner(System.in);
        ArrayList <String> roleA = new ArrayList<>();
        ArrayList <String> textA = new ArrayList<>();
        System.out.println("Input roles. Print 'stop' to stop.");
        while (true) {
            String t = in.nextLine();
            if (t.equals("stop")) break;
            roleA.add(t);
        }
        String[] role = roleA.toArray(new String[0]);
        System.out.println("Input textlines. Print 'stop' to stop.");
        while (true) {
            String t = in.nextLine();
            if (t.equals("stop")) break;
            textA.add(t);
        }
        String[] text = textA.toArray(new String[0]);
        in.close();
        System.out.println(printTextPerRole(role,text));
    }
}