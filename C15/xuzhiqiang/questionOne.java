package xuzhiqiang;

import java.util.HashMap;

public class questionOne {
    /**
     *编写一个通用的LRU缓存
     * @param args
     */
    public static void main(String[] args) {
        LRUCache cache = new LRUCache( 2 );
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3);
        System.out.println(cache.get(3));
        System.out.println(cache.get(2));
    }
}



class LRUCache {
    private HashMap<Integer,LinkedNode> cache = new HashMap();//方便通过key快速定位结点
    private int size;
    private int capacity;
    private LinkedNode head,tail;
    class LinkedNode{
        int key;
        int value;
        LinkedNode pre;
        LinkedNode next;
    }
    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new LinkedNode();
        tail = new LinkedNode();
        head.next = tail;
        tail.pre = head;
    }

    private void removeNode(LinkedNode node) {
        LinkedNode preNode = node.pre;
        LinkedNode nextNode = node.next;
        preNode.next = nextNode;
        nextNode.pre = preNode;
    }

    private void addNode(LinkedNode node) {
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
    }

    private void moveToHead(LinkedNode node) {
        removeNode(node);
        addNode(node);
    }

    public int get(int key) {
        LinkedNode node = cache.get(key);
        if(node != null) {
            moveToHead(node);
        }else{
            return -1;
        }
        return node.value;
    }

    public void put(int key, int value) {
        LinkedNode node = cache.get(key);
        if(node != null) {
            node.value = value;
            moveToHead(node);
        }
        else{
            LinkedNode newNode = new LinkedNode();
            newNode.key = key;
            newNode.value = value;
            cache.put(key,newNode);
            addNode(newNode);
            size++;
            if(size > capacity) {
                LinkedNode tailPre = tail.pre;
                cache.remove(tailPre.key);
                removeNode(tailPre);
                size--;
            }
        }
    }
}
