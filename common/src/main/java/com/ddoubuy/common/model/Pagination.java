package com.ddoubuy.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 分页对象
 * @author: boykaff
 * @date: 2022-04-13-0013
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pagination {
    private long page;
    private long size;
    private long pages;
    private long total;

    public static Pagination create(long page, long size, long pages, long total) {
        return new Pagination(page, size, pages, total);
    }
}
