package demo3;

import java.util.Objects;

/**
 * 创建一个带id属性的实体类，覆写hashCode和equals方法；
 * 将实体类放入集合中，使相同id值得对象不重复
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/21 12:49 上午
 */
public class Demo3 {

    public static void main(String[] args) {

        Test test1 = new Test(1);
        Test test2 = new Test(1);

        System.out.println("test1 equals test2 : " + (test1.equals(test2)));
        System.out.println("test1 == test2 : " + (test1 == test2));

    }

    static class Test {
        private int id;

        public Test(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }

            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Test test = (Test) o;
            return id == test.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
}
