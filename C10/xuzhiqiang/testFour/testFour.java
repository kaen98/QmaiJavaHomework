package classEight.testFour;

import java.util.ArrayList;
import java.util.List;

public class testFour {
    /**
     * 创建一个List，在List 中增加三个工人Worker，基本信息如下：
     * 姓名 年龄 工资
     * zhang3 18 3000
     * li4 25 3500
     * wang5 22 3200
     * 2) 在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300
     * 3) 删除wang5 的信息
     * 4) 利用for 循环遍历，打印List 中所有工人的信息
     */
    public static void main(String[] args) {

        List<work> list = new ArrayList<>();

        list.add(new work("zhang3",18,3000));
        list.add(new work("li4",25,3500));
        list.add(new work("wang5",22,3200));


        list.add(1,new work("zhao6",24,3300));


        list.remove(3);

        for(int i = 0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }


}
