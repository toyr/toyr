package org.smart4j.framework.proxy;

/**
 * @author unisk1123
 * @Description 代理接口
 * @create 2019/5/31
 */
public interface Proxy {

    /**
     * 执行链式代理
     * @param proxyChain
     * @return
     * @throws Throwable
     */
    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
