package com.gmm.javase.day03.mapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<IntegerDemo,Student> studentMap = new HashMap<IntegerDemo,Student>();

        Student student1 = new Student("张三","男",20);
        Student student2 = new Student("李四","女",30);
        Student student3 = new Student("王五","男",24);
        studentMap.put(new IntegerDemo(111),student1);
        studentMap.put(new IntegerDemo(222),student2);
        studentMap.put(new IntegerDemo(111),student3);

        Set<IntegerDemo> keys = studentMap.keySet();
        for (IntegerDemo key : keys) {
            System.out.println("key="+key+",value="+studentMap.get(key));
        }

    }
}
