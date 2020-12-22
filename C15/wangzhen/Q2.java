package C15;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 编写一个泛型方法，使之能处理所有Fruit子类的集合；
 */
class Q2 {
    public static void main(String[] args) {
        F<Fruit> apple = new F<>(new Apple());
        apple.set(new Apple2());
        apple.get();
    }
}

class Fruit {

}
class Apple extends  Fruit{

}

class Apple2 extends  Fruit{

}

class F <T>{
    private ArrayList<T> item;

    public F(T t){
        ArrayList<T> it = new ArrayList();
        it.add(t);
        this.item = it;
    }
    public void get() {
        Iterator<T> item = this.item.iterator();
        while(item.hasNext()){
            System.out.println(item.next());
        }
    }

    public void set(T t) {
        this.item.add(t);
    }
}