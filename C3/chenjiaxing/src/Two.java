package com.company;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Two {
    public static void main(String[] args) {
        //第三题
        Interval i = new Interval();
        i.get(30000);
        //第一题
        discount  discount = new discount(1);
        System.out.println(discount.get(1000));

        //第二题
        Guess g = new Guess();
        g.set();
        g.get();

        //第四题
        SuShuo s = new SuShuo();
        s.get();

        //第五题
        Mul m = new Mul();
        m.get();
    }
}

class discount{
    public int level = 1; //会员等级

    public discount (int level) {
        this.level = level;
    }
    public int get(int price) {
        int discount = 100;
        switch (level) {
            case 1:
                if (price >= 10000) {
                    discount = 90;
                }
                break;
            case 2:
                if (price >= 10000 && price <= 19999) {
                    discount = 80;
                } else if(price >= 20000) {
                    discount = 75;
                }
                break;
            case 3:
                if (price >= 10000 && price <= 19999) {
                    discount = 70;
                } else if(price >= 20000 && price <= 29999) {
                    discount = 65;
                } else if(price >= 30000) {
                    discount = 60;
                }
                break;
            default:
                if (price >= 50000) {
                    discount = 90;
                }
                break;
        }
        return discount;
    }
}

class Guess {
    public int num1,num2,num3,num4,num5;
    public void set() {
        Random r = new Random();
        this.num1 = r.nextInt(1000);
        this.num2 = r.nextInt(1000);
        this.num3 = r.nextInt(1000);
        this.num4 = r.nextInt(1000);
        this.num5 = r.nextInt(1000);
        System.out.println("随机值num1：" + this.num1);
        System.out.println("随机值num2：" + this.num2);
        System.out.println("随机值num3：" + this.num3);
        System.out.println("随机值num4：" + this.num4);
        System.out.println("随机值num5：" + this.num5);
    }

    public void get(){
        System.out.println("猜出num1：" + (1000 - (1000 - this.num1)));
        System.out.println("猜出num2：" + (1000 - (1000 - this.num2)));
        System.out.println("猜出num3：" + (1000 - (1000 - this.num3)));
        System.out.println("猜出num4：" + (1000 - (1000 - this.num4)));
        System.out.println("猜出num5：" + (1000 - (1000 - this.num5)));
    }
}

class Interval{
    public void get(int x){
        long i = Calendar.getInstance().getTimeInMillis();
        System.out.println("初始值："+i);
        long yuqi = i + x;
        System.out.println("预期最终值："+yuqi);
        byte x1 = 0;
        while (true) {
            try {
                if (x1==0) {
                    Thread.sleep(29000);
                    x1=1;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (yuqi == Calendar.getInstance().getTimeInMillis()) {
                System.out.println("最终值："+Calendar.getInstance().getTimeInMillis());
                break;
            }
        }
    }
}

class SuShuo {
    public void get() {
        int i,j;
        System.out.println("101-200的素数有:");
        for (i=101;i<=200;i++) {
            for(j=2;j<i;j++){
                if(i%j==0){
                    break;
                }
            }
            if (i==j) {
                System.out.println(i);
            }
        }
        System.out.println("=========================");
    }
}

class Mul {
    public void get() {
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+" ");
            }
            System.out.println( );
        }
    }
}