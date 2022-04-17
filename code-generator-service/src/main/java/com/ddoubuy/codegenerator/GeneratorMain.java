package com.ddoubuy.codegenerator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * @description: 生成mysql对应的数据映射文件
 * @author: boykaff
 * @date: 2022-04-16-0016
 */
public class GeneratorMain {
    private static final String DB_URL = "jdbc:mysql://139.224.205.200:3306/ddoubuy?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8";
    private static final String DB_USER_NAME = "root";
    private static final String DB_USER_PASSWORD = "gxw255613";
    private static final String OUT_PATH = "E:\\inc\\架构\\springcloud\\gitdemo\\mybatis-test";
    private static final String PACKAGE = "com.ddoubuy";
    private static final String AUTH = "boykaff";
    // 定义Mapper和xml生成的基包的子路径
    private static final String MAPPER_SUB_PKG = "orm.mybatis.mapper";
    private static final String XML_SUB_PKG = "orm.mybatis.mapper";
    private static final String ENTITY_SUB_PKG = "orm.mybatis.po";
    private static final String CONTROLLER_SUB_PKG = "api";

    public static void main(String[] args) {
        genUserServiceCode();
        genCartServiceCode();
        genProductServiceCode();
        genOrderServiceCode();
    }

    /**
     * 用户服务表对应的代码生成配置
     */
    private static void genUserServiceCode() {
        doGenerator("user", (builder -> {
            builder.addInclude("ums_user") // 设置需要生成的表名
                    .addTablePrefix("ums_"); // 设置过滤表前缀
        }));
    }

    /**
     * 商品相关服务表对应的代码生成配置
     */
    private static void genProductServiceCode() {
        String model = "product";
        doGenerator(model, (builder) -> {
            builder.addInclude("pms_brand," +
                            "pms_product," +
                            "pms_product_category," +
                            "pms_product_attr_key," +
                            "pms_product_attr_value," +
                            "pms_sku," +
                            "pms_sku_attr_key," +
                            "pms_sku_attr_value") // 设置需要生成的表名
                    .addTablePrefix("pms_"); // 设置过滤表前缀
        });
    }

    /**
     * 购物车相关服务表对应的代码生成配置
     */
    private static void genCartServiceCode() {
        String model = "cart";
        doGenerator(model, (builder) -> {
            builder.addInclude("cms_cart") // 设置需要生成的表名
                    .addTablePrefix("cms_"); // 设置过滤表前缀
        });
    }


    /**
     * 订单相关服务表对应的代码生成配置
     */
    private static void genOrderServiceCode() {
        String model = "order";
        doGenerator(model, (builder) -> {
            builder.addInclude("oms_order," +
                            "oms_order_item") // 设置需要生成的表名
                    .addTablePrefix("oms_"); // 设置过滤表前缀
        });
    }

    private static void doGenerator(String model, Consumer<StrategyConfig.Builder> strategy) {
        Map<OutputFile, String> pathInfo = new HashMap<>();
        FastAutoGenerator.create(DB_URL, DB_USER_NAME, DB_USER_PASSWORD)
                .globalConfig(builder -> {
                    builder.author(AUTH) // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .outputDir(OUT_PATH); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent(PACKAGE) // 设置父包名
                            .moduleName(model)// 设置父包模块名
                            .controller(CONTROLLER_SUB_PKG)
                            .pathInfo(pathInfo)
                            .mapper(MAPPER_SUB_PKG)
                            .xml(XML_SUB_PKG)
                            .entity(ENTITY_SUB_PKG);
                })
                .strategyConfig(strategy)
                .execute();
    }
}
