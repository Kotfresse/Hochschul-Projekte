/**
 * @author Tri Nguyen
 **/
public class Fractrain {
    public static void main(String[] args) {
        Fraction[] fractions = new Fraction[14];
        fractions[0] = new Fraction(17, 91);
        fractions[1] = new Fraction(234, 255);
        fractions[2] = new Fraction(19, 51);
        fractions[3] = new Fraction(23, 38);
        fractions[4] = new Fraction(29, 33);
        fractions[5] = new Fraction(77, 29);
        fractions[6] = new Fraction(95, 23);
        fractions[7] = new Fraction(77, 19);
        fractions[8] = new Fraction(1, 17);
        fractions[9] = new Fraction(11, 13);
        fractions[10] = new Fraction(13, 11);
        fractions[11] = new Fraction(15, 2);
        fractions[12] = new Fraction(1, 7);
        fractions[13] = new Fraction(55, 1);
        for(Fraction f:fractions){
            System.out.println(f);
        }
        Fraction b = new Fraction(128, 1);
        Fraction groeßtezahl = new Fraction(1,1);
        Fraction xZahl= new Fraction(1,1);
        int c=0;
        int anzahlInteger=1;
        int stelleGroeßteZahl=0;

        System.out.println("1: "+b.getNumerator());
        while(anzahlInteger<74708){
            while(true){
                Fraction f= fractions[c%14].multiply(b);
                if(f.isInteger()){
                    anzahlInteger++;
                    b=f;
                    c=0;
                    break;
                }
                c++;
            }
            if(b.getNumerator().compareTo(groeßtezahl.getNumerator())==1 && anzahlInteger<44971){
                groeßtezahl=b;
                stelleGroeßteZahl=anzahlInteger;
            }
            if(anzahlInteger==10652){
                xZahl=b;
            }
            if(anzahlInteger<=3184)
            System.out.println(anzahlInteger+": "+b.getNumerator());

        }
        System.out.println(anzahlInteger+": "+b.getNumerator());
        System.out.println("Zahl an 10652 : "+xZahl);
        System.out.println("Die groesste Zahl war : "+groeßtezahl.getNumerator()+" und kommen nach "+stelleGroeßteZahl+ " Integer.");

    }
}
