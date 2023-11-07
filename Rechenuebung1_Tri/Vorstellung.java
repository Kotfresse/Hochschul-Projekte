public class Vorstellung {
    public static void main(String[] args) {
        String MitgliedName = "Tri Nguyen";
        System.out.println(MitgliedName);
        System.out.println(invert(MitgliedName));
    }
    public static String invert(String name) {

        return name.length() <= 1 ? name : invert(name.substring(1)) + name.substring(0, 1);

    }
}
