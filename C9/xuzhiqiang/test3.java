package classEight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test3 {
    public static void main(String[] strings) {
        //去掉数组【1、2、3、4、2、2、1、5、6】中的重复元素
        int[] num = {1,2,3,4,2,2,1,5,6};
        List list = new ArrayList();
        //遍历数组往集合里存元素
        for(int i=0; i<num.length; i++){
            //如果集合里面没有相同的元素才往里存
            if(!list.contains(num[i])){
                list.add(num[i]);
            }
        }
        System.out.println(list);

    }
}
