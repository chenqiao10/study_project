package cn.coolwind.redis.web.service;

import cn.coolwind.redis.core.entity.Test;
import cn.coolwind.redis.core.entity.Test2;
import cn.coolwind.redis.core.entity.TestDTO;
import cn.coolwind.redis.web.dao.Test2Dao;
import cn.coolwind.redis.web.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestDao testDao;

    @Autowired
    private Test2Dao test2Dao;

    public Test getById(int id) {
        return testDao.getById(id);
    }

    public void update(Test test) {
        testDao.updateTest(test);
    }

    public void insert(String name, String value) {
        testDao.insert(name,value);
    }

    public Test2 getById2(int id) {
       return test2Dao.getById(id);
    }

    public void update2(Test2 test) {
        test2Dao.updateTest(test);
    }

    public void insert2(String name, String value) {
        test2Dao.insert(name,value);
    }

    public TestDTO selectAll(int id) {
        return test2Dao.selectAll(id);
    }
}
