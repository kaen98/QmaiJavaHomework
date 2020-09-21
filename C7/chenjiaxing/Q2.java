package C7;

class Q2 {
    public static void main(String[] args) {
      //第二题 将jdk全部转大写，截取子串DK
        String j = "jdk";
        //字符转大写
        j = j.toUpperCase();
        //截取字串DK
        j = j.replace("DK", "");
        System.out.println(j);
    }

}
