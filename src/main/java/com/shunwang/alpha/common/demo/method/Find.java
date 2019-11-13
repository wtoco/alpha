package com.shunwang.alpha.common.demo.method;

import com.shunwang.alpha.common.demo.model.Student;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find {

    public static void main(String[] args) {
        List<Student> demoList = Student.getList();

        List<Student> l1 = demoList.stream().filter(demo -> demo.getSex()==0).collect(Collectors.toList());

        for(Student model : l1) {
            System.out.println(model);
        }

        List<String> l2 = demoList.stream().map(Student::getAge).collect(Collectors.toList());
        System.out.println(l2);
    }

}
