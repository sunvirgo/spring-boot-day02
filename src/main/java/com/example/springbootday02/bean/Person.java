package com.example.springbootday02.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 类说明:将配置文件中配置的每一个属性值映射到这个组件中
 *  Spring boot 2.2.0 新增一个 @ConfigurationPropertiesScan 的注解，默认是开启的扫描 main 启动类所在的包路径的所有
 *  ConfigurationProperties, 所以可以不用再加 @Component 或者 @Configuration ;
 *  Spring boot 2.2.1 默认关闭此功能，需要显式指定此注解，实际在使用过程中 你会发现 @Profile
 *  和这个注解的兼容问题, @ConfigurationPropertiesScan not compatible with @Profile @ConfigurationProperties，
 *  所以 Spring Boot 2.2.1 默认关闭了这个功能,如果需要开启，在启动类上加@ConfigurationPropertiesScan即可；
 *
 * @Author: 黄刚
 * @Date: 2020/4/18 18:51
 */
//@ConfigurationProperties告诉springboot将本类中所有属性和配置文件相关的配置进行绑定
//只有这个组件是容器中的组件才能提供 @ConfigurationProperties的功能
@Component
@ConfigurationProperties(prefix = "person")
@Validated//增加校验规则
public class Person {
    //也可以不用@ConfigurationProperties(prefix = "person")注解，用 @Value("${person.last-name}")的方式去获取配置文件中的值
    @Value("${person.last-name}")
    //@Email//校验规则为邮箱格式
    private String lastName;
    //@Value("#{11*2}")
    private Integer age;
    private Boolean boss;
    private Date birthday;
    //@Value("${person.map}")
    private Map<String,Object> map;
    private List<String> list;
    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birthday=" + birthday +
                ", map=" + map +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }
}
