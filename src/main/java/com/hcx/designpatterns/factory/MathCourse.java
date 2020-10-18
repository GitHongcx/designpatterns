package com.hcx.designpatterns.factory;

import com.hcx.designpatterns.factory.ICourse;

/**
 * 数学课
 * @Author hongcaixia
 * @Date 2020/10/18 14:21
 * @Version 1.0
 */
public class MathCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("学习高数");
    }
}
