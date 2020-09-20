package C6;

import java.util.Objects;

class Q3 {
    public static void main(String[] args) {
        //作业 复写equals hasCode方法
        Obj3 a = new Obj3(10085, "丁晓晓");
        Obj3 b = new Obj3(100851, "丁晓晓");
        Obj3 c = new Obj3(100851, "丁晓晓");
        Object obj = new Object();
        System.out.println(a.equals(b));
    }
}

class Obj3{
    public Obj3 (int user_id, String user_name){
        this.user_name = user_name;
        this.user_id = user_id;
    }
    public int user_id = 0;
    public String user_name = "";

    public boolean equals(Object obj) {
        if (obj.getClass() != getClass()){
            return false;
        }
        Obj3 o = (Obj3) obj;

        if (o.user_id == user_id) {
            return true;
        } else {
            return false;
        }
    }

    public int hasCode(){
        return user_id;
    }
}