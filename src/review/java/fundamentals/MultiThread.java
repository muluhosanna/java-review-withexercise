package review.java.fundamentals;

public class MultiThread {
    public  static class Hello extends Thread{
        public void run() {
            for (int i=1;i<5;i++){
                System.out.println("hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    public static class Hi extends Thread{
        public void run() {
            for(int i=1;i<=5;i++){
                System.out.println("hi");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    public static void main(String[]args) throws InterruptedException {
        Hello hello= new Hello();
        Hi h= new Hi();
        hello.start();
        h.start();




    }
}

