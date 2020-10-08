package C10;

import java.util.*;

class Q4 {
    public static void main(String[] args) {
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
        ArrayList<Worker> w = new ArrayList<>();
        w.add(new Worker("zhang3", 18, 3000));
        w.add(new Worker("li4", 25, 3500));
        w.add(new Worker("wang5", 22, 3200));

        // 2) 在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300
        ArrayList<Worker> s = new ArrayList<>();
        Iterator<Worker> item = w.iterator();
        int k = 0;
        while(item.hasNext()){
            Worker ws = item.next();
            if (ws.name.equals("li4")) {
                k=1;
            }
            if ( k == 1){
                s.add(ws);
                item.remove();
            }
        }
        w.add(new Worker("zhao6", 24, 3300));
        for (Worker x : s){
            w.add(x);
        }
        for (Worker x : w){
            System.out.println("姓名："+x.name+"\r\n年龄："+x.age+"\r\n工资："+x.money+"\n");
        }


        //3) 删除wang5 的信息
        Iterator<Worker> item1 = w.iterator();
        while(item1.hasNext()){
            if (item1.next().name.equals("wang5")) {
                item1.remove();
            }
        }

        //4) 利用for 循环遍历，打印List 中所有工人的信息
        for (Worker x : w){
            System.out.println("姓名："+x.name+"\r\n年龄："+x.age+"\r\n工资："+x.money+"\n");
        }
    }
}


class Worker{
    public String name = null;
    public int age = 0;
    public int money = 0;
    public Worker(String name, int age, int money){
        this.name = name;
        this.age = age;
        this.money = money;
    }
}
