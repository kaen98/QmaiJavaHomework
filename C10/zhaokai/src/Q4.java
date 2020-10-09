import java.util.LinkedList;
import java.util.List;

/**
 *4. 创建一个List，在List 中增加三个工人Worker，基本信息如下：
 * 姓名 年龄 工资
 * zhang3 18 3000
 * li4 25 3500
 * wang5 22 3200
 * 2) 在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300
 * 3) 删除wang5 的信息
 * 4) 利用for 循环遍历，打印List 中所有工人的信息
 *
 */
public class Q4 {
    public static void main(String[] args) {
        Worker w1 = new Worker("zhang3", 18, 3000);
        Worker w2 = new Worker("li4", 25, 3500);
        Worker w3 = new Worker("wang5", 22, 3200);

        List<Worker> wList = new LinkedList<>();
        wList.add(w1);
        wList.add(w2);
        wList.add(w3);
        println(wList);

        System.out.println("\n 2) 在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300:");
        Worker w4 = new Worker("zhao6", 24, 3300);
        wList.add(1, w4);
        println(wList);

        System.out.println("\n 3) 删除wang5 的信息");
        wList.remove(3);
        println(wList);
    }

    public static void println(List<Worker> list) {
        System.out.println("姓名 年龄 工资");
        for (Worker s : list) {
            System.out.println(s.getName() + " " + s.getAge() + " " + s.getSalay());
        }
    }


}

class Worker {
    private String name;
    private Integer age;
    private Integer salay;

    public Worker(String name, Integer age, Integer salay) {
        this.name = name;
        this.age = age;
        this.salay = salay;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSalay() {
        return salay;
    }
}
