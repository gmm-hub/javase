package com.gmm.boy.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 使用C3P0数据库连接池
 */
public class JDBCUtils {

    private static DataSource dataSource = new ComboPooledDataSource("mysql");

    //线程变量
    private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();

    //获取连接对象
    public static Connection getConn() throws SQLException {
        Connection connection = tl.get();
        if(connection==null){
            connection = dataSource.getConnection();
            tl.set(connection);
        }
        return connection;
    }

    /**
     * 释放资源
     * @param conn 连接对象
     * @param st 语句对象
     * @param rs 结果集对象
     */
    public static void close(Connection conn , Statement st , ResultSet rs){
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

    public static void main(String[] args) throws SQLException {
        Connection conn = JDBCUtils.getConn();
        //com.mchange.v2.c3p0.impl.NewProxyConnection@1064425
        System.out.println(conn);
    }

}
