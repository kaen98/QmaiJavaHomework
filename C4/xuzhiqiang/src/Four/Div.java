package classThree.Four;

public class Div implements Compute{
    @Override
    public int computer(int n, int m) {
        if(m!=0){
            return n/m;
        }
        System.out.println("输入数值错误");
        return 0;
    }
}
