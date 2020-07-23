public class TrueTable01 {
    public static void main(String[] args) {
        int[] a={0,1,0,1};
        int[] b={0,0,1,1};
        System.out.println("A\tB\tAND\tOR\tXOR\tNOT A");
        int c;
        for(c=0;c<4;c++)System.out.println(a[c]+"\t"+b[c]+"\t"+(a[c]&b[c])+"\t"+(a[c]|b[c])+"\t"+(a[c]^b[c])+"\t"+((~a[c])+2)); 
        
    }
}