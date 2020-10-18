package com.hcx.designpatterns.factory.abstractfactory;

import com.hcx.designpatterns.factory.ICourse;
import com.hcx.designpatterns.factory.MathCourse;

/**
 * 数学工厂
 *
 * @Author hongcaixia
 * @Date 2020/10/18 17:46
 * @Version 1.0
 */
public class MathFactory implements IStudyFactory {
    @Override
    public ICourse createCourse() {
        return new MathCourse();
    }

    @Override
    public INote createNote() {
        return new MathNote();
    }

    @Override
    public IExam createExam() {
        return new MathExam();
    }
}
