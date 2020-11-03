package xuzhiqiang;

import java.util.Objects;

public enum  month {
        /**
         * 定义一个月份枚举，1-> 1月， 2 -> 2月，以此类推，根据输入的数值返回对应的月份
         * @param args
         */
        baiJanuary(1, "一月"),
        February(2, "二月"),
        March(3, "三月"),
        April(4, "四月"),
        May(5, "五月"),
        June(6, "六月"),
        July(7, "七月"),
        August(8, "八月"),
        September(9, "九月"),
        October(10, "十月"),
        November(11, "十一月"),
        December(12, "十二月");

        int value;
        String desc;
        month(int value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        public static String getDesc(Integer value) {

            if (Objects.isNull(value)) {
                throw new IllegalArgumentException("参数异常");
            }
            for (month weekEnum : month.values()) {
                if (Objects.equals(weekEnum.value, value)) {
                    return weekEnum.desc;
                }
            }
            throw new IllegalArgumentException("参数异常");
        }


}
