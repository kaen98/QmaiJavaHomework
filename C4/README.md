![包和类及其特性](https://github.com/kaen98/QmaiJavaHomework/blob/master/images/c4.png)

### Q1. 写一段会员打折的程序代码，规则如下：

```
1级会员消费满100打9折；
2级会员消费满100打8折，满200打7.5折
3级会员消费满100打7折，满200打6.5折，满300打6折；
非会员消费满500打9折；
```


### 1. 求不同图形的周长
```
Graph类包含一个求周长的抽象方法
圆
三角形
```

### 2. 编写程序实现软料购买：
```
编写程序，接收用户输入的信息，选择购买的饮料。
可供选择的饮料有：咖啡、矿泉水和可乐。
其中，购买咖啡时可以选择：加糖、加奶还是什么都不加。
购买可乐时可以选择：买可口可乐还是百事可乐
```

### 3.多选题，
```
public class Tetromino {
    protected int move(int x) {
         return 0;
    }
}
class T extends Tetromino {
     <插入代码>
}
在<插入代码>处填入选项中的代码，使T类没有编译错误的是（）

A.public int move(int x) { return 0; }

B.private int move(int x) { return 0; }

C.private int move(long x) { return 0; }

D.protected long move(int x) { return 0; }

```




### 4. 结合 static 和 final 关键字，利用接口做参数，写个计算器，能完成+-*/运算
```
（1）定义一个接口Compute含有一个方法int computer(int n,int m);
（2）设计四个类分别实现此接口，完成+-*/运算
（3）设计一个类UseCompute，含有方法：public void useCom(Compute com, int one, int two)
     此方法要求能够：
     1．用传递过来的对象调用computer方法完成运算
     2．输出运算的结果
（4）设计一个测试类，调用UseCompute中的方法useCom来完成+-*/运算

```
