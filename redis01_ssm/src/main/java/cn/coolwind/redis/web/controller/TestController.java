package cn.coolwind.redis.web.controller;

import cn.coolwind.redis.core.entity.Test;
import cn.coolwind.redis.core.entity.Test2;
import cn.coolwind.redis.web.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/select")
    public Object select(int id) {
        Test test =testService.getById(id);
        return test;
    }

    @GetMapping("/update")
    public Object update(int id, String name, String value) {
        Test test = new Test(id,name,value);
        testService.update(test);
        return "更新成功！";
    }

    @GetMapping("/insert")
    public Object insert(String name, String value) {
        testService.insert(name, value);
        return "插入成功！";
    }

    @GetMapping("/select2")
    public Object select2(int id) {
        return testService.getById2(id);
    }

    @GetMapping("/update2")
    public Object update2(int id, String name, String value) {
        Test2 test = new Test2(id,name,value);
        testService.update2(test);
        return "更新成功！";
    }

    @GetMapping("/insert2")
    public Object insert2(String name, String value) {
        testService.insert2(name, value);
        return "插入成功！";
    }

    @GetMapping("/all")
    public Object getAll(int id) {
        return testService.selectAll(id);
    }

}
