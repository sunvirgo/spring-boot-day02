package com.example.springbootday02;

import com.example.springbootday02.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
/**
 * 方法说明:springboot单元测试
 * @Author: 黄刚
 * @Date: 2020/4/18 19:56
 * @Param:
 * @Return:
 */
@SpringBootTest
class SpringBootDay02ApplicationTests {
    @Autowired
    Person person;
    @Test
    void contextLoads() {

        System.out.println(person);
    }

}
