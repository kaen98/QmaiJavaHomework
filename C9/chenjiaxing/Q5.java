package C9;

import java.util.Arrays;

class Q5 {
    public static void main(String[] args) {
        //4.写一段代码，实现System.arraycopy方法的功能。
        //利用重载的特性实现不同类型arraycopy的效果，这里仅拿int和string举例
        String[] a = {"1","2","3","4"};
        String[] b = new String[10];
        arraycopy(a, 1, b, 3, 3);
    }
    public static void arraycopy(int[] a, int b, int[] c, int d, int e){
        for(int i=b;i<e+b;i++){
            c[d+(i-b)] = a[i];
        }
    }

    public static void arraycopy(String[] a, int b, String[] c, int d, int e){
        for(int i=b;i<e+b;i++){
            c[d+(i-b)] = a[i];
        }
        System.out.println(Arrays.toString(c));
    }
}
