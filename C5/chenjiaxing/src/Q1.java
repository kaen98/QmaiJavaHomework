package C5;
class Four {
    public static void main(String[] args) {
        //作业一
        Exc a = new Exc();
        a.get();
    }

}

class Exc{

    public void get() {
        try{
            Exc x = null;
            x.get();
        }catch (NullPointerException e) {
            System.out.println("请检查程序，存在对象为null的引用");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException:"+e.toString());
        }  catch (Exception e) {
            System.out.println("Exception:"+e.toString());
        }
    }

}
