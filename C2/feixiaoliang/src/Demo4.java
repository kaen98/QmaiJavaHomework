/**
 * 实现ASCII和char互转
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/8/23 9:53 下午
 */
public class Demo4 {
    public static void main(String[] args) {
        char i = 'a';
        System.out.println("字符:" + i + " ascii码:" + Demo4.asciiMarshalChar(i));

        int a = 40;
        System.out.println("ascii码:" + a + " 字符:" + Demo4.asciiMarshalChar(a));
    }

    /**
     * ascii码转char
     *
     * @param i ascii码值
     * @return 返回char值
     */
    public static char asciiMarshalChar(int i) {
        return (char) i;
    }

    /**
     * char转ascii
     *
     * @param i char值
     * @return 返回ascii码值
     */
    public static int asciiMarshalChar(char i) {
        return (int) i;
    }
}
