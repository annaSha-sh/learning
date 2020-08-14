import java.util.Arrays;

public class Puzirek {
    public static void main (String args []) {
        int a[] = {1,10,-5,3,2,0};
        for (int i:a) { //for each
            for (int j=0; j<(a.length-1); j++) {
                if (a[j]>a[j+1]) {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                    System.out.println(Arrays.toString(a));
                    
                }
                
            }
            
        }
            
        

    }
}
