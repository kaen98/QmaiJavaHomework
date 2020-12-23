package C16;

/**
 * 写两个线程，2个线程交替打印1-100的数字；。
 */
public class Q4 {
    public static void main(String[] args) {
        Print p = new Print();
        new Thread(p, "线程a").start();
        new Thread(p, "线程B").start();
    }
}


class Print implements Runnable {
    private int num = 1;
    private Object obj = new Object();
    @Override
    public void run() {
        while(true) {
            synchronized (obj) {
                obj.notify();
                if (num <= 100) {
                    System.out.println(Thread.currentThread().getName() + " : " + num);
                    num++;
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}
