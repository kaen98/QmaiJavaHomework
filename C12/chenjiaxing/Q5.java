package C12;

import java.util.TreeSet;

class Q5 {
    public static void main(String[] args) {
        /**
         * 定义一个商品类（id, 名称，分类，售价，创建时间），重写toString，可以输出json形式的商品信息，同时实现Comparable接口，能在TreeSet中按创建时间倒序排列。
         * */
        TreeSet<Goods> s = new TreeSet<>();
        s.add(new Goods(1, "杨枝甘露1", 2, 14.3f, "2020-10-10 10:10:10"));
        s.add(new Goods(2, "杨枝甘露2", 2, 14.3f, "2020-10-11 10:10:10"));
        s.add(new Goods(5, "杨枝甘露5", 2, 14.3f, "2020-10-13 10:10:10"));
        s.add(new Goods(6, "杨枝甘露6", 2, 14.3f, "2020-10-15 10:10:10"));
        s.add(new Goods(3, "杨枝甘露3", 2, 14.3f, "2020-10-12 10:10:10"));
        s.add(new Goods(4, "杨枝甘露4", 2, 14.3f, "2020-10-14 10:10:10"));
        System.out.println(s);
    }
}

 class Goods implements Comparable<Goods> {
    int id = 0;
    String name = "";
    int category = 0;
    double price = 0;
    String create_at = "";

    public Goods(int id, String name, int category, double price, String create_at) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.create_at = create_at;
    }
    public String toString (){
        return "{\"id\":"+ this.id +", \"name\":\""+this.name+"\",\"Category\":"+this.category+",\"Price\":"+this.price+",\"CreateAt\":"+this.create_at+"}";
    }

    public int compareTo(Goods g){
        return g.create_at.compareTo(this.create_at);
    }
}