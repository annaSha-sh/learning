public class WordGen{
    public static void main(String[] args) {
        String[] temper = {"тепло","холодно","жарко","прохладно","мороз"};
        String[] osadki = {"дождь","ясно","град","ливень"};
        String[] wind = {"штиль","ветренно","шторм"};
        int lentemp = temper.length;
        int lenos = osadki.length;
        int lenwind = wind.length;
        //System.out.println ("Длины массивов: "+lentemp+", "+ lenos+", "+ lenwind);
        int rand1 = (int)(Math.random()*lentemp);
        int rand2 = (int)(Math.random()*lenos);
        int rand3 = (int)(Math.random()*lenwind);
        String weather = temper[rand1]+", "+osadki[rand2]+" и "+wind[rand3];
        System.out.println("Завтра будет "+weather);
    }
}