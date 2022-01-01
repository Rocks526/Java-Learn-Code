package com.lizhaoxuan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * 参数化测试
 * @author lizhaoxuan
 * @date 2022/01/01
 */
@DisplayName("参数化测试")
public class ParamTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 8})
    void testNumberShouldBeEven(int num) {
        Assertions.assertEquals(0, num % 2);
    }

    @ParameterizedTest
    @CsvSource({"1,One", "2,Two", "3,Three"})
    void testDataFromCsv(long id, String name) {
        System.out.printf("id: %d, name: %s", id, name);
    }

    @ParameterizedTest
    @CsvFileSource(files = {"E:\\data\\Java-Learn-Code\\JUnit5\\src\\test\\resources\\user.csv"})
    void testDataFromCsvFile(long id, String name) {
        System.out.printf("id: %d, name: %s", id, name);
    }

}
