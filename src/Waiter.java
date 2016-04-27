/**
 * Created by lstrzalk on 27.04.16.
 */
public class Waiter {
    int semaphore = 0;
    int max;

    Waiter(int init){
        this.max = init;
    }

    // Podniesienie
    public synchronized void v() throws InterruptedException{
        while(semaphore == max){
            wait();
        }
        semaphore++;
    }

    // Opuszczenie
    public synchronized void p() throws InterruptedException{
        if(semaphore > 0 ){
            notify();
        }
        semaphore--;
    }
}