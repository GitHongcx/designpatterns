package com.hcx.designpatterns.factory.abstractfactory;

/**
 * 数学笔记
 * @Author hongcaixia
 * @Date 2020/10/18 17:47
 * @Version 1.0
 */
public class MathNote implements INote{
    @Override
    public void note() {
        System.out.println("记录数学笔记");
    }
}
