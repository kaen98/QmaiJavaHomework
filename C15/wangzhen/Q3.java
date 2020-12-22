package C15;

/**
 * 编写一个泛型方法，使之能自动将Object类型转换成其他类型；
 */
class Q3 {
    public static void main(String[] args) {
        Object o = new Apple3();
        System.out.println(Tobj.<Object,Apple3>getType(o).getClass());
    }
}

class  Apple3{

}

class Tobj{
    public static <T,TT> TT getType(T t){
        return (TT)t;
    }
}