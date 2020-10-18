package com.hcx.designpatterns.factory.factorymethod;

import com.hcx.designpatterns.factory.ICourse;
import com.hcx.designpatterns.factory.MathCourse;

/**
 * 数学课程工厂
 * @Author hongcaixia
 * @Date 2020/10/18 15:23
 * @Version 1.0
 */
public class MathCourseFactory implements ICourseFactory{

    @Override
    public ICourse create() {
        return new MathCourse();
    }
}
