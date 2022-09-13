package com.itheima.reggie.common;

/**自定义业务异常类
 * @author wangwei
 * @version 1.0
 * Create by 2022/8/3 14:43
 */

public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }
}
