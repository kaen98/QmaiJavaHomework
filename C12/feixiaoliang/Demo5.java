import java.util.List;
import java.util.TreeSet;

/**
 * 定义一个商品类（id, 名称，分类，售价，创建时间），重写toString，可以输出json形式的商品信息，同时实现
 * Comparable接口，能在TreeSet中按创建时间倒序排列。
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/10/20 10:49 下午
 */
public class Demo5 {
    public static void main(String[] args){
        //输出json形式商品信息
        System.out.println(new Goods(1,"sdf","sdf",2,"2020-10-23 23:23:23"));

        TreeSet<Goods> goodsList = new TreeSet<Goods>();
        goodsList.add(new Goods(4,"米饭","主食",4,"2020-10-23 23:23:23"));
        goodsList.add(new Goods(7,"小鸡腿","酒水",2,"2020-09-23 23:23:23"));
        goodsList.add(new Goods(9,"红烧肉","必点分组",23,"2020-11-23 23:23:23"));
        goodsList.add(new Goods(1,"大腰子","主食",999,"2020-01-23 23:23:23"));

        System.out.println(goodsList);
    }

    static class Goods implements Comparable<Goods>{
        private int id;
        private String name;
        private String category;
        private int price;
        private String createTime;

        public String getCreateTime() {
            return createTime;
        }

        public Goods(int id, String name, String category, int price, String createTime){
            this.id = id;
            this.name = name;
            this.category = category;
            this.price = price;
            this.createTime = createTime;
        }


        @Override
        public String toString() {
            return "{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", category='" + category + '\'' +
                    ", price='" + price + '\'' +
                    ", createTime='" + createTime + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Goods o) {
            return o.getCreateTime().compareTo(this.createTime);
        }
    }
}
