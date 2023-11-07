import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;
public class EsreverLister {
    public static void main(String[] args) {
        System.out.println("Dieses Programm liest Zeilen ein und gibt sie in umgekehrter Reihenfolge aus.");
        System.out.println("Ende mit potS oder ^Z");
        String filepath = args[0];
        ArrayList<String> lines = readtexfile(filepath);
        //ArrayList<String> list = new ArrayList<String>();
        ListIterator<String> it = lines.listIterator(lines.size());
        System.out.println("");
        while (it.hasPrevious()&& !it.previous().equalsIgnoreCase("stop")){
            System.out.println(it.previous());
        }
        System.out.println("Ende das Programms ...");
    }
    static String invert(String s){
        return s.length()==0 ? s : invert(s.substring(1))+s.charAt(0);
    }
    public static ArrayList<String> readtexfile(String filename){
        ArrayList<String> lines = new ArrayList<String>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            while(line != null){
                lines.add(invert(line));
                line = reader.readLine();
                //i++;
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return lines;
    }
}
