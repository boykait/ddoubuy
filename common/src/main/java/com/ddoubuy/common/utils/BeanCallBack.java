package com.ddoubuy.common.utils;

/**
 * @description: 属性工具类
 * @author: boykaff
 * @date: 2022-04-14-0014
 */
@FunctionalInterface
public interface BeanCallBack<S, T> {

    /**
     * 定义默认回调方法
     *
     * @param t
     * @param s
     */
    void callBack(S t, T s);
}
