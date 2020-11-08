package com.hcx.designpatterns.singleton.hungry;

/**
 * @Author hongcaixia
 * @Date 2020/10/25 11:32
 * @Version 1.0
 */
public class MyTest {

    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyTest() {
        System.out.println("这是无参构造");
    }

    public MyTest(String name) {
        this.name = name;
        System.out.println("这是有参构造："+name);
    }


}
