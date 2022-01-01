package com.lizhaoxuan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

/**
 * 异常测试
 * @author lizhaoxuan
 * @date 2022/01/01
 */
@DisplayName("异常信息测试")
public class ExceptionTest {

    @Test
    @DisplayName("测试捕获的异常")
    void assertThrowsExceptionFalse() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            System.out.println("xx");
        }, "未抛出参数错误异常,测试失败");
    }

    @Test
    @DisplayName("测试捕获的异常2")
    void assertThrowsExceptionTrue() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer num = Integer.valueOf("xxxxx");
        }, "未抛出参数错误异常,测试失败");
    }

}
