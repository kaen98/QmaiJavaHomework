package com.company;

import java.security.PublicKey;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

 class Three {
    public static void main(String[] args) {
       //第一题
        Circular  ci = new Circular();
        ci.seter(15);
        System.out.println(ci.perimeter());

        Triangle  tr = new Triangle();
        tr.seter(10, 11, 12);
        System.out.println(tr.perimeter());

        //第四题
        new mock(10, 2);

        //第二题
        new BeverageMachine();

        //第三题 选A/C


    }
}

//图形抽象类
abstract class Graph{
    abstract double perimeter();
}

//圆形实现类
class Circular extends Graph{
    final double PI=3.14;
    private double R = 0;
    public void seter(double r){
        this.R = r;
    }
    public double perimeter (){
        return 2*PI*this.R;
    }
}

//三角形实现类
class Triangle extends Graph{
    private double X = 0;
    private double Y = 0;
    private double Z = 0;
    public void seter(double x,double y,double z){
        this.X = x;
        this.Y = y;
        this.Z = z;
    }
    public double perimeter (){
        return this.X + this.Y + this.Z;
    }
}

//饮料机器
 class BeverageMachine{
    public BeverageMachine(){
        System.out.println("请问少年需要一杯什么？1.咖啡,2.可乐,3.矿泉水");
        Scanner scan = new Scanner(System.in);
        String read = scan.nextLine();
        if (read.equals("1")) {
            Coffee d = new Coffee();
            d.func();
        } else if(read.equals("2")) {
            Cola d = new Cola();
            d.func();
        } else if(read.equals("3")) {
            MineralWater d = new MineralWater();
            d.func();
        } else {
            System.out.println("没有您点的饮料");
        }
    }
}
//咖啡：加糖加奶什么都不加矿泉水可乐
class Coffee{
    public void func() {
        System.out.println("需要加奶还是加糖？ 1.加奶 2.加糖,3.啥都不加");
        Scanner scan = new Scanner(System.in);
        String read = scan.nextLine();
        if (read.equals("1")) {
            System.out.println("请取走您的加奶咖啡");
        } else if(read.equals("2")) {
            System.out.println("请取走您的加糖咖啡");
        } else if(read.equals("3")) {
            System.out.println("请取走您的咖啡");
        } else {
            System.out.println("无法识别的类型,请重新选择");
            this.func();
        }
    }
}

//可乐：百事/可口
class Cola{

    public void func() {
        System.out.println("需要百事可乐还是可口可乐？ 1.百事可乐 2.可口可乐");
        Scanner scan = new Scanner(System.in);
        String read = scan.nextLine();
        if (read.equals("1")) {
            System.out.println("请取走您的百事可乐");
        } else if(read.equals("2")) {
            System.out.println("请取走您的可口可乐");
        } else {
            System.out.println("无法识别的类型,请重新选择");
            this.func();
        }
    }
}

//矿泉水
class MineralWater{
    public void func() {
        System.out.println("请取走您的矿泉水");
    }
}


interface Compute{
     String getMethod();
     int computer(int n, int m);
}
class add implements Compute{
    final String str = "+";
    public String getMethod(){
        return this.str;
    }
     public int computer(int a, int b){
         return a+b;
     }
}

class sub implements Compute{
    final String str = "-";
    public String getMethod(){
        return this.str;
    }
     public int computer(int a, int b){
         return a-b;
     }
}

class mul implements Compute{
    final String str = "*";
    public String getMethod(){
        return this.str;
    }
     public int computer(int a, int b){
         return a*b;
     }
}

class div implements Compute{
    final  String str = "/";
    public String getMethod(){
        return this.str;
    }
    public int computer(int a, int b){
        return a/b;
    }
}

class UseCompute{
     public void useCom(Compute com, int a,int b){
         System.out.println(a + com.getMethod() + b +"="+com.computer(a,b));
     }
}

class mock{
     public mock(int a,int b){
         Compute add = new add();
         Compute sub = new sub();
         Compute mul = new mul();
         Compute div = new div();
         UseCompute use = new UseCompute();
         use.useCom(add, a, b);
         use.useCom(sub, a, b);
         use.useCom(mul, a, b);
         use.useCom(div, a, b);
     }
}
