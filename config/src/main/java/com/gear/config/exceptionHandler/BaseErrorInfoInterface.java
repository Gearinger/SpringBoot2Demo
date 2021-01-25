package com.gear.config.exceptionHandler;

/**
 * 基本错误信息界面
 *
 * @author guoyd
 * @version 1.0.0
 * @date 2021/01/25
 */
public interface BaseErrorInfoInterface {
    /**
     * 错误码
     */
    String getResultCode();

    /**
     * 错误描述
     */
    String getResultMsg();
}
