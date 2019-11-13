package com.shunwang.alpha.common.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String age;

    private Integer sex;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public static List<Student> getList() {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student();student1.setAge("12");student1.setSex(0);
        Student student2 = new Student();student2.setAge("13");student2.setSex(2);
        Student student3 = new Student();student3.setAge("11");student3.setSex(1);
        Student student4 = new Student();student4.setAge("18");student4.setSex(1);
        Student student5 = new Student();student5.setAge("18");student5.setSex(0);
        Student student6 = new Student();student6.setAge("18");student6.setSex(2);
        Student student7 = new Student();student7.setAge("18");student7.setSex(2);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        list.add(student7);
        return list;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age='" + age + '\'' +
                ", sex=" + sex +
                '}';
    }
}
