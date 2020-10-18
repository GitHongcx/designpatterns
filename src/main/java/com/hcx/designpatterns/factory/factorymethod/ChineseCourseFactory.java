package com.hcx.designpatterns.factory.factorymethod;

import com.hcx.designpatterns.factory.ChineseCourse;
import com.hcx.designpatterns.factory.ICourse;

/**
 * 语文课程工厂
 * @Author hongcaixia
 * @Date 2020/10/18 15:21
 * @Version 1.0
 */
public class ChineseCourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new ChineseCourse();
    }
}
