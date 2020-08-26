# Q1: byte、int 与 二进制 互转，先将byte的127、128、-128、-128转二进制，再将这些二进制转int
```
public class Q1 {
    public static void main(String[] args) {
        int[] intList = {127, 128, -128, -129};

        for (int i : intList) {
            // byte数据
            byte b = (byte)i;
            
            // 二进制数据
            String s = Integer.toBinaryString(b);

            System.out.println(i);
            System.out.println(" => (byte)" + b);
            System.out.println(" => (Binary)" + s);
            System.out.println(" => (Int)" + Integer.parseInt(s, 2));
            System.out.println();
        }
    }
}
```

# Q2: 阅读Integer内部类IntegerCache的源码

```
/**
     * Cache to support the object identity semantics of autoboxing for values between
     * -128 and 127 (inclusive) as required by JLS.
     *
     * The cache is initialized on first usage.  The size of the cache
     * may be controlled by the {@code -XX:AutoBoxCacheMax=<size>} option.
     * During VM initialization, java.lang.Integer.IntegerCache.high property
     * may be set and saved in the private system properties in the
     * sun.misc.VM class.
     */

    private static class IntegerCache {
    	// 缓存数据的, 最小值
        static final int low = -128;
        // 缓存数据的, 最大值 (默认为127)
        static final int high;
        // 缓存的Integer类型数组
        static final Integer cache[];

        // static代码块: 在类初次被加载的时候执行, 并且只会执行一次, 提高性能
        static {
            // 默认 127
            int h = 127;
            // 从 VM 配置中, 获取配置值
            String integerCacheHighPropValue =
                sun.misc.VM.getSavedProperty("java.lang.Integer.IntegerCache.high");
            if (integerCacheHighPropValue != null) {
                try {
                    // 配置值, string转int
                    int i = parseInt(integerCacheHighPropValue);
                    // high值的最小只能为127, 比如设置为126无效
                    i = Math.max(i, 127);
                    //  控制数组大小最大元素个数为 Integer.MAX_VALUE
                    h = Math.min(i, Integer.MAX_VALUE - (-low) -1);
                } catch( NumberFormatException nfe) {
                    // If the property cannot be parsed into an int, ignore it.
                }
            }
            high = h;

            // 初始化缓存, 默认范围 -128 ~ 127;  通过配置, 最大范围 -128 ~ (Integer.MAX_VALUE - (-low) -1)
            cache = new Integer[(high - low) + 1];
            int j = low;
            for(int k = 0; k < cache.length; k++)
                cache[k] = new Integer(j++);

            // 断言high最小值为127
            assert IntegerCache.high >= 127;
        }

        private IntegerCache() {}
    }

```

# Q3: 写个工具类，实现类型转换，String 转 (int、long、float、double、byte[])，(byte[]、int) 转 String
```
public class Util {

	// String 转 (int、long、float、double、byte[])
    public static int stringToInt(String s) {
        return Integer.parseInt(s);
    }

    public static long stringToLong(String s) {
        return Long.parseLong(s);
    }

    public static float stringToFloat(String s) {
        return Float.parseFloat(s);
    }

    public static double stringToDouble(String s) {
        return Double.parseDouble(s);
    }

    public static byte[] stringToByteArray(String s) {
        return s.getBytes(StandardCharsets.UTF_8);
    }

    // (byte[]、int) 转 String
    public static String byteArrayToString(byte[] byteArray) {
        return new String(byteArray, StandardCharsets.UTF_8);
    }

    public static String intToString(int i) {
        return String.valueOf(i);
    }
}
```

# Q4: 写个工具类，实现ASCII和char互转
```
public class Util {
    public static String charToASCII(char c) {
        String cc = Integer.toHexString(c | 0x10000);
        String ccc = cc.substring(1);
        return "\\u" + ccc;
    }

    public static char ASCIIToChar(int asscii) {
        return (char) asscii;
    }
}
```


# Q5: 写个工具类，实现二进制、十进制、十六进制互转
```

public class Util {
    // 二进制， 转十进制
    public static String BinaryToDecimal(String b) {
        int i = Integer.parseInt(b, 2);
        return Integer.toString(i, 10);
    }

    // 二进制， 转十六进制
    public static String BinaryToHex(String b) {
        int i = Integer.parseInt(b, 2);
        return Integer.toString(i, 16);
    }

    // 十进制， 转二进制
    public static String DecimalToBinary(String d) {
        int i = Integer.parseInt(d, 10);
        return Integer.toString(i, 2);
    }


    // 十进制， 转十六进制
    public static String DecimalToHex(String d) {
        int i = Integer.parseInt(d, 10);
        return Integer.toString(i, 16);
    }

    // 十六进制， 转二进制
    public static String HexToBinary(String d) {
        int i = Integer.parseInt(d, 16);
        return Integer.toString(i, 2);
    }

    // 十六进制， 转十进制
    public static String HexToDecimal(String d) {
        int i = Integer.parseInt(d, 16);
        return Integer.toString(i, 10);
    }
}
```