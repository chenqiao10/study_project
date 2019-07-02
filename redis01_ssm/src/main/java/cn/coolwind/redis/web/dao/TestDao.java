package cn.coolwind.redis.web.dao;

import cn.coolwind.redis.core.entity.Test;
import org.apache.ibatis.annotations.Param;

public interface TestDao {
    Test getById(int id);

    void updateTest(Test test);

    void insert(@Param("name") String name, @Param("value") String value);

}
