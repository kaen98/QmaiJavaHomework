package test04;

import java.util.ArrayList;

/**
 * @author san
 */
public class TestClass {

    public static void main(String[] args) {

        //新增

        Worker worker1 = new Worker("zhang3", 18, 3000);
        Worker worker2 = new Worker("li4", 25, 3500);
        Worker worker3 = new Worker("wang5", 22, 3200);

        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        System.out.println(workers);

        workers.add(1, new Worker("zhao6", 24, 33));
        System.out.println(workers);


        workers.remove(3);
        System.out.println(workers);

        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }
}
