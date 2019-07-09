package threads.threadjoining;

public class Printer implements Runnable {
    @Override
    public  void  run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("ch" +i);
            try {
                Thread.sleep(250);

            }catch (InterruptedException e){

e.printStackTrace();

            }

        }


    }
}
