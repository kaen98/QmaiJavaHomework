/**
 * 0.定义一个数组，其中元素为公司的一级部门名称，按照【下标:值】格式打印出来。
 * 如：0:xxx, 1:xxx, 2:xxx
 */
public class Q1 {
    public static void main(String[] args) {
        String[] list = new String[6];
        list[0] = "ceo";
        list[1] = "内部服务中心";
        list[2] = "客户成功中心";
        list[3] = "市场中心";
        list[4] = "技术中心";
        list[5] = "产品中心";

        for(String row : list) {
            System.out.println(row);
        }
    }
}
