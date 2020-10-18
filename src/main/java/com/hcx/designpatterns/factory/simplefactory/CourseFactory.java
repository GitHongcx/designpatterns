package com.hcx.designpatterns.factory.simplefactory;

import com.hcx.designpatterns.factory.ICourse;

/**
 * 课程工厂：负责创建课程
 *
 * @Author hongcaixia
 * @Date 2020/10/18 14:01
 * @Version 1.0
 */
public class CourseFactory {

    //缺点：无法控制传入参数的准确性
//    public ICourse create(String name){
//        if("chinese".equals(name)){
//            return new ChineseCourse();
//        }else{
//            return null;
//        }
//    }


    //优化1：传入完整类名，通过反射创建对象
//    public ICourse create(String className) {
//        try {
//            if (!(null == className || "".equals(className))) {
//                return (ICourse) Class.forName(className).newInstance();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    //优化2：传入Class对象
    public ICourse create(Class clazz) {
        try {
            if (null != clazz) {
                return (ICourse) clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
