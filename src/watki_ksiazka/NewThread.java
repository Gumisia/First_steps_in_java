package watki_ksiazka;

public class NewThread implements Runnable{
    Thread t;

    public NewThread() {
        t = new Thread(this, "Przykladowy watek");
        System.out.println("Watek potomny: "+t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for(int i=5; i>0; i--){
                System.out.println("Wątek potomny: "+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Przerwano działanie potomka.");
        }
        System.out.println("Wyjście z wątku potomka.");
    }
}
