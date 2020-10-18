package com.hcx.designpatterns.factory.simplefactory;

import com.hcx.designpatterns.factory.ChineseCourse;
import com.hcx.designpatterns.factory.ICourse;
import com.hcx.designpatterns.factory.MathCourse;

import java.util.Calendar;

/**
 * 测试类
 * @Author hongcaixia
 * @Date 2020/10/18 13:59
 * @Version 1.0
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
//        ICourse course =  factory.create("chinese");
//        ICourse course =  factory.create("com.hcx.designpatterns.factory.ChineseCourse");
        ICourse chineseCourse =  factory.create(ChineseCourse.class);
        ICourse mathCourse = factory.create(MathCourse.class);
        chineseCourse.study();
        mathCourse.study();

        Calendar.getInstance();
    }
}
