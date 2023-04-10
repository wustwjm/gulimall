package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1)整合mybatis-plus
 *          <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.5.3</version>
 *         </dependency>
 *  2),配置
 *     1.配置数据原
 *          1).导入数据库的驱动
 *                  <dependency>
 *                          <groupId>mysql</groupId>
 *                          <artifactId>mysql-connector-java</artifactId>
 *                           <version>8.0.32</version>
 *                  </dependency>
 *           2).在application.yml里面配置数据源相关信息
 *     2.配置mybatis-plus
 *          1）使用@MapperScan()
 *          2）告诉mybatis-plus SQL映射文件位置
 */
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
