package com.gmm.jdbcTest.utils;

import java.sql.*;

/*
* 数据库访问的工具类
* */
public class JDBCUtils {
//    获得连接对象
    public static Connection getConn() throws ClassNotFoundException, SQLException {
        //1.加载jdbc驱动类
        Class.forName("com.mysql.jdbc.Driver");
        //2.获得连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testexam?useUnicode=true&characterEncoding=utf8",
                "root","root");
        //3.返回连接对象
        return conn;
    }
    /*
    *释放资源
    * @param conn 连接对象
    * st 语句对象
    * rs 结果集对象
     */
    public static void close(Connection conn, Statement st, ResultSet rs){
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(st!=null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = JDBCUtils.getConn();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(conn);
    }

}
