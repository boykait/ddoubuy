package com.ddoubuy.common.utils;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;

/**
 * @description: 事务流水号
 * // todo 待考虑优化使用比较优的流水号生成方案
 * @author: boykaff
 * @date: 2022-04-17-0017
 */
public class TransUtils {
    /**
     * 获取流水号
     *
     * @return 流水编号
     */
    public static String genTransNo() {
        return DateFormatUtils.format(new Date(), "yyyyMMddHHmmssSSS");
    }

    /**
     * 获取流水号
     *
     * @param prefix 流水号前缀
     * @return 流水编号
     */
    public static String genTransNo(String prefix) {
        return prefix + DateFormatUtils.format(new Date(), "yyyyMMddHHmmssSSS");
    }
}
