package xuzhiqiang;

import java.util.HashMap;
import java.util.Map;

public class testThree {
    /**
     * 如何在字符串中找到第一个不重复的字符(使用Java集合框架)
     * 字符串： yellow
     */
    public static void main(String[] args){
        Character norRepeatString = null;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        String str ="yellow'";
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            } else {
                norRepeatString= str.charAt(i);
                break;
            }
        }
        System.out.println(norRepeatString);
    }
}

