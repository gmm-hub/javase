package com.gmm.student.test;

import com.gmm.student.dao.StusDao;
import com.gmm.student.entity.Stus;
import sun.security.timestamp.TSRequest;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class TestMain {
    private static StusDao sao = new StusDao();
    private static Scanner scanner = new Scanner(System.in);
    public static void menu(){
        System.out.println("=======选择操作环境=========");
        System.out.println("1、统计学生人数");
        System.out.println("2、查看学生名单");
        System.out.println("3、按学号查询学生姓名");
        System.out.println("4、按姓名查询学生信息");
        System.out.println("5、修改学生出生日期");
        System.out.println("6、删除学生记录");
        System.out.println("0、退出");
    }
    public  static void sumStudent() throws SQLException {
        System.out.println("================统计学生人数================");
        int stus = sao.stusLength();
        System.out.println("学生人数是："+stus);
    }
//    查看学生名单
    public static void showStudent() throws SQLException {
        System.out.println("================查看操作================");
        List<Stus> stuses = sao.selectAll();
        for (Stus stus : stuses) {
            System.out.println(stus);
        }
    }
//3、 按学号查询学生姓名
    public static void selectIdStudentName() throws SQLException {
        System.out.println("==============查询操作================");
        System.out.println("请输入学生学号：");
        String id = scanner.next();
        String name = sao.selectOneName(id);
        System.out.println(name);
    }
//4、 按姓名查询学生信息
    public static void selectNameStudent() throws SQLException {
        System.out.println("===============查询操作================");
        System.out.println("请输入学生姓名：");
        String name = scanner.next();
        Stus stus = sao.SelectOne(name);
        System.out.println(stus);
    }
//5、 修改学生出生日期
    public static void updateStudentBirthday(){
        System.out.println("===============修改操作================");
        System.out.println("请输入学生学号：");
        String id = scanner.next();
        System.out.println("请输入修改后的学生日期：");
        String birthday = scanner.next();
//        sao.updateStuBirthday();
    }
//6、 删除学生记录
    public static void deleteStudent() throws SQLException {
        System.out.println("===============删除操作================");
        System.out.println("请输入学生学号：");
        String id = scanner.next();
        sao.deleteStus(id);
    }
//0、 退出


    public static void main(String[] args) throws SQLException {
        System.out.println("请输入用户名：");
        String name = scanner.next();
        System.out.println("请输入密码：");
        String pwd = scanner.next();
        if (name.equals("张无忌")&&pwd.equals("8888"))
        {
            System.out.println("登录成功");
            while (true){
                menu();
                System.out.println("请选择操作");
                int options = scanner.nextInt();
                switch (options){
                    case 1:sumStudent();break;
                    case 2:showStudent();break;
                    case 3:selectIdStudentName();break;
                    case 4:selectNameStudent();break;
                    case 5:updateStudentBirthday();break;
                    case 6:deleteStudent();break;
                    case 0:break;
                }
                if (options == 0){
                    break;
                }

            }
        }
        else {
            System.out.println("用户名或密码错误");
        }




    }
}
