package com.gxy.maven;

import org.junit.Test;

/**
 * Created by guxiaoyan on 2022/4/5.
 */
public class HelloTest {

    @Test
    public void testHello() {
        Hello hello = new Hello();
        String maven = hello.sayHello("Maven");
        System.out.println(maven);
    }
}
