package com.itheima.test;

import org.junit.jupiter.api.Test;

/**
 * @author wangwei
 * @version 1.0
 * Create by 2022/8/3 17:19
 */

public class UploadFileTest {
    @Test
    public void test1(){
        String fileName="gddgygygkug.jpg";
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(suffix);
    }
}
