import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CutArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt(); // m - mas length
        int[] mas = new int[m];
        for (int i=0;i<m;i++) mas[i]=in.nextInt();
        in.close(); //make array mas from input

        ArrayList <Integer[]> list = new ArrayList<>(); //result array
        int i=1;
        ArrayList <Integer> cut = new ArrayList<>(); //array of cuts
        
        while (i<m) {
            cut.clear();
            if (i==1) cut.add(mas[0]); //first step, add mas[0] to beginning
            
            else {cut.add(mas[i]); // or add first element to cut
            i++;}

            while (i<m && mas[i]>mas[i-1]) { //add other elements to cut
                cut.add(mas[i]);
                i++;
            }
            list.add(cut.toArray(new Integer[0])); // add cut to array of cuts
        } //we have ArrayList of arrays, including cuts. Like this: [123],[23],[123]
        
        list.add(new Integer[0]); //empty array to hold borders
        int j=0;
        while (j<(list.size()-2)) { //compare array length and remove waste
            if (list.get(j).length<list.get(j+1).length) list.remove(j);
            if (list.get(j).length>list.get(j+1).length) list.remove(j+1);
            if (list.get(j).length==list.get(j+1).length) j++;
        }
        
        list.remove(list.size()-1); //remove empty array
        System.out.println("\n"+list.get(0).length);
        for (Integer[] res:list)
        System.out.println(Arrays.toString(res).replaceAll("[\\[]|[\\,]|[\\]]", "")); //omg no skill just juck, make "1 2 3" from "[1, 2, 3]"
    }
}