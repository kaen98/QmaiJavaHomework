package C9;

/**
 * 0.定义一个数组，其中元素为公司的一级部门名称，按照【下标:值】格式打印出来。
 * 如：0:xxx, 1:xxx, 2:xxx
 */
public class Q1 {
    public static void main(String[] args){
        String[] arr = {"内部服务中心", "客户成功中心", "市场中心", "技术中心", "产品中心"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ":" + arr[i] + ",");
        }
    }
}
