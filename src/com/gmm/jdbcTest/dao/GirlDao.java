package com.gmm.jdbcTest.dao;

import com.gmm.jdbcTest.entity.Girl;
import com.gmm.jdbcTest.utils.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GirlDao {
    /**
     *访问数据库表中的girl  --数据操作层
     *
     */
    //插入女生信息
    public void insert(Girl girl){
        Connection conn = null;
        PreparedStatement ppst = null;
        ResultSet rs = null;
        try {
            //1.获得连接对象
            conn = JDBCUtils.getConn();

            //2.通过连接对象获得语句对象
            String sql = "insert into girl values(null,?,?,?,?,null,?)";

            //预编译语句时，获得自增长主键
            ppst = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            //3.给?占位符传值  第一个参数：?的位置
            ppst.setString(1,girl.getName());
            ppst.setString(2,girl.getSex());
            ppst.setTimestamp(3,girl.getBorndate());
            ppst.setString(4,girl.getPhone());
            ppst.setInt(5,girl.getBoyfriend_id());

            //4.执行
            int i = ppst.executeUpdate();
            if(i>0){
                System.out.println("插入成功");
            }

            //输出插入对象的id ， 获取自增长主键
            rs = ppst.getGeneratedKeys();
            while (rs.next()){
                System.out.println("id = "+rs.getInt(1));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //5.释放资源
            JDBCUtils.close(conn,ppst,rs);
        }

    }


    //根据查询条件作模糊查询
    public List<Girl> selectAll(String query){
        Connection conn = null;
        PreparedStatement ppst = null;
        ResultSet rs = null;

        List<Girl> list = new ArrayList<Girl>();
        try {
            //1.获得连接对象
            conn = JDBCUtils.getConn();

            //2.获得语句对象
            String sql = "select * from girl where name like concat('%', ? ,'%')";
            ppst = conn.prepareStatement(sql);

            //3.给?占位符传值
            ppst.setString(1,query);

            //4.执行返回结果集
            rs = ppst.executeQuery();

            //5.处理结果集  位置指的是上方sql语句查询的结果的字段顺序
            while(rs.next()){
                Girl girl = new Girl(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getTimestamp(4),
                        rs.getString(5),rs.getString(6),rs.getInt(7));
                list.add(girl);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //6.释放资源
            JDBCUtils.close(conn,ppst,rs);
        }

        return list;
    }
//    1.更新女生表信息
    public void update(int id,String phone){
        //1.获取连接对象
        Connection conn = null;
        PreparedStatement ppst = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConn();
            //2.预编译sql语句
            String sql = "update girl set phone=?where id=?";
            //3.执行sql语句
            //获取主键id
            ppst = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            //4.给？占位符传值
            ppst.setString(1,phone);
            ppst.setInt(2,id);
            //4.执行
            int i = ppst.executeUpdate();
            if (i>0){
                System.out.println("更新成功");
            }
            rs = ppst.getGeneratedKeys();
            while (rs.next()){
                System.out.println("id = "+rs.getInt(1));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtils.close(conn,ppst,rs);
        }


        //4.关闭资源
    }
//2.通过id查询信息
}
