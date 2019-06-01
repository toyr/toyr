package org.smart4j.proxy;

/**
 * @author unisk1123
 * @Description
 * @create 2019/5/31
 */
public class HelloProxy implements Hello {

    private Hello hello;
    public HelloProxy() {
        hello = new HelloImpl();
    }
    public void say(String name) {
        before();
        hello.say(name);
        after();
    }

    private void before() {
        System.out.println("Before");
    }

    private void after() {
        System.out.println("After");
    }

    public static void main(String[] args) {
         Hello helloProxy = new HelloProxy();
         helloProxy.say("world");
    }
}
