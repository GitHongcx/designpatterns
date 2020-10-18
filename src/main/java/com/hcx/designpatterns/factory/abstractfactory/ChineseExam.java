package com.hcx.designpatterns.factory.abstractfactory;

/**
 * 语文考试
 * @Author hongcaixia
 * @Date 2020/10/18 17:48
 * @Version 1.0
 */
public class ChineseExam implements IExam{
    @Override
    public void exam() {
        System.out.println("语文考试");
    }
}
