import java.util.Arrays;

public class Vampire {
    public static void main (String args []) { 
        for (int i=1001; i<=9999; i++) {    //take a number i
            int vamp[] = new int[4];
            for (int h=0; h<=3; h++) {  //put a number into massiv vamp[]
                switch (h) {
                    case 0: vamp[h]=i/1000; break;
                    case 1: vamp[h]=(i%1000)/100; break;
                    case 2: vamp[h]=i%1000%100/10; break;
                    case 3: vamp[h]=i%1000%100%10;
                }
            }
            Arrays.sort(vamp); //sort vamp[]
            
            for (int j=10; j<=99; j++) {    //перебираем множители j, k
                for (int k=j; k<=99; k++) {
                    if (j%10+k%10==0) continue; //if numbers end '00' then another number
                    if (i==j*k) { //проверяем множители
                        int compare[] = new int[4];
                        for (int f=0; f<=3; f++) {  //put two numbers into massiv compare[]
                            switch (f) {
                                case 0: compare[f]=j/10; break;
                                case 1: compare[f]=j%10; break;
                                case 2: compare[f]=k/10; break;
                                case 3: compare[f]=k%10;
                            }
                        }
                        Arrays.sort(compare); //sort compare[]
                        if (Arrays.equals(vamp, compare)) System.out.println(i+"="+j+"*"+k); //compare and print
                    }
                }
            }
        }
    }
}
