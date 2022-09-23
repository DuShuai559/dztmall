package com.ds.dztmall.config;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * Author: DuShuai
 * CreateTime: 2022/07/12 11:27
 * Function: please enter
 */
public class MyBatisPlusGenerator {
    public static void maina(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://127.0.0.1:3306/dztmall", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("DuShuai") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .outputDir("D:\\JavaFile\\project-space\\dztmall\\mapper\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.ds.dztmall") // 设置父包名
                            .entity("domain")
//                            .moduleName("generator") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D:\\JavaFile\\project-space\\dztmall\\mapper\\src\\main\\resources\\mappers")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("users", "user_login_history", "user_addr", "shopping_cart", "product_sku", "product_params",
                            "product_img","product_comments", "product", "orders", "order_item", "index_img", "category");// 设置需要生成的表名
//                            .addTablePrefix("*"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}
