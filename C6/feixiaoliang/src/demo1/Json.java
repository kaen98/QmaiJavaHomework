package demo1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/20 9:58 下午
 */
public class Json {
    Object obj;

    public Json(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        Class cla = this.obj.getClass();
        //获取类属性值
        Field[] fields = cla.getDeclaredFields();
        StringBuilder toString = new StringBuilder();

        toString.append("{");
        for (Field field : fields) {

            System.out.println(field.getGenericType().toString());
            //判断String类型
            if ("class java.lang.String".equals(field.getGenericType().toString())) {
                try {
                    Method method = (Method) this.obj.getClass().getMethod("get" + this.getMethodName(field.getName()));
                    //调用getter方法获取属性值
                    String val = (String) method.invoke(this.obj);
                    if (val != null) {
                        toString.append("\"").append(field.getName()).append("\":\"").append(val).append("\",");
                        System.out.println("String type:" + val);
                    }
                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }

            //判断int类型
            if ("int".equals(field.getGenericType().toString())) {
                try {
                    //获取方法
                    Method method = (Method) this.obj.getClass().getMethod("get" + this.getMethodName(field.getName()));
                    // 调用getter方法获取属性值
                    int val = (int) method.invoke(this.obj);
                    toString.append("\"").append(field.getName()).append("\":").append(val).append("\",");
                    System.out.println("String type:" + val);

                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

        toString.deleteCharAt(toString.length() - 1);

        toString.append("}");

        return toString.toString();
    }

    /**
     * 把第一个字母转换成大写
     * @param fildeName
     * @return
     */
    private String getMethodName(String fildeName) {
        byte[] items = fildeName.getBytes();
        items[0] = (byte) ((char) items[0] - 'a' + 'A');
        return new String(items);
    }
}
