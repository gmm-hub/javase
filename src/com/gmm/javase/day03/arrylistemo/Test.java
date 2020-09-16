package com.gmm.javase.day03.arrylistemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        User user1 = new User("张三","123456");
        User user2 = new User("李四","345678");
        User user3 = new User("王五","199823");
        User user4 = new User("李六","1234");
        User user5 = new User("唐七","33455");

        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        Scanner scanner = new Scanner(System.in);
        int count=0;
        boolean token = false;
        while (true){
            System.out.println("请输入用户名：");
            String userName = scanner.next();
            System.out.println("请输入密码：");
            String passWord = scanner.next();
            for (User user : users) {
                if (userName.equals(user.getUserName())&&passWord.equals(user.getPassWord())){
                    token = true;
                    break;
                }
            }
            if (token){
                System.out.println("账户密码正确,登录成功");
                break;
            }
            else if (count>=2){
                System.out.println("输入次数过多，请稍等一会再输入！");
                break;
            }
            else {
                count++;
                System.out.println("用户名或密码不正确，您还有"+(3-count)+"次机会！");
            }
        }
    }
}
