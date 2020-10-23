package xuzhiqiang;

import java.util.TreeSet;

public class questFive {
    /**
     *定义一个商品类（id, 名称，分类，售价，创建时间），重写toString，可以输出json形式的商品信息，同时实现Comparable接口，能在TreeSet中按创建时间倒序排列
     * @param args
     */
    public static void main(String[] args) {
        TreeSet<Object> goods = new TreeSet<>();
        goods.add(new Goods(1, "苹果", "水果",  8.00f,"2020-10-20 08:10:00"));
        goods.add(new Goods(1, "小青菜", "蔬菜",  2.00f,"2020-10-20 09:10:00"));
        goods.add(new Goods(1, "椰汁", "饮料",  15.00f,"2020-10-20 08:11:00"));

        System.out.println(goods);
    }
}

class Goods implements Comparable {
    int id;
    String name;
    String category;
    float sellPrice;
    String createTime;

    public Goods (int id, String name, String category, float sellPrice, String createTime) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.sellPrice = sellPrice;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", sellPrice=" + sellPrice +
                ", createTime='" + createTime + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object g) {
        Goods goods = (Goods)g;
        return goods.createTime.compareTo(this.createTime);
    }
}
