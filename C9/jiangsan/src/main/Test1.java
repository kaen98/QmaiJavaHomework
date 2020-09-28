package main;

/**
 * 定义一个数组，其中元素为公司的一级部门名称，按照【下标:值】格式打印出来
 *
 * @author san
 */
public class Test1 {
    public static void main(String[] args) {

        String[] items = new String[]{"中台", "大数据", "大前端", "店小铺"};

        for (int i = 0; i < items.length; i++) {
            System.out.println("【" + i + ":" + items[i] + "】");
        }
    }
}
