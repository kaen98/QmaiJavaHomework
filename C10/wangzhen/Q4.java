package C10;

import java.util.ArrayList;
import java.util.List;

/**
 * 4. 创建一个List，在List 中增加三个工人Worker，基本信息如下：
 * 姓名 年龄 工资
 * zhang3 18 3000
 * li4 25 3500
 * wang5 22 3200
 * 2) 在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300
 * 3) 删除wang5 的信息
 * 4) 利用for 循环遍历，打印List 中所有工人的信息
 */
public class Q4 {
    public static void main(String[] args) {
        List<Worker> ListDemo= new ArrayList<>();

        Worker A = new Worker("zhang3", 18, 3000);
        Worker B = new Worker("li4", 25, 3500);
        Worker C = new Worker("wang5", 22, 3200);
        Worker D = new Worker("zhao6", 24, 3300);

        ListDemo.add(A);
        ListDemo.add(B);
        ListDemo.add(C);
        //2) 在li4 之前插入一个工人
        ListDemo.add(ListDemo.indexOf(B) , D);
        //3) 删除wang5 的信息
        ListDemo.remove(ListDemo.indexOf(C));
        //4) 利用for 循环遍历，打印List 中所有工人的信息
        for (Worker Somebody : ListDemo) {
            System.out.println(Somebody.toString());
        }
    }
}
