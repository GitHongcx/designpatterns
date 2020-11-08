package com.hcx.designpatterns.singleton.register.container;

/**
 * Created by hongcaixia on 2020/11/8.
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {
        //Object bean = ContainerSingleton.getBean("com.hcx.designpatterns.singleton.register.container.Person");
        //com.hcx.designpatterns.singleton.register.container.Person@7440e464
        //System.out.println(bean);
        try {
            ConcurrentExecutor.execute(() -> {
                Object bean = ContainerSingleton.getBean("com.hcx.designpatterns.singleton.register.container.Person");
                System.out.println(System.currentTimeMillis()+"："+bean);
            }, 5, 3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
