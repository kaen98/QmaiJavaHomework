import java.util.HashMap;

/**
 * 3. 如何在字符串中找到第一个不重复的字符(使用Java集合框架)
 * 字符串： yellow
 *
 */
public class Q3 {
    public static void main(String[] args) {
        checkString("yellow");
        checkString("apple");
        checkString("avaliable");
        checkString("ss");
    }

    public static void checkString(String s) {
        String[] wordList = s.split("");

        HashMap<String, Integer> wordMap = new HashMap<>();
        for (String word : wordList) {
//            if (wordMap.containsKey(word)) {
//                int wordCount = wordMap.get(word);
//                wordMap.replace(word, wordCount + 1);
//            } else {
//                wordMap.put(word, 1);
//            }
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        for (String word : wordList) {
            int wordCount = wordMap.get(word);
            if (wordCount == 1) {
                System.out.println(s + " 第一个不重复的字符：" + word);
                return;
            }
        }
        System.out.println(s + " 未找到第一个不重复的字符");
    }
}
