package C5;


class Q3 {
    public static void main(String[] args) {
        //作业三-任何异常finally都可以运行
        Exc3 a = new Exc3();
        a.finallys();
    }

}

class Exc3{
    public void finallys(){
        try{
            throw new StackOverflowError("测试内存溢出报错");
        }finally {
            System.out.println("任何异常finally都可以运行");
        }
    }
}
