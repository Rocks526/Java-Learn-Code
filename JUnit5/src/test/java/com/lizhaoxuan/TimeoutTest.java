package com.lizhaoxuan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 超时测试
 * @author lizhaoxuan
 * @date 2022/01/01
 */
@DisplayName("超时测试")
public class TimeoutTest {

    private static List<String> array;

    @BeforeAll
    public static void init(){
        array = Arrays.asList(("Java is a good language, " +
                "has many excellent frameworks, " +
                "ex: spring netty hadoop spark kafka ...").split(" "));
    }

    @Test
    @DisplayName("数组排序测试")
    public void arraySortTest(){
        Assertions.assertTimeout(Duration.of(10, ChronoUnit.MILLIS), () -> Collections.sort(array));
        System.out.println("排序完成: " + array);
    }

    @Test
    @DisplayName("数组排序测试2")
    public void arraySortTest2(){
        Assertions.assertTimeout(Duration.of(10, ChronoUnit.MILLIS), () -> {
            Thread.sleep(1200);
            Collections.sort(array);
        });
        System.out.println("排序完成: " + array);
    }

}
