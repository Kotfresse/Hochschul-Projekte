public class VorstellungAufAb {
    public static void main(String[] args) {
        String MitgliedName = "Tri Nguyen";
        System.out.println(MitgliedName);
        System.out.println(vorstellungAufAb(MitgliedName));

    }
    public static String vorstellungAufAb(String name) {
        return name.length()<=1 ? name.toUpperCase():
        name.substring(0, 1).toUpperCase() + name.substring(1, 2).toLowerCase()+
        vorstellungAufAb(name.substring(2));
        
    }


}