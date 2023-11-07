import java.lang.Math;
/**
 * @author Tri Nguyen
 **/
public class Pi {
    public static void main(String[] args){
        long n=MyIO.readLong("Bitte gebe eine Zahl ein: ");

        System.out.println("Pi ist: "+pi(n));
    }
    public static double pi(long n){
        double pi=0;
        for(long i=1;i<n+1;i++){
            double temp = (double)i*i;
            pi+=(6/temp);
        }
        return Math.sqrt(pi);
    }
}
