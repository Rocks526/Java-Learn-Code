package com.lizhaoxuan;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

/**
 * 重复性测试
 * @author lizhaoxuan
 * @date 2022/01/01
 */
@DisplayName("重复测试")
public class RepeatTest {

    @DisplayName("数组测试")
    @RepeatedTest(value = 3, name = "{displayName} 第 {currentRepetition} 次测试 / {totalRepetitions}")
    public void test(){
        System.out.println("===== 数组测试成功 =====");
    }

}
