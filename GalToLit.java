public class GalToLit {
    public static void main(String args[]) {
        double gal;
        double lit;
        int counter;
        counter=0;
        for (gal=1.0; gal<=50; gal++) {
            lit=gal*3.7854;
            System.out.println(gal + " gallons = "+lit+" litres.");
            counter++;
            if (counter==10) {System.out.println();counter=0;}
        
            
        }
    }
}