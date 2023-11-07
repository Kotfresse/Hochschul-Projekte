public class VorstellungDistanz12 {
    public static void main(String[] args) {
        String MitgliedName = "Tri Nguyen";
        System.out.println(MitgliedName);
        System.out.println(vorstellungDistanz12(MitgliedName));
    }
    
    public static String vorstellungDistanz12(String name) {
        return name.length()<=1 ?  name : name.length()==2 ? name.substring(0, 1) +" "+name.substring(1, 2)  :name.substring(0, 1) + " "+ name.substring(1, 2)+ "  " + vorstellungDistanz12(name.substring(2));
    }
     
}
