package C7;

class Q3 {
    public static void main(String[] args) {
      //第三题 abcd23abcd34bcd，判断字符串中包含bc字串并求字串所有出现位置
        String str = "abcd23abcd34bcd";
        sumStr1(str, "bc");
    }

    public static void sumStr1(String str, String str1) {
        int position = 0;
        byte i = 0;
        while(str.indexOf(str1)>=0) {
            i++;
            position = position + str.indexOf(str1);
            str=str.substring(str.indexOf(str1)+str1.length());
            if (i > 1) {
                position = position + 2;
            }
            System.out.println("bc出现位置："+position);
        }
    }

}
