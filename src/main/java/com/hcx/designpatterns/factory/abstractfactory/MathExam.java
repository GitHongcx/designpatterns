package com.hcx.designpatterns.factory.abstractfactory;

/**
 * 数学考试
 * @Author hongcaixia
 * @Date 2020/10/18 17:48
 * @Version 1.0
 */
public class MathExam implements IExam{
    @Override
    public void exam() {
        System.out.println("数学考试");
    }
}
