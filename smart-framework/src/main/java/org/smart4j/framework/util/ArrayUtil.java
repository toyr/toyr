package org.smart4j.framework.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * @author unisk1123
 * @Description 数组工具类
 * @create 2019/5/28
 */
public class ArrayUtil {

    /**
     * 判断数组是否非空
     * @param array
     * @return
     */
    public static boolean isNotEmpty(Object[] array) {
        return !ArrayUtils.isEmpty(array);
    }

    /**
     * 判断数组是否为空
     * @param array
     * @return
     */
    public static boolean isEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }
}
