package xuzhiqiang;

public class questionTwo {
    /**
     *设计3个线程，其中2个线程对数字index进行 +1 操作，另外一个线程进行 -1 操作，要求线程安全
     * @param args
     */
    public static void main(String[] args) {
        Data data = new Data();
        Add add = new Add(data);
        Dec dec = new Dec(data);
        new Thread(add, "线程A").start();
        new Thread(add, "线程A").start();
        new Thread(dec, "线程B").start();
    }
}


class Data {

    private int j = 0;

    public synchronized void add(){
        synchronized (questionTwo.class) {
            System.out.println(Thread.currentThread().getName() + "对j加1，当前j=" + (++j));
        }

    }

    public synchronized void dec(){
        synchronized (questionTwo.class) {
            System.out.println(Thread.currentThread().getName() + "对j减1，当前j=" + (--j));
        }
    }
}


class Add implements Runnable {

    private Data data;

    Add(Data data){

        this.data= data;
    }

    public void run() {

        data.add();
    }
}

class Dec implements Runnable {

    private Data data;

    Dec(Data data) {

        this.data = data;
    }

    public void run() {
        data.dec();
    }
}

