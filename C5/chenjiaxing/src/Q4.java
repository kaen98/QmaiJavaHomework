package C5;


class Q4 {
    public static void main(String[] args) {
        //作业四
        Exc4 a = new Exc4();
        a.throw_info(); //throw是抛出一个异常写在当前方法体内且一定会抛出异常
        try{
            a.throws_info();//throws是方法可能抛出的异常的集合声明，throws写在方法头，如果程序正常则不会抛出异常
        }catch (RuntimeException e){
            System.out.println("RuntimeException:throws是方法可能抛出的异常的集合声明，throws写在方法头");
        }catch (Exception e){
            System.out.println("Exception:throws是方法可能抛出的异常的集合声明，throws写在方法头");
        }

    }

}

class Exc4{
    public void throw_info(){
        try {
            throw new Exception("手动声明异常");
        } catch (Exception e){
            System.out.println("throw是抛出一个异常写在当前方法体内");
        }
    }

    public void throws_info () throws Exception,RuntimeException{
        throw new RuntimeException("手动声明异常");
    }
}
