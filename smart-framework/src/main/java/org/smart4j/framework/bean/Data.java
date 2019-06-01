package org.smart4j.framework.bean;

/**
 * @author unisk1123
 * @Description 返回数据对象
 * @create 2019/5/29
 */
public class Data {

    /**
     * 模型数据
     */
    private Object model;

    public Data(Object model) {
        this.model = model;
    }

    public Object getModel() {
        return model;
    }
}
