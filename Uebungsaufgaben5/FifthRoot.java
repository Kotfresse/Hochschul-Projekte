/**
 * @author Tri Nguyen
 **/
public class FifthRoot {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        System.out.println("fifthRoot("+x+")="+fifthRoot(x));
    }
    public static double fifthRoot (double x){
        int k=1;
        int n=10000;
        double maxError=1e-10;
        double sum=2.0;
        double term=1;
        while (Math.abs(term-sum)>=maxError && k<n){
            sum=term;
            term = sum - ((sum*sum*sum*sum*sum-x)/(5.0*sum*sum*sum*sum));
            System.out.println("k="+k+" sum="+sum+" term="+term);
            k++;
        }
        return term;
    }
}
