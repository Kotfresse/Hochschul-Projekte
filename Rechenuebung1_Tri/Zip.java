public class Zip{
    public static void main(String[] args) {
        if(args.length ==0){
            System.out.println("Please enter two strings");
            return;
        }
        if(args.length >2){
            System.out.println("Please enter only two strings");
            return;
        }
        String a= args[0];
        String b= args[1];
        System.out.println(zip(a,b));

    }
    public static String zip(String a, String b){
        return a.length() ==0 && b.length()==0 ? "" : a.length()==0 && b.length()!=0 ? b : a.length()!=0 && b.length()==0 ? a : a.substring(0,1)+b.substring(0,1)+zip(a.substring(1),b.substring(1));
    }
}