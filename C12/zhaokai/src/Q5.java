import javax.swing.event.TreeSelectionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeSet;

/**
 * 定义一个商品类（id, 名称，分类，售价，创建时间），重写toString，可以输出json形式的商品信息，同时实现Comparable接口，能在TreeSet中按创建时间倒序排列。
 */
public class Q5 {
    public static void main(String[] args) throws ParseException {
        Goods a = new Goods(1, "面包","包类", 12.00, new SimpleDateFormat("yyyy-MM-dd").parse("2020-10-10"));
        Goods b = new Goods(1, "奶茶","茶类", 20.00, new SimpleDateFormat("yyyy-MM-dd").parse("2020-10-02"));

        System.out.println(a);
        System.out.println(b);

        TreeSet<Goods> gSet = new TreeSet<>();
        gSet.add(a);
        gSet.add(b);
        System.out.println(gSet);
    }
}

class Goods implements Comparable {
    private int id;
    private String name;
    private String categoryName;
    private double price;
    private Date createdAt;

    public Goods(int id, String name, String categoryName, double price, Date createdAt) {
        this.id = id;
        this.name = name;
        this.categoryName = categoryName;
        this.price = price;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", price=" + price +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }

    public int compareTo(Object g){
        if (!(g instanceof Goods)) {
            return 0;
        }
        Goods goods = (Goods)g;
        return this.createdAt.compareTo(goods.createdAt);
    }
}