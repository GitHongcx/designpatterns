package com.hcx.designpatterns.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongcaixia on 2020/11/8.
 */
public class PrototypeTest {

    public static void main(String[] args) {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setName("tracy");
        concretePrototypeA.setAge(23);
        List<String> hobbies = new ArrayList<String>();
        concretePrototypeA.setHobbies(hobbies);

        Client client = new Client();
        ConcretePrototypeA copy = (ConcretePrototypeA) client.startClone(concretePrototypeA);

//        ConcretePrototypeA copy = (ConcretePrototypeA)concretePrototypeA.clone();

        System.out.println(copy);
        System.out.println("克隆对象中引用类型地址的值：" + copy.getHobbies());
        System.out.println("原对象中引用类型地址的值：" + concretePrototypeA.getHobbies());
        System.out.println("对象地址比较：" + (copy.getHobbies() == concretePrototypeA.getHobbies()));
    }
}
