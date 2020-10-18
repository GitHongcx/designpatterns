package com.hcx.designpatterns.factory.abstractfactory;

import com.hcx.designpatterns.factory.ICourse;

/**
 * 顶层接口：要求所有子工厂都实现该接口
 * 即每一个产品族都要求要有的产品
 * @Author hongcaixia
 * @Date 2020/10/18 17:30
 * @Version 1.0
 */
public interface IStudyFactory {

    ICourse createCourse();

    INote createNote();

    IExam createExam();

}
