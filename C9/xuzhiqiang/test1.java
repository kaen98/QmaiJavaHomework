package classEight;

public class test1 {
//    定义一个数组，其中元素为公司的一级部门名称，按照【下标:值】格式打印出来
    public static  void main(String[] strings) {
        String[] company = {"市场", "产品", "研发", "运费", "测试", "人事", "财务"};
        String returnData = "";
        for (int i = 0; i < company.length; i++) {
            returnData += i+":"+company[i]+",";
        }
        returnData = returnData.substring(0, returnData.length()-1);
        System.out.println(returnData);
    }
}
