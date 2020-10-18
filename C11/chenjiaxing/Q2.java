package C11;

import java.util.*;

class Q2 {
    public static void main(String[] args) {
        /**
         * 2. 将玩家姓名和游戏得分录入系统，输出排名前三的玩家和其得分。
         * 玩家A：10分，玩家B：40分，玩家C：30分，玩家D：20分，玩家E：50分
         */
        HashMap<String, Integer> str = new HashMap<>();
        HashMap<String, Integer> str1 = new HashMap<>();
        HashMap<Integer, String> str2 = new HashMap<>();
        str.put("玩家A", 10);
        str.put("玩家B", 40);
        str.put("玩家C", 30);
        str.put("玩家D", 20);
        str.put("玩家E", 50);
        str1 = str;
        Set<Map.Entry<String, Integer>> entrySet = str1.entrySet();
        for(int i=0;i<3;i++){
            for(Map.Entry<String, Integer> ent : entrySet){
              if (str2.get(i) == null){
                  str2.put(i, ent.getKey() +"_"+ent.getValue());
              }else {
                  String[] s=str2.get(i).split("_");
                  if (Integer.parseInt(s[1]) < ent.getValue()) {
                      str2.put(i, ent.getKey() +"_"+ent.getValue());
                  }
              }
            }
            String[] ss = str2.get(i).split("_");
            str1.remove(ss[0]);
        }
        Set<Map.Entry<Integer, String>> entrySet1 = str2.entrySet();
        for(Map.Entry<Integer, String> ent : entrySet1){
            String[] s=ent.getValue().split("_");
            System.out.println("名次："+(ent.getKey()+1) +";姓名："+s[0]+";得分："+s[1]);
        }
    }
}
