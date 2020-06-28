package com.pxu.chat.server.Test;

import lombok.Data;
import org.junit.Test;
import org.springframework.stereotype.Component;

/**
 * @author 徐鹏
 * @date 2020/5/20 21:58
 */
@Data
@Component("hellwBean")
public class TestAll {

    private Integer i;

    @Test
    public void test(){
        System.out.println("TestSpring");
    }

    /**
     * 测试lombok的builder
     *
     */
    @Test
    public void test1(){
        TestLombok.TestLombokBuilder builder = TestLombok.builder();
        TestLombok testLombok = builder.name("hahaha").responseCode(123).build();
        System.out.println(testLombok.toString());
    }


}
