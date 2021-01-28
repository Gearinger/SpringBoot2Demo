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
     * 获取的结果状态码
     *
     * @return {@link String }
     */
    String getResultCode();

    /**
     * 获取结果信息
     *
     * @return {@link String }
     */
    String getResultMsg();
}
