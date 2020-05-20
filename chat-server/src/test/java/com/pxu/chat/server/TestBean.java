package com.pxu.chat.server;

import com.pxu.chat.server.Test.HelloSpring;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author 徐鹏
 * @date 2020/5/20 22:02
 */

/**
 * Spring常用的 Bean对象 如Service Dao Action等等
 * 在我们正常的项目运行中由于有Tomcat帮我们自动获得并初始化了这些Bean，所以我们不需要关系如何手动初始化他们
 * 所以这里需要加上@RunWith @ContextConfiguration这两个注解
 @RunWith
 @RunWith就是一个运行器
 @RunWith(JUnit4.class)就是指用JUnit4来运行
 @RunWith(SpringJUnit4ClassRunner.class),让测试运行于Spring测试环境

 @ContextConfiguration
 @ContextConfiguration Spring整合JUnit4测试时，使用注解引入多个配置文件

 单个文件
 @ContextConfiguration(Locations=”../applicationContext.xml”)
 @ContextConfiguration(classes = SimpleConfiguration.class)

 多个文件时，可用{}
 @ContextConfiguration(locations = { “classpath*:/spring1.xml”, “classpath*:/spring2.xml” })
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@Slf4j
public class TestBean {

    @Resource
    HelloSpring helloSpring;

    @Test
    public void test() {
        helloSpring.test();
        log.info("hahaha");
    }
}
