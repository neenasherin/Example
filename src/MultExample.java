class ExampleOne extends Thread{
    public void run() {
        for(int i=1;i<5;i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread class1  "+i);
        }

    }
}
class ExampleTwo extends Thread{
    public void run() {
        for(int i=5;i<10;i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread class2  "+i);
        }
    }
}
public class MultExample {
    public static void main(String[] args) throws InterruptedException {
        ExampleOne exmp = new ExampleOne();
        exmp.start();
        exmp.join(1500);
        ExampleTwo exmpw = new ExampleTwo();
        exmpw.start();
        float a = 2.33f;
        String s = String.valueOf(a);
    }
}