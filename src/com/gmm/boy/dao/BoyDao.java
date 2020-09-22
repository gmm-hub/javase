package com.gmm.boy.dao;

import com.gmm.boy.entity.Boy;
import com.gmm.boy.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 与数据库交互的层
 *
 * DbUtils 类
 *
 */
public class BoyDao {

    //添加男生信息
    public void insert(Boy boy) throws SQLException {
        //1.先创建QueryRunner的对象
        QueryRunner runner = new QueryRunner();

        //2.执行添加操作
        //第一个参数：连接对象  第二个参数：sql语句  第三个参数：值
        int i = runner.update(JDBCUtils.getConn(), "insert into boy(name) values(?)", boy.getName());

        System.out.println(i>0?"操作成功":"操作失败");
    }

    //修改男生信息
    public void  update(Boy boy) throws SQLException {
        //1.先创建QueryRunner对象
        QueryRunner runner = new QueryRunner();
        String sql = "update boy set name=? where id=?";
        //2.执行操作
        int i = runner.update(JDBCUtils.getConn(), sql,boy.getName(),boy.getId());
        System.out.println(i>0?"修改成功":"修改失败");
    }

    //删除男生信息
    public void delete(Boy boy){
        QueryRunner runner = new QueryRunner();
        String sql = "delete from boy where id=?";
    }

    /**
     * 查询所有男生信息
     *
     * BeanListHandler:将结果集中的所有行，封装成对象的集合，并返回List
     *  	       new BeanListHandler<T>(Xxx.class)
     */
    public List<Boy> selectAll(String query) throws SQLException {
        List<Boy> list = new ArrayList<Boy>();

        QueryRunner runner = new QueryRunner();
        String sql = "select * from boy where name like concat('%',?,'%')";

        /**
         * 第一个参数：连接对象
         * 第二个参数：sql语句
         * 第三个参数：BeanListHandler 结果集处理器
         * 第四个参数：给？占位符传递的值
         */
        list = runner.query(JDBCUtils.getConn(), sql, new BeanListHandler<>(Boy.class), query);

        return list;
    }


    /**
     * 查询男生数量
     *
     * ScalarHandler:将结果集中的第一行第一列，以Object返回
     *  		   new ScalarHandler()
     */
    public Long selectCounts(String query) throws SQLException {
        QueryRunner runner = new QueryRunner();
        String sql = "select count(*) from boy where name like concat('%',?,'%')";
        Long count = (Long)runner.query(JDBCUtils.getConn(), sql, new ScalarHandler(), query);
        return count;
    }


    /**
     * 通过id查询男生信息
     *
     * BeanHandler:将结果集的第一行，封装成对象，并返回bean
     *  		   new BeanHandler<T>(Xxx.class)
     */
    public Boy selectOne(Integer id) throws SQLException {
        QueryRunner runner = new QueryRunner();
        String sql = "select * from boy where id = ?";
        Boy boy = runner.query(JDBCUtils.getConn(), sql, new BeanHandler<>(Boy.class), id);
        return boy;
    }


    /**
     * 通过id查询男生信息
     * MapListHandler：将多条记录封装到一个Map集合中，以List<Map<String, Object>>返回
     *            new MapListHandler()
     */
    public List<Map<String,Object>> selectOneByMap(Integer id) throws SQLException {
        QueryRunner runner = new QueryRunner();
        String sql = "select * from boy where id = ?";
        List<Map<String, Object>> mapList = runner.query(JDBCUtils.getConn(), sql, new MapListHandler(), id);
        return mapList;
    }

}
