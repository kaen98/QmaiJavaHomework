/**
 * throw和throws的区别是什么？请写一段程序加以说明。
 * 答：throw 当前程序段抛出异常； throws 向上层暴露方法会有哪些异常
 */
public class Q4 {
    private String name;

    public String getName() throws NameIsEmptyException
    {
        if (this.name == "") {
            throw new NameIsEmptyException("exception is empty");
        }
        return this.name;
    }
}

class NameIsEmptyException extends Exception {
    public NameIsEmptyException(String s) {
        super(s);
    }
}
