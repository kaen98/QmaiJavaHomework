import java.util.HashMap;

public class Q1 {
    public static void main(String[] args) {
        String s = "If you want to change your life I think you must come to learn English";
        String[] wordList = s.split(" ");

        HashMap<String, Integer> wordMap = new HashMap<>();
        for (String word : wordList) {

            // 统计方法一
//            if (wordMap.containsKey(word)) {
//                int wordCount = wordMap.get(word);
//                wordMap.replace(word, wordCount + 1);
//            } else {
//                wordMap.put(word, 1);
//            }

            // 统计方法二
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        for (String word : wordMap.keySet()) {
            System.out.println(word + "=" + wordMap.get(word));
        }
    }
}
