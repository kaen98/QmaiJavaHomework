package xuzhiqiang;

public class questionThree {
    /**
     * 写两个线程，两个线程交替打印1-100的数组
     * @param args
     */
    public static void main(String[] args) {
        Print p = new Print();
        new Thread(p, "线程1").start();
        new Thread(p, "线程2").start();
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
