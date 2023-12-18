public class Lineupdater {
    public static void main(String[] args) {
        int counter = 0;
        String[] spinner = {"|", "/", "-", "\\"};
        // a counter that updates multiple lines
        while (true) {
            for (int i = 0; i < spinner.length; i++) {
                System.out.print("\033[2K"); 
                System.out.print("\033[" + (i + 3) + ";1H"); 
                System.out.print(counter);
                System.out.print(" " + spinner[i]);
                try {
                    Thread.sleep(5); // Delay for better visualization
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            counter++;
        }
    }
}
