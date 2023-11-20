import java.io.*;

/**
 * @author Tri Nguyen
 **/
public class Janus {
    public static void main(String[] args) throws Exception {
        // Path currentfilepath = getCurrentJavaFilePath();
        String currentfilepath = "Janus.java";
        // String classpath= System.getProperty("java.class.path");

        String inputLine;
        File f = new File(currentfilepath.toString());
        FileInputStream fis = new FileInputStream(f);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        while ((inputLine = br.readLine()) != null) {
            System.out.println(inputLine);
        }
        br.close();

    }
}
