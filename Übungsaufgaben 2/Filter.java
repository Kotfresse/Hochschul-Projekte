import java.io.BufferedReader;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
/**
 * @author Tri Nguyen
 **/
public class Filter {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Suchbegriff ein: ");
        String searchTerm = sc.nextLine();
        sc.close();
        filterURL("https://www.whitehouse.gov/", searchTerm);

    }
    public static void filterURL(String url,String searchTerm) throws IOException{
        URL u = new URL(url);
        FilterInputStream fis = (FilterInputStream) u.openStream();
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while(line!=null){
            if(line.toLowerCase().contains(searchTerm.toLowerCase())){
                System.out.println(line);
            }
            line = br.readLine();
        }
    }
}
