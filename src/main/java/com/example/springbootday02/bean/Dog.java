package com.example.springbootday02.bean;

/**
 * 类说明:
 *
 * @Author: 黄刚
 * @Date: 2020/4/18 19:02
 */
public class Dog {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dogs{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
