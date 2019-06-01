package org.smart4j.proxy;

/**
 * @author unisk1123
 * @Description
 * @create 2019/5/31
 */
public class HelloImpl implements Hello {

    public void say(String name) {
        System.out.println("Hello!" + name);
    }
}
