package com.hcx.designpatterns.factory.factorymethod;

import com.hcx.designpatterns.factory.ICourse;

/**
 * 课程工厂
 * @Author hongcaixia
 * @Date 2020/10/18 15:07
 * @Version 1.0
 */
public interface ICourseFactory {
    ICourse create();
}
