package threads;

public class Printer extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("copy" + i);

        }
    }


}