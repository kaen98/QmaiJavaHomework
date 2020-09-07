package C5;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名、密码，并用、号隔开");
        String input = sc.nextLine();
        String[] strArr=input.split("、");
        try{
            login(strArr[0], strArr[1]);
        } catch (ArrayIndexOutOfBoundsException arrayindex) {
            System.out.println("请正确输入");
        } catch (LoginException wrong) {
            System.out.println(wrong.getCode()+"-"+wrong.getMessage());
        }
    }

    public static void login(String username, String password)
    {
        //1001-用户名或密码为空
        if (username.length() == 0 || password.length() == 0) {
            throw new LoginException("1001", "用户名或密码为空");
        }
        //1002-用户名不存在
        String[] users = {"444","555", "666", "777"};
        if (!Arrays.asList(users).contains(username)) {
            throw new LoginException("1002", "用户名不存在");
        }

        //1003-密码错误
        String defaultPsw = "123";
        if (!(password.equals(defaultPsw))) {
            throw new LoginException("1003", "密码错误");
        }

        //1004-此帐号已锁定
        int status = ((int)(10 * Math.random())) % 2;
        if (status != 1) {
            throw new LoginException("1004", "此帐号已锁定");
        }
        System.out.println("登录成功");
    }
}
