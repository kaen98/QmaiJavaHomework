
public class Q3 {


}

class Tetromino {
    protected int move(int x) {
        return 0;
    }
}


class T extends Tetromino {

    // 重写
    public int move(int x) {
        return 0;
    }

    // 重写，编译错误： 不能做更严格的限制访问
//    private int move(int x) {
//        return 0;
//    }

    // 重载
    private int move(long x) {
        return 0;
    }

    // 重写， 编译错误： 返回类型不能修改
//    protected long move(int x) {
//        return 0;
//    }
}
