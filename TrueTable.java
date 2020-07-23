public class TrueTable {
    public static void main(String[] args) {
        boolean[] a={false,true,false,true};
        boolean[] b={false,false,true,true};
        System.out.println("A\t\tB\t\tAND\t\tOR\t\tXOR\t\tNOT A");
        int c;
        for(c=0;c<4;c++)System.out.println(a[c]+"\t"+b[c]+"\t"+(a[c]&b[c])+"\t"+(a[c]|b[c])+"\t"+(a[c]^b[c])+"\t"+(!a[c])); 
    }
}