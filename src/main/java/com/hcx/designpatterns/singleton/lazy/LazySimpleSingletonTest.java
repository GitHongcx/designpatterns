package com.hcx.designpatterns.singleton.lazy;

/**
 * @Author hongcaixia
 * @Date 2020/10/25 12:04
 * @Version 1.0
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {

        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
//        System.out.println(instance);

        System.out.println("=============start================");
        Thread thread1 = new Thread(new ExecutorThread());
        Thread thread2 = new Thread(new ExecutorThread());

        thread1.start();
        thread2.start();
        System.out.println("=============end================");
    }
}
