package main.test01;

public class TestClass {
    public static void main(String[] args) {

        LRULinkedHashMap<String, Integer> map = new LRULinkedHashMap<String, Integer>(3);

        map.putCache("key1", 1);
        map.putCache("key2", 1);
        map.putCache("key3", 1);
        System.out.println(map);
        map.putCache("key4", 1);
        System.out.println(map);
    }
}
