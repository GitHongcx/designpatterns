package com.hcx.designpatterns.singleton.register.enum1;

/**
 * 使用枚举
 * @Author hongcaixia
 * @Date 2020/10/25 17:54
 * @Version 1.0
 */
public enum EnumSingleton {

    INSTANCE;

    private Object data;

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
