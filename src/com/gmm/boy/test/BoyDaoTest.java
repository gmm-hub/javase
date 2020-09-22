package com.gmm.boy.test;

import com.gmm.boy.dao.BoyDao;
import com.gmm.boy.entity.Boy;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BoyDaoTest {

    BoyDao dao = new BoyDao();

    @Test
    public void insert() throws SQLException {
        dao.insert(new Boy("张张"));
    }

    @Test
    public void selectAll() throws SQLException {
        List<Boy> list = dao.selectAll("张");
        for (Boy boy : list) {
            System.out.println(boy);
        }
    }

    @Test
    public void selectCounts() throws SQLException {
        Long counts = dao.selectCounts("张");
        System.out.println(counts);
    }


    @Test
    public void selectOne() throws SQLException {
        Boy boy = dao.selectOne(10);
        System.out.println(boy);
    }


    @Test
    public void selectOneByMap() throws SQLException {
        List<Map<String, Object>> mapList = dao.selectOneByMap(1);
        for (Map<String, Object> map : mapList) {
            Set<Map.Entry<String, Object>> entrySet = map.entrySet();
            for (Map.Entry<String, Object> entry : entrySet) {
                System.out.println("key = "+entry.getKey() +" , value = "+entry.getValue());
            }
        }
    }
    @Test
    public void updateOne() throws SQLException {
        Boy boy = new Boy(1,"张三");
        dao.update(boy);
    }
}