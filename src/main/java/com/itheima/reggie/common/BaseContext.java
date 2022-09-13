package com.itheima.reggie.common;

/**基于的封装工具类，用户保存和更新的id
 * @author wangwei
 * @version 1.0
 * Create by 2022/8/2 23:33
 */

public class BaseContext {
    private static ThreadLocal<Long> threadLocal=new ThreadLocal<>();

    /**
     * 设置值
     * @param id
     */
    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    /**
     * 获取值
     * @return
     */
    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
