package tets04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestClass {

    public static void main(String[] args) {
        /**
         * Jack：安徽
         * Rose：江苏
         * Divid：浙江
         * Lily：安徽
         * Lucy：浙江
         * Tom：山东
         */

        Person person1 = new Person("Jack", "安徽");
        Person person2 = new Person("Rose", "江苏");
        Person person3 = new Person("Divid", "浙江");
        Person person4 = new Person("Lily", "安徽");
        Person person5 = new Person("Lucy", "浙江");
        Person person6 = new Person("Tom", "山东");


        ArrayList<Person> lists = new ArrayList<>();
        lists.add(person1);
        lists.add(person2);
        lists.add(person3);
        lists.add(person4);
        lists.add(person5);
        lists.add(person6);

        HashMap<String, ArrayList<Person>> map = new HashMap<>();

        for (Person pp : lists) {
            ArrayList<Person> lp = map.get(pp.getArea());

            if (lp == null) {
                lp = new ArrayList<>();
            }

            lp.add(pp);
            map.put(pp.getArea(), lp);
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + "----" + entry.getValue());
        }
    }
}
