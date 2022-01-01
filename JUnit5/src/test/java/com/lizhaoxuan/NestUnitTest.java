package com.lizhaoxuan;

import org.junit.jupiter.api.*;

/**
 * 内嵌测试类
 * @author lizhaoxuan
 * @date 2022/01/01
 */
@DisplayName("登录测试")
public class NestUnitTest {

    @BeforeAll
    public static void init(){
        System.out.println("======================  INIT  =============================");
    }

    @AfterAll
    public static void clear(){
        System.out.println("======================  CLEAR  =============================");
    }

    @BeforeEach
    public void before() {
        System.out.println("======================  START  =============================");
    }

    @AfterEach
    public void end() {
        System.out.println("======================  END  =============================");
    }

    @Test
    @DisplayName("示例")
    public void demo(){
        System.out.println("示例............");
    }

    @Nested
    @DisplayName("用户模块")
    class UserTest{

        @Test
        @DisplayName("获取用户")
        public void getUser(){
            System.out.println("获取用户成功");
        }

        @Test
        @DisplayName("新增用户")
        public void addUser(){
            System.out.println("新增用户成功");
        }

    }

    @Nested
    @DisplayName("权限模块")
    class PrivilegeTest{

        @Test
        @DisplayName("获取用户权限")
        public void getUserPrivilege(){
            System.out.println("获取用户权限成功");
        }

        @Test
        @DisplayName("新增用户权限")
        public void addUserPrivilege(){
            System.out.println("新增用户权限成功");
        }

    }


}
