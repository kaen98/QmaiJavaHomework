package classEight;

import java.util.ArrayList;

public class testThree {
    /**
     * 定义一个学生类Student，包含三个属性姓名name、年龄age、性别gender，创建三个学生对象存入ArrayList集合中。
     * 姓名 年龄  性别
     * 张三   20  男
     * 李希  39   男
     * 小七  18   女
     *   1）：遍历集合遍历输出。
     *   2）：求出年龄最大的学生，让后将该对象的姓名变为：葫芦娃
     */
    String name;
    int age;
    String gender;

    public static void main(String[] strings) {
        ArrayList<testThree>arr= new ArrayList<>();
        addStudent(arr);
        ergodic(arr);
        getMax(arr);
    }

    /**
     * 遍历集合遍历输出
     * @param arr
     */
    private static void ergodic(ArrayList<testThree> arr) {
        for(int i=0;i<arr.size();i++)
        {
            System.out.println(arr.get(i).name+" "+arr.get(i).age+" "+arr.get(i).gender);
        }
    }

    /**
     * 求出年龄最大的学生，让后将该对象的姓名变为：葫芦娃
     * @param arr
     */
    private static void getMax(ArrayList<testThree> arr) {
        int num = arr.get(0).age;
        int index = 0;
        for(int j=0; j<arr.size(); j++)
        {
            if(num < arr.get(j).age)
            {
                num = arr.get(j).age;
                index = j;
            }
        }
        arr.get(index).name = "葫芦娃";
        for(int q = 0;q < arr.size();q++)
        {
            System.out.println(arr.get(q).name+" "+arr.get(q).age+" "+arr.get(q).gender);
        }
    }

    /**
     * 添加名称
     * @param arr
     */
    private static void addStudent(ArrayList<testThree> arr) {
        testThree s1=new testThree();
        s1.name="张三";
        s1.age=18;
        s1.gender="男";

        testThree s2=new testThree();
        s2.name="李四";
        s2.age=28;
        s2.gender="女";

        testThree s3=new testThree();
        s3.name="王五";
        s3.age=25;
        s3.gender="男";

        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
    }
}
