package  C13;

// 为Person类配置了刚刚定义的注解@Info
@Info(isDelete = true)
class Person {
   private String name;
   private int age;
   private boolean isDelete;
}