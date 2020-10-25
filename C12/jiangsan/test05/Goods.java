package test05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;

/**
 * @author san
 */
public class Goods implements Comparable<Goods> {
    @Override
    public String toString() {
        return "{\"Goods\":{"
                + "\"id\":"
                + id
                + ",\"name\":\""
                + name + '\"'
                + ",\"price\":"
                + price
                + ",\"createdAt\":\""
                + createdAt + '\"'
                + "}}";

    }

    Integer id;
    String name;
    Float price;
    String createdAt;

    public Goods(Integer id, String name, Float price, String createdAt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.createdAt = createdAt;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public int compareTo(Goods o) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return (int) ((dateFormat.parse(o.getCreatedAt()).getTime()) / 1000L - (dateFormat.parse(this.getCreatedAt()).getTime()) / 1000L);
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
