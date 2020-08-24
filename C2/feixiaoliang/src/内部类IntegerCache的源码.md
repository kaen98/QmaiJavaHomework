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
    	// 设置最小值
        static final int low = -128;
        // 设置最大值
        static final int high;
        // 定义缓存数组
        static final Integer cache[];

        // 静态代码块
        static {
            // 默认 127
            int h = 127;
            // 从配置中获取最大值
            String integerCacheHighPropValue =
                sun.misc.VM.getSavedProperty("java.lang.Integer.IntegerCache.high");
            if (integerCacheHighPropValue != null) {
                try {
                    int i = parseInt(integerCacheHighPropValue);
                    // high值必须是>=127,不能低于127
                    i = Math.max(i, 127);
                    // 最大值是2^31-1-128-1
                    h = Math.min(i, Integer.MAX_VALUE - (-low) -1);
                } catch( NumberFormatException nfe) {
                    // If the property cannot be parsed into an int, ignore it.
                }
            }
            high = h;

            // 初始化缓存数值，最小256，最大2^31-1
            cache = new Integer[(high - low) + 1];
            int j = low;
            for(int k = 0; k < cache.length; k++)
                cache[k] = new Integer(j++);

            // 保证数组留存在 -128~127 区间
            assert IntegerCache.high >= 127;
        }

        private IntegerCache() {}
    }

```