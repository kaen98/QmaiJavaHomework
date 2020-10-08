package src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 创建一个List，在List 中增加三个工人Workerer，基本信息如下：
 * 姓名 年龄 工资
 * zhang3 18 3000
 * li4 25 3500
 * wang5 22 3200
 * 2) 在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300
 * 3) 删除wang5 的信息
 * 4) 利用for 循环遍历，打印List 中所有工人的信息
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/10/7 10:29 下午
 */
public class Demo4 {
    public static void main(String[] args) {

        //①初始化数据
        List<Worker> workerList = new ArrayList<>();
        workerList.add(new Worker("zhang3", 18, 3000));
        workerList.add(new Worker("li4", 25, 3500));
        workerList.add(new Worker("wang5", 22, 3200));
        print(workerList);

        //②插入数据
        workerList = insertArray(workerList, new Worker("zhao6", 24, 3300), "zhang3", false);
        print(workerList);

        //③删除wang5
        workerList = deleteArray(workerList, "wang5");

        //④打印数据
        print(workerList);

    }

    /**
     * 删除集合指定名称
     * @param workerList
     * @param name
     * @return
     */
    public static List deleteArray(List<Worker> workerList, String name) {
        Iterator iterator = workerList.iterator();
        //打印
        while (iterator.hasNext()) {
            Worker student = (Worker) iterator.next();
            if(name.equals(student.getName())){
                iterator.remove();
            }
        }

        return workerList;
    }

    /**
     * 插入数据到集合
     *
     * @param workerList  源集合
     * @param insetData   插入数据
     * @param indexName   插入位置
     * @param beforeAfter true前插，false后插
     * @return
     */
    public static List insertArray(List<Worker> workerList, Worker insetData, String indexName, boolean beforeAfter) {
        List<Worker> newWorkerList = new ArrayList<>();

        int size = workerList.size();
        for (int i = 0; i < size; i++) {
            if (indexName.equals(workerList.get(i).getName()) && beforeAfter) {
                newWorkerList.add(insetData);
            }

            newWorkerList.add(workerList.get(i));

            if (indexName.equals(workerList.get(i).getName()) && !beforeAfter) {
                newWorkerList.add(insetData);
            }
        }

        return newWorkerList;
    }

    /**
     * 打印集合数据
     * @param list 集合数据
     */
    public static void print(List<Worker> list) {
        for (Worker woker:list) {
            System.out.println("姓名：" + woker.getName() + " 年龄：" + woker.getAge() + " 工资：" + woker.getWage());
        }

        System.out.println("===================================================");
    }

    static class Worker {
        private String name;
        private int age;
        private int wage;

        public Worker(String name, int age, int wage) {
            setAge(age);
            setWage(wage);
            setName(name);
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setWage(int wage) {
            this.wage = wage;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getWage() {
            return wage;
        }
    }
}
