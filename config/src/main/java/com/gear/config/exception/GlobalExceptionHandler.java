package com.gear.config.exception;

import com.gear.config.ResultBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


/**
 * 全局异常处理
 *
 * @author guoyd
 * @version 1.0.0
 * @date 2021/01/25
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 处理自定义的业务异常
     *
     * @param req 要求的事情
     * @param e   e
     * @return {@link ResultBody }
     */
    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public ResultBody bizExceptionHandler(HttpServletRequest req, BizException e) {
        logger.error("业务异常！原因：{}", e.getErrorMsg());
        return ResultBody.error(e.getErrorCode(), e.getErrorMsg());
    }

    /**
     * 处理空指针的异常
     *
     * @param req 要求的事情
     * @param e   e
     * @return {@link ResultBody }
     */
    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public ResultBody exceptionHandler(HttpServletRequest req, NullPointerException e) {
        logger.error("空指针异常！原因:", e);
        return ResultBody.error(CommonEnum.BODY_NOT_MATCH);
    }


    /**
     * 处理其他异常
     *
     * @param req 要求的事情
     * @param e   e
     * @return {@link ResultBody }
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultBody exceptionHandler(HttpServletRequest req, Exception e) {
        logger.error("未知异常！原因:", e);
        return ResultBody.error(CommonEnum.INTERNAL_SERVER_ERROR);
    }
}
