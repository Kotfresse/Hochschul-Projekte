public class Sinus {
    public static void main(String[] args){
        double x = MyIO.readDouble("Bitte gebe ein Zahl ein: ");
        System.out.println(sin(x));
    }
    public static double sin(double x){
        int k=0;
        int n=1000;
        double maxError=1e-15;
        double sum=0;
        double term=x;
        while (Math.abs(term)>maxError && k<n){
            sum+=term;
            //System.out.println("k="+k+" sum="+sum+" term="+term);
            k++;
            term = -term*x*x/(2*k)/(2*k+1);
        }
        return sum;
    }
}
