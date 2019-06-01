package org.smart4j.web;

import org.smart4j.framework.annotation.Action;
import org.smart4j.framework.annotation.Controller;

/**
 * @author unisk1123
 * @Description
 * @create 2019/5/29
 */
@Controller
public class TestController {

    @Action("/test")
    public String hello() {
        return "hello";
    }


}
