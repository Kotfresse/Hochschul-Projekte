/**
 * @author Tri Nguyen
 **/
public class SevenColumnPrimes extends Thread {
    public static void main(String[] args) {
        
        Primer first = new Primer(2, 1);
        Primer second = new Primer(2, 2);
        Primer third = new Primer(2, 3);
        Primer fourth = new Primer(2, 4);
        Primer fifth = new Primer(2, 5);
        Primer sixth = new Primer(2, 6);
        Primer seventh = new Primer(2, 7);
        /*
        for (int i = 3; i <= 7523; first.send(i++))
            ;
        first.send(0);// terminates the thread
        for (int i = 3; i <= 7523; second.send(i++))
            ;
        second.send(0);// terminates the thread
        for (int i = 3; i <= 7523; third.send(i++))
            ;
        third.send(0);// terminates the thread
        for (int i = 3; i <= 7523; fourth.send(i++))
            ;
        fourth.send(0);// terminates the thread
        for (int i = 3; i <= 7523; fifth.send(i++))
            ;   
        fifth.send(0);// terminates the thread
        for (int i = 3; i <= 7523; sixth.send(i++))
            ;
        sixth.send(0);// terminates the thread
        for (int i = 3; i <= 7523; seventh.send(i++))
            ;
        seventh.send(0);// terminates the thread
        */
        Thread firsThread = new Thread(()->{
            for (int i = 3; i <= 7523; first.send(i++))
            ;
        first.send(0);// terminates the thread
        });
        Thread secondThread = new Thread(()->{
            for (int i = 3; i <= 7523; second.send(i++))
            ;
        second.send(0);// terminates the thread
        });
        Thread thirdThread = new Thread(()->{
            for (int i = 3; i <= 7523; third.send(i++))
            ;
        third.send(0);// terminates the thread
        });
        Thread fourthThread = new Thread(()->{
            for (int i = 3; i <= 7523; fourth.send(i++))
            ;
        fourth.send(0);// terminates the thread
        });
        Thread fifthThread = new Thread(()->{
            for (int i = 3; i <= 7523; fifth.send(i++))
            ;
        fifth.send(0);// terminates the thread
        });
        Thread sixthThread = new Thread(()->{
            for (int i = 3; i <= 7523; sixth.send(i++))
            ;
        sixth.send(0);// terminates the thread
        });
        Thread seventhThread = new Thread(()->{
            for (int i = 3; i <= 7523; seventh.send(i++))
            ;
        seventh.send(0);// terminates the thread
        });
        firsThread.start();
        secondThread.start();
        thirdThread.start();
        fourthThread.start();
        fifthThread.start();
        sixthThread.start();
        seventhThread.start();

    }
}
