package test3;

public class Tetromino {

    protected int move(int x) {
        return 0;
    }
}

class T extends Tetromino {
    //public int move(int x) {
    //    return 0;
    //} //可以

    //private int move(int x) {
    //    return 0;
    //} 属性不能缩小

    //private int move(long x) {
    //    return 0;
    //} 属性不能缩小

    //protected long move(int x) {
    //    return 0;
    //} 不返回0的话 也可以
}
