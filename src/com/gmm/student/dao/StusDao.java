package com.gmm.student.dao;

import com.gmm.student.entity.Stus;

import java.sql.SQLException;
import java.util.List;

public class StusDao extends BaseDao<Stus>{
//     统计学生人数
    public int stusLength() throws SQLException {
        String sql = "select count(*) from stus";
        int i = this.update(sql,null);
        return i;
    }
// 查看学生名单
    public List<Stus> selectAll() throws SQLException {
        String sql = "select * from stus";
        List<Stus> stusList = this.getBeanList(Stus.class, sql,null);
        return stusList;
    }
// 按学号查询学生姓名
    public String selectOneName(String id) throws SQLException {
        String sql = "select name,grade from stus where id =?";
        Object value = this.getStringValue(sql, id);
        return value.toString();
    }
// 按姓名查询学生信息
    public Stus SelectOne(String name) throws SQLException {
        String sql = "select * from stus where name like concat('%', ? ,'%')";
        Stus stu1 = this.getBen(Stus.class, sql, name);
        return stu1;
    }
// 修改学生出生日期
    public void updateStuBirthday(Stus stus) throws SQLException {
        String sql = "update stus set birthday =? where id =?";
        int i = this.update(sql, stus.getBirthday(),stus.getId());
        System.out.println(i>0?"修改成功":"操作失败");
    }
// 删除学生记录
    public void deleteStus(String id) throws SQLException {
        String sql = "delete from stus id=?";
        int i = this.update(sql,id);
        System.out.println(i>0?"删除成功":"删除失败");
    }

}
