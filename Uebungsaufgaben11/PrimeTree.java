
public class PrimeTree {

    public static void main(String[] args) {
        // Create the root of the tree
        Primer root = new Primer(2, 1);

        // Send all numbers from 3 to 141 to the root
        for (int i = 3; i <= 141; i++) {
            root.send(i);
        }

        // Terminate the tree
        root.send(0);
    }
}