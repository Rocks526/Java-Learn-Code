package com.lizhaoxuan;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 测试方法执行顺序
 * @author lizhaoxuan
 * @date 2022/01/01
 */
@DisplayName("方法执行顺序测试")
public class OrderTest {

    @Test
    public void Dtest(){
        System.out.println("Dtest");
    }

    @Test
    public void testA(){
        System.out.println("testA");
    }

    @Test
    public void destA(){
        System.out.println("destA");
    }

    @Test
    public void Atest(){
        System.out.println("Atest");
    }

    @Test
    public void aTest(){
        System.out.println("aTest");
    }

    @Test
    public void testC(){
        System.out.println("testC");
    }

    @Test
    public void TestB(){
        System.out.println("TestB");
    }

    @Test
    public void testB(){
        System.out.println("testB");
    }

}
