package C15;

import java.util.*;

/**
 * 编写一个通用的LRU缓存
 */
class Q1 {

    public static void main(String[] args) {
        LRUCache<Integer,String> lru = new LRUCache<Integer,String>(3);
        lru.put(1,"a");
        lru.put(2,"b");
        lru.put(3,"c");
        lru.put(4,"d");
        lru.put(4,"a");
        lru.put(5,"e");
        lru.get();
    }
}

class LRUCache<K,V> {
    private int num = 0;
    private LinkedHashMap<K,V> map = null;
    private Object[] StrArr ;
    LRUCache(int num){
        this.StrArr = new Object[num];
        this.num = num;
    }
    public void get(){
        Set<Map.Entry<K, V>> entrySet = this.map.entrySet();
        for(Map.Entry<K, V> ent : entrySet){
            System.out.println("key:"+ent.getKey()+";value:"+ent.getValue());
        }
    }
    public int put(K k, V v){
        int size = 0;
        if (this.map == null) {
             size = 1;
        } else {
             size = this.map.size()+1;
        }
        if (this.map == null) {
            this.StrArr[size-1] = k;
            this.map = new LinkedHashMap<>();
        } else if(size > this.num) {
            this.map.remove(this.StrArr[0]);
            for(int i=0;i<this.num;i++) {
                if (i!=0) {
                    this.StrArr[i-1] = this.StrArr[i];
                }
            }
            this.StrArr[this.num-1] = k;
        } else {
            this.StrArr[size-1] = k;
        }

        this.map.put(k, v);
        return 1;
    }
}