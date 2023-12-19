/**
 * @author Tri Nguyen
 **/
public class Primer extends Thread {

    private int p; // the prime number of this Primer
    private Primer left; // the left successor of this Primer
    private Primer right; // the right successor of this Primer
    private Primer next; // the next Primer in the chain
    private int buffer = -1; // the buffer for storing numbers
    private int Reihe; // the row of this Primer

    public Primer(int prime, int Reihe) {
        super("Primer-" + prime);
        p = prime;
        this.Reihe = Reihe;
        this.start();
    }

    public static void main(String[] args) {
        Primer first = new Primer(2, 1);
        for (int i = 3; i <= 141; first.send(i++)) {
        }
        first.send(0); // terminates the thread
        Primer second = new Primer(2, 2);
        for (int i = 3; i <= 141; second.send(i++)) {
        }
        second.send(0); // terminates the thread
    }

    public void run() {
        for (int i = 0; i < Reihe; i++) {
            System.out.print("|__|");
        }
        System.out.println("|" + p + "|");
        while (true) {
            int n = receive();
            // If the message is 0, then the thread should terminate
            if (n == 0) {
                if (next != null) {
                    next.send(n);
                }
                break;
            }

            // If the number n is not divisible by the current prime p,
            // then send it to the left successor. If there is no left
            // successor, then create a new Primer object for n.
            if (n % p != 0) {
                if (left != null) {
                    left.send(n);
                } else {
                    left = new Primer(n, Reihe);
                }
            }

            // If the number n is divisible by the current prime p,
            // then send it to the right successor. If there is no
            // right successor, then create a new Primer object for 3*n+2.
            else {
                if (right != null) {
                    right.send(n);
                } else {
                    right = new Primer((3 * n) + 2, Reihe);
                }
            }
        }
    }

    public synchronized void send(int i) { // acquire the lock
        try {
            while (buffer >= 0) {
                wait(); // wait until the buffer is free
            }
            buffer = i; // fill the buffer
            notify(); // notify the receiver
        } catch (InterruptedException e) {
        }
    }

    public synchronized int receive() { // acquire the lock
        int result = 0;
        try {
            while ((result = buffer) < 0) {
                wait(); // wait until the buffer is full
            }
            buffer = -1; // empty the buffer
            notify(); // notify the sender
        } catch (InterruptedException e) {
        }
        return result;
    }
}
