/**
 * Created by lstrzalk on 27.04.16.
 */
public class Main {
    public static void main(String args[]) throws InterruptedException {
        Waiter waiter=new Waiter(4);
        Fork forks[]=new Fork[5];
        String[] names= new String[]{"Arystoteles", "Hipokrates","Sofokles","Erazm","Sokrates"};
        Philosopher[] phil=new Philosopher[5];
        for (int i=0;i<5;i++){
            forks[i]=new Fork();
        }
        for (int i=0;i<5;i++){
            phil[i]=new Philosopher(waiter,forks,i,names[i]);
        }
        for(int i=0;i<5;i++){
            phil[i].start();
        }
        for(int i=0;i<5;i++){
            phil[i].join();
        }
    }
}
