package threads;

public class Application {


    public static void main(String[] args) {


        //Printer printer = new Printer();
        //printer.setDaemon(true);
        //printer.start();

        Printer1 printer1= new Printer1();
        System.out.println("before main"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);
        Thread thread = new Thread(printer1);
        thread.setPriority(7);

        System.out.println("main"+Thread.currentThread().getPriority());
        System.out.println("Child"+thread.getPriority());
         thread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main" +i);

        }
        System.out.println("------------------------------");
    }
}


