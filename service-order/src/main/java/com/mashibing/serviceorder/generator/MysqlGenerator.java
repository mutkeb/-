package com.mashibing.serviceorder.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class MysqlGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://101.34.39.86:3306/service-order?characterEncoding=utf-8&serverTimezone=GMT%2B8",
                "root","w672118299")
                //  全局配置
                .globalConfig(builder -> {
                    builder.author("mutkeb").fileOverride().outputDir("D:\\IDEA\\workspace\\online-taxi-public\\service-order\\src\\main\\java");
                })
                //  包配置
                .packageConfig(builder -> {
                    builder.parent("com.mashibing.serviceorder").pathInfo(Collections.singletonMap(OutputFile.mapperXml,
                            "D:\\IDEA\\workspace\\online-taxi-public\\service-driver-user\\src\\main\\java\\com\\mashibing\\serviceorder\\mapper"));
                })
                //  策略配置
                .strategyConfig(builder -> {
                    builder.addInclude("order");
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
