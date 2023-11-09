

public class Fractrain {
    public static void main(String[] args) {
        Fraction[] fractions = new Fraction[14];
        fractions[0] = new Fraction(17, 91);
        fractions[1] = new Fraction(78, 85);
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

        Fraction b = new Fraction(8, 1);
        Fraction z= new Fraction(1,1);
        Fraction groeßtezahl = new Fraction(1,1);
        Fraction xZahl= new Fraction(1,1);
        int c=0;
        int AnzahlInteger=0;
        int AnzahlDerDurchläufe=0;
        int StelleGroeßteZahl=0;

        System.out.print(b.getNumerator()+", ");
        while(AnzahlInteger<3825){
            Fraction f=fractions[c%14].multiply(b);
            //System.out.println("Fraction "+c+" is "+fractions[c%14]+" \n");
            if(AnzahlDerDurchläufe==8000){
                xZahl=f;
            }
            if(f.isInteger()){
                z=f;
                System.out.print(z.getNumerator()+", ");
                if(groeßtezahl.getNumerator().compareTo(z.getNumerator())<0){
                    groeßtezahl=z;
                    StelleGroeßteZahl
        =AnzahlDerDurchläufe;
                }
                b=z;
                c=0;
                AnzahlInteger++;
                AnzahlDerDurchläufe++;
                continue;
            }
            c++;
            
        }
        System.out.println("\n"+AnzahlDerDurchläufe);
        System.out.println("\n"+"Die 8000. Zahl war : "+xZahl.getNumerator()+" und kommen nach "+""+" Durchlaeufen.");
        System.out.println("\n"+"Die groeßte Zahl war : "+groeßtezahl.getNumerator()+" und kommen nach "+StelleGroeßteZahl+" Durchlaeufen.");

    }
}
