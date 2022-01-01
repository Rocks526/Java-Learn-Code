package com.lizhaoxuan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * 新的断言测试
 * @author lizhaoxuan
 * @date 2022/01/01
 */
@DisplayName("新断言测试")
public class LambdaTest {

    @Test
    @DisplayName("lambda断言")
    public void lambdaTest(){
        ArrayList<String> list = new ArrayList<>();
        Assertions.assertAll(
                () -> Assertions.assertTrue(list.add("demo")),
                () -> Assertions.assertEquals(1, list.size()),
                () -> Assertions.assertTrue(list.contains("demo")
                )
        );
    }

}
