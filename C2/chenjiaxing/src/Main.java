package com.company;

import java.math.BigInteger;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //第一题
        byte b127 = 127;
        byte b128 = (byte)128;
        byte b1128 = -128;
        NumberConversion i = new NumberConversion();
        i.toPrintStr("127转二进制",i.toBinary(b127));
        i.toPrintInt("127由二进制转10进制", i.toDecimal(i.toBinary(b127)));

        i.toPrintStr("128转二进制",i.toBinary(b128));
        i.toPrintInt("128由二进制转10进制", i.toDecimal(i.toBinary(b128)));

        i.toPrintStr("-128转二进制",i.toBinary(b1128));
        i.toPrintInt("-128由二进制转10进制", i.toDecimal(i.toBinary(b1128)));

        //第三题
        String x = "10086";
        StringConversion strcon = new StringConversion();
        IntToStr intstr = new IntToStr();
        ByteArrayToStr bytearr = new ByteArrayToStr();
        System.out.println(Arrays.toString(strcon.toByte(x)));
        System.out.println(strcon.toDouble(x));
        System.out.println(strcon.toFloat(x));
        System.out.println(strcon.toInt(x));
        System.out.println(strcon.toLong(x));
        System.out.println(intstr.convent(strcon.toInt(x)));
        System.out.println(bytearr.convent(strcon.toByte(x)));
        //第四题
        AsciiCharConvent asciichar = new AsciiCharConvent();
        System.out.println(asciichar.toAscii('中'));
        System.out.println(asciichar.toChar(20013));
        //第五题
        Convent c = new Convent();
        System.out.println(c.binToDec(c.decToBin(x)));
        System.out.println(c.decToBin(x));
        System.out.println(c.hexToBin(x));
        System.out.println(c.binToHex(c.decToBin(x)));
        System.out.println(c.decToHex(10086));
        System.out.println(c.hexToDec(x));
    }


}

class NumberConversion{
    public String toBinary(int a) {
        return Integer.toString(a, 2);
    }

    public int toDecimal(String str) {
        return Integer.parseInt(str, 2);
    }

    public void toPrintStr(String name, String i){
         System.out.println(name+":"+i);
    }

    public void toPrintInt(String name, int i){
        System.out.println(name+":"+i);
    }
}

class StringConversion{
    public int toInt(String str) {
        return Integer.parseInt(str);
    }

    public long toLong(String str) {
        return Long.parseLong(str);
    }

    public float toFloat(String str) {
        return Float.parseFloat(str);
    }

    public double toDouble(String str) {
        return Double.parseDouble(str);
    }

    public byte[] toByte(String str) {
        byte[] b = str.getBytes();
        return b;
    }
}

class ByteArrayToStr {
    public String convent(byte[] b){
        return new String(b);
    }
}
class IntToStr {
    public String convent(int b){
        return b + "";
    }
}

class AsciiCharConvent{
    public int toAscii(char c) {
        return c;
    }

    public char toChar(int c) {
        return (char)c;
    }
}

class Convent{
    public String decToBin(String a){
        BigInteger bi = new BigInteger(a);
        return bi.toString(2);
    }

    public String binToDec(String a){
        BigInteger bi = new BigInteger(a, 2);
        return bi.toString();
    }

    public int hexToDec(String a) {
        return Integer.parseInt(a, 16);
    }

    public String decToHex(int a) {
        return Integer.toHexString(a);
    }

    public String binToHex(String a) {
        return Integer.toHexString(Integer.parseInt(a, 2));
    }

    public String hexToBin(String a) {
        return Integer.toString(Integer.parseInt(a, 16), 2);
    }
}