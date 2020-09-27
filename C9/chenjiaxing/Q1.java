package C9;

class Q1 {
    public static void main(String[] args) {
       // 0.定义一个数组，其中元素为公司的一级部门名称，按照【下标:值】格式打印出来
        String[] a = {"内部服务中心", "客户成功中心", "市场中心", "技术中心", "产品中心"};
        for (int i=0;i<a.length;i++){
            System.out.println("【"+i+":"+a[i]+"】");
        }
    }
}
