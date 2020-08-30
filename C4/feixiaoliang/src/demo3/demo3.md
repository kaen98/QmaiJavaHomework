```
    public class Tetromino {
        protected int move(int x) {
             return 0;
        }
    }
    class T extends Tetromino {
         <插入代码>
    }
    在<插入代码>处填入选项中的代码，使T类没有编译错误的是（A、C）

    （分析：重写访问权限不能比父类更低，所以答案排除B）
    （分析：重写返回值和形参都不能改变，答案排除D）
    
    A.public int move(int x) { return 0; }
    
    B.private int move(int x) { return 0; }
    
    C.private int move(long x) { return 0; }
    
    D.protected long move(int x) { return 0; }
```
