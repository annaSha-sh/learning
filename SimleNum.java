public class SimleNum {
    public static void main(String[] args) {
        System.out.print("Simple numbers from 2 till 100: ");
        int i;
        for (i=3;i<=100;i++){
            int c;
            boolean tru=false;
            for (c=2; (c<i)&(tru==false); c++) if (i%c==0) tru=true;
            if (tru==false) System.out.print(i+" ");
        }
    }
}