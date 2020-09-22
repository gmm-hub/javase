package com.gmm.jdbcTest.test;

import com.gmm.jdbcTest.dao.GirlDao;
import org.junit.Test;

import static org.junit.Assert.*;

public class GirlDaoTest {

    @Test
    public void insert() {
    }

    @Test
    public void selectAll() {
    }

    @Test
    public void update() {
        GirlDao girlDao = new GirlDao();
        girlDao.update(1,"192111245");
    }
}