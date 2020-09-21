package C7;

class Q5 {
    public static void main(String[] args) {
        //第五题 以下程序字符串用+号拼接，分别创建了几个对象
        String str = "hello" + "world"; //常量池创建一个对象，并返回地址引用

        //抛开第一个案例这里在常量池创建了两个对象并返回地址引用
        String str1 = "hello"; String str2=str1+"world";

        //抛开上面的案例，这里在堆里创建了str3并复制对象到常量池这里就产生了两个对象，str4在常量池创建了一个对象，一共3个对象
        String str3 = new String("hello"); String str4= str3+"world";

    }

}
