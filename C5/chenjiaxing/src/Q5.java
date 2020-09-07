package C5;


class Q5 {
    public static void main(String[] args) {
        //作业五
        User u = new User();
        try{
            u.login("", "");
        }catch (UserException e) {
            System.out.println(
                    "code:"+e.getErrmsg()+"\r\nmsg:"+e.getErroCode()
            );
        }
    }

}
//自定义登陆类
class User{
    public void login(String name, String password) throws UserException{
        if (name == "" || password == ""){
            throw new UserException(1001, "用户名和密码不能为空");
        }
        if (name != "xiaokun" && name != "dakun") {
            throw new UserException(1002, "用户名不存在");
        }
        if (password != "123456") {
            throw new UserException(1003, "密码错误");
        }
        if (name=="dakun"){
            throw new UserException(1004, "此账号已锁定");
        }
        System.out.println("登陆成功");
    }
}

//自定义异常类
class UserException extends RuntimeException{
    private int erroCode;
    private String errmsg;
    public UserException(int code, String msg){
        super(msg);
        this.erroCode = code;
        this.errmsg = msg;
    }
    public int getErroCode (){
        return erroCode;
    }
    public String getErrmsg(){
        return errmsg;
    }
}