package com.gear.config.exception;

/**
 * 基本错误信息界面
 *
 * @author guoyd
 * @version 1.0.0
 * @date 2021/01/25
 */
public interface BaseErrorInfoInterface {
    /**
     * 得到的结果代码
     *
     * @return {@link String }
     */
    String getResultCode();

    /**
     * 得到结果味精
     *
     * @return {@link String }
     */
    String getResultMsg();
}
