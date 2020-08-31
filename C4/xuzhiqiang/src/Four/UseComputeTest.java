package classThree.Four;

public class UseComputeTest {
    public static void main(String[] String) {
        UseCompute uc=new UseCompute();
        Plus a1=new Plus();
        Sub a2=new Sub();
        Multi a3=new Multi();
        Div a4=new Div();
        System.out.println("2加3");uc.useCom(a1,2,3);
        System.out.println("2减3");uc.useCom(a2,2,3);
        System.out.println("1乘2:");uc.useCom(a3,1,2);
        System.out.println("6除2:");uc.useCom(a4,6,2);
    }
}
