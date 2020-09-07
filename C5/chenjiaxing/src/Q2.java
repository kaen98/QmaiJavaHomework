package C5;


class Q2 {
    public static void main(String[] args) {

        //作业二-验证只有try和finally程序可以运行，一旦抛出异常finally依旧可以用来处理需要关闭的程序逻辑，缺点是不容易分辨异常对异常进行细化的处理
        Exc2 a = new Exc2();
        a.test();
    }

}

class Exc2{
    public void test(){
        try{
            Exc x = null;
            System.out.println("进入try方法");
        }finally {
            System.out.println("只有try和finally可以运行");
        }
        System.out.println("离开try");
    }


}
