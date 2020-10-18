package com.hcx.designpatterns.factory;

import com.hcx.designpatterns.factory.ICourse;

/**
 * 语文课
 * @Author hongcaixia
 * @Date 2020/10/18 13:57
 * @Version 1.0
 */
public class ChineseCourse implements ICourse {

    @Override
    public void study() {
        System.out.println("学习文言文");
    }
}
