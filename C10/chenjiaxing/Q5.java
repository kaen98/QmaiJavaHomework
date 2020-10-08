package C10;

import java.util.ArrayList;

class Q5 {
    public static void main(String[] args) {
        /**
         * 5.  有如下Student 对象，包含三个属性姓名、年龄、分数，班号，
         *  　private String name;
         *     private int age;
         *     private int score;
         *     private String classNum;
         * 其中，classNum 表示学生的班号，例如“class05”。 创建集合并完成下列要求：
         * 1） 计算所有学生的平均年龄
         * 2） 计算各个班级的平均分
         */
        ArrayList<Students> s = new ArrayList<>();
        s.add(new Students("Tom", 18, 100, "class05"));
        s.add(new Students("Jerry", 22, 70, "class04"));
        s.add(new Students("Owen", 25, 90, "class05"));
        s.add(new Students("Jim", 30, 80, "class05"));
        s.add(new Students("Steve", 28, 66, "class06"));
        s.add(new Students("Kevin", 24, 100, "class04"));

        int ageMax = 0;
        for(Students ss : s){
            ageMax += ss.age;
        }
        System.out.println("年龄平均数为:"+ ageMax/ s.size());

        ArrayList<Students> sw = new ArrayList<>();
        ArrayList<String> cla = new ArrayList<>();
        for(Students ss :s ){
            if (!cla.contains(ss.classNum)) {
                cla.add(ss.classNum );
                sw.add(new Students("", 1, ss.score, ss.classNum));
            } else {
                for(Students sws :sw) {
                    if (sws.classNum == ss.classNum) {
                        sws.score += ss.score;
                        sws.age += 1;
                    }
                }
            }
        }

        for(Students ss :sw ){
            System.out.println(ss.classNum + "班平均分：" + ss.score/ss.age);
        }
    }
}


class Students{
    public String name;
    public int age;
    public int score;
    public String classNum;
    public Students(String name, int age, int score, String classNum){
        this.name = name;
        this.age = age;
        this.score = score;
        this.classNum = classNum;
    }
}