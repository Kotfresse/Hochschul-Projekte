public class VorstellungGesperrt{
    public static void main(String[] args) {
        String MitgliedName = "Tri Nguyen";
        System.out.println(MitgliedName);
        System.out.println(vorstellungGesperrt(MitgliedName));
    }
    public static String vorstellungGesperrt(String name) {
        return name.length() <=1 ? name : name.substring(0,1) + " " + vorstellungGesperrt(name.substring(1)); 
    }

}