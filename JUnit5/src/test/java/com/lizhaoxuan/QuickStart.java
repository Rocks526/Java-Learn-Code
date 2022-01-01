package com.lizhaoxuan;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit5快速入门
 * @author lizhaoxuan
 * @date 2022/01/01
 */
@DisplayName("数组测试")
public class QuickStart {

    private static List<Long> array;

    @BeforeAll
    public static void init(){
        System.out.println("初始化数据...");
        array = new ArrayList<>();
    }

    @AfterAll
    public static void clear(){
        System.out.println("清理数据...");
        array.clear();
        array = null;
    }

    @BeforeEach
    public void start(){
        System.out.println("=================== START ======================");
    }

    @AfterEach
    public void end(){
        System.out.println("=================== END ======================");
        array.clear();
    }

    @Test
    @DisplayName("删除测试")
    public void deleteTest(){
        assertFalse(array.remove(1L));
        array.add(1L);
        assertTrue(array.remove(1L));
        System.out.println("删除测试成功");
    }

    @Test
    @DisplayName("新增测试")
    @Disabled
    public void saveTest(){
        array.add(1L);
        assertTrue(array.contains(1L));
        System.out.println("新增测试成功");
    }

    @Test
    @DisplayName("长度测试")
    public void lengthTest(){
        assertEquals(0, array.size());
        array.addAll(Arrays.asList(2L,9L,0L,2L));
        assertEquals(4, array.size());
        System.out.println("长度测试成功");
    }

}
