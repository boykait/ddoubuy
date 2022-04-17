package com.ddoubuy.common.utils;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

/**
 * @description: 属性工具类
 * @author: boykaff
 * @date: 2022-04-14-0014
 */
public class BeanUtils extends org.springframework.beans.BeanUtils {
    /**
     * 普通拷贝属性
     *
     * @param source 源数据对象
     * @param target 目标对象类
     * @return 处理后的对象
     */
    public static <S, T> T copyProperties(S source, Supplier<T> target) {
        if (null == source || null == target) {
            return null;
        }
        T t = target.get();
        copyProperties(source, t);
        return t;
    }


    /**
     * 拷贝属性
     *
     * @param source   源数据对象
     * @param target   目标对象类
     * @param callBack 回调方法
     * @return 处理后的对象
     */
    public static <S, T> T copyProperties(S source, Supplier<T> target, BeanCallBack<S, T> callBack) {
        if (null == source || null == target) {
            return null;
        }
        T t = target.get();
        copyProperties(source, t);
        if (callBack != null) {
            // 回调
            callBack.callBack(source, t);
        }
        return t;
    }

    /**
     * 普通集合数据的拷贝
     *
     * @param sources: 数据源类
     * @param target:  目标类::new(eg: ArrayList::new)
     * @return
     */
    public static <S, T> List<T> copyListProperties(Collection<S> sources, Supplier<T> target) {
        return copyListProperties(sources, target, null);
    }

    /**
     * 带回调函数的集合数据的拷贝（可自定义字段拷贝规则）
     *
     * @param sources:  数据源类
     * @param target:   目标类::new(eg: ArrayList::new)
     * @param callBack: 回调函数
     * @return
     */
    public static <S, T> List<T> copyListProperties(Collection<S> sources, Supplier<T> target, BeanCallBack<S, T> callBack) {
        if (null == sources || null == target) {
            return null;
        }

        List<T> list = new ArrayList<>(sources.size());
        for (S source : sources) {
            T t = target.get();
            copyProperties(source, t);
            list.add(t);
            if (callBack != null) {
                // 回调
                callBack.callBack(source, t);
            }
        }
        return list;
    }
}


