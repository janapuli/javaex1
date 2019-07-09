package threads.threadjoining;

public class Application {
    public static void main(String[] args) throws InterruptedException {



    Printer printer = new Printer();
    Thread thread = new Thread(printer);
    thread.start();
    thread.join();
     for (int i = 0; i < 1000; i++) {
        System.out.println("main" +i);

    }

}
}
