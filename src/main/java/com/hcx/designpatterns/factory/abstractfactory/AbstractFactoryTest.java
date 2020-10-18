package com.hcx.designpatterns.factory.abstractfactory;

/**
 * 抽象工厂测试类
 * @Author hongcaixia
 * @Date 2020/10/18 17:49
 * @Version 1.0
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        IStudyFactory chineseFactory = new ChineseFactory();
        chineseFactory.createCourse().study();
        chineseFactory.createNote().note();
        chineseFactory.createExam().exam();

        IStudyFactory mathFactory = new MathFactory();
        mathFactory.createCourse().study();
        mathFactory.createNote().note();
        mathFactory.createExam().exam();
    }
}
