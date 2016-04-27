/**
 * Created by lstrzalk on 27.04.16.
 */
public class Fork {
    boolean lock=false;
    //podnoszenie
    public synchronized void vb() throws InterruptedException {
        while(lock) {
            wait();
        }
        lock=true;
    }//opuszczenie
    public synchronized void pb(){
        if(lock){
            notify();
        }
        lock=false;
    }
}