package com.hcx.designpatterns.factory.factorymethod;

import com.hcx.designpatterns.factory.ICourse;
import com.hcx.designpatterns.factory.MathCourse;
import org.slf4j.LoggerFactory;

/**
 * 工厂方法测试类
 * @Author hongcaixia
 * @Date 2020/10/18 15:27
 * @Version 1.0
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory chineseCourseFactory = new ChineseCourseFactory();
        ICourseFactory mathCourseFactory = new MathCourseFactory();

        ICourse chineseCourse = chineseCourseFactory.create();
        ICourse mathCourse = mathCourseFactory.create();
        chineseCourse.study();
        mathCourse.study();

        LoggerFactory.getLogger("xxx");
    }
}
