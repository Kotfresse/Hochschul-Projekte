import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Tri Nguyen
 **/
public class FileMirror {
    public static void main(String[] args) throws Exception {
        String Dateiname1, Dateiname2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte Gebe deine Dateiname ein: ");
        Dateiname1 = sc.nextLine();
        System.out.println("Bitte Gebe deine Zielateiname ein: ");
        Dateiname2 = sc.nextLine();
        sc.close();
        try {
            fileMirror(Dateiname1, Dateiname2);
            System.out.println("Datei erfolgreich kopiert");
        } catch (IOException e) {
            System.out.println("Fehler beim Lesen oder Schreiben der Datei");
        }

    }

    public static void fileMirror(String sourceFilePath, String targetFilePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(sourceFilePath));
        BufferedWriter bw = new BufferedWriter(new FileWriter(targetFilePath));

        String line;
        while ((line = br.readLine()) != null) {
            String invertedLine = invert(line);
            bw.write(invertedLine);
            bw.newLine();
        }

        br.close();
        bw.close();
    }

    public static String invert(String name) {

        return name.length() <= 1 ? name : invert(name.substring(1)) + name.substring(0, 1);

    }
}
