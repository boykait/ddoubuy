package com.ddoubuy.common.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 查询基础类
 * @author: boykaff
 * @date: 2022-04-17-0017
 */
@Data
public class QueryBasic {
    @ApiModelProperty(value = "当前页")
    private Integer page = 1;
    @ApiModelProperty(value = "每页数量")
    private Integer size = 10;
}
