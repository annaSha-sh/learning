import java.util.Scanner; //Sc
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.io.*;
public class FileTest {
    public static void main (String args[]) throws IOException{ //throws IOException added for Scanner
       
        //new file and write in
        PrintWriter oout = new PrintWriter ("newFile.txt",StandardCharsets.UTF_8 ); //without Path O_o
        oout.println("Try");
        oout.println("Try again");
        oout.println("And again"); //Rewrite file every time
        oout.close(); //don't work without it!!!

        //read from file
        Scanner inn = new Scanner (Path.of("d:\\java_info\\learning\\newFile.txt"),StandardCharsets.UTF_8);
        String text = inn.nextLine();
        System.out.println(text);
    }
}