package com.hcx.designpatterns.factory.abstractfactory;

import com.hcx.designpatterns.factory.ChineseCourse;
import com.hcx.designpatterns.factory.ICourse;

/**
 * 语文工厂
 *
 * @Author hongcaixia
 * @Date 2020/10/18 17:46
 * @Version 1.0
 */
public class ChineseFactory implements IStudyFactory {
    @Override
    public ICourse createCourse() {
        return new ChineseCourse();
    }

    @Override
    public INote createNote() {
        return new ChineseNote();
    }

    @Override
    public IExam createExam() {
        return new ChineseExam();
    }
}
