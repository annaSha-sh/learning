public class TrueTable {
    public static void main(String[] args) {
        boolean[] a={false,true,false,true};
        boolean[] b={false,false,true,true};
        System.out.println("A\tB\tAND\tOR\tXOR\tNOT");
        int c;
        for(c=0;c<4;c++)System.out.println(a[c]&b[c]); 
    }
}