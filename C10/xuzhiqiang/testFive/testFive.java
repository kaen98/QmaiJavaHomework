package classEight.testFive;

import java.util.ArrayList;
import java.util.List;

public class testFive {
    /**
     *有如下Student 对象，包含三个属性姓名、年龄、分数，班号，
     *  　private String name;
     *     private int age;
     *     private int score;
     *     private String classNum;
     * 其中，classNum 表示学生的班号，例如“class05”。 创建集合并完成下列要求：
     * 1） 计算所有学生的平均年龄
     * 2） 计算各个班级的平均分
     */
    public static void main(String[] args) {

        List<student> list = new ArrayList<>();
        list.add(new student("Tom",18,100,"class05"));
        list.add(new student("Jerry",22,70,"class04"));
        list.add(new student("Owen",25,90,"class05"));
        list.add(new student("Jim",30,80,"class05"));
        list.add(new student("Steve",28,66,"class06"));
        list.add(new student("Kevin",24,100,"class04"));


        int sum=0;
        for(int i=0;i<list.size();i++)
        {
            sum+=list.get(i).getAge();
        }
        System.out.println("所有学生的平均分是："+sum/list.size());

        int score4=0;
        int score5=0;
        int score6=0;
        int num4=0;
        int num5=0;
        int num6=0;
        for(int j=0;j<list.size();j++)
        {
            student st=list.get(j);

            if(st.getClassNum()=="class04")
            {
                num4++;
                score4 +=st.getScore();
            }
            else if(st.getClassNum()=="class05")
            {
                num5++;
                score5+=st.getScore();
            }
            else
            {
                num6++;
                score6+=st.getScore();
            }

        }
        System.out.println("class04的平均分数是："+score4/num4);
        System.out.println("class05的平均分数是："+score5/num5);
        System.out.println("class06的平均分数是："+score6/num6);
    }
}
