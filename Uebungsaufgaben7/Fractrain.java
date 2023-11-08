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
        int c=0;
        for(int i =0; i<3825;i++){
            fractions[c%14]=fractions[c%14].multiply(b);
            System.out.println("Fraction "+c+" is "+fractions[c%14]+" \n");
            if(fractions[c%14].isInteger()){
                z=fractions[c%14];
                System.out.println("Z is currently: "+z+"\n");
                b=z;
                c=0;
                continue;
            }
            c++;
            
        }
    }
}
