package com.pigschool.xyzshow.exception;

import com.pigschool.xyzshow.common.CommonStatus;
import com.pigschool.xyzshow.common.JsonReturn;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 异常处理
 */
@Slf4j
//@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(value = Exception.class)
    public String globalExceptionHandler(Exception e){
        Map<String,Object> map  = new HashMap<String,Object>();
        //发生异常进行日志记录，写入数据库或者其他处理，此处省略
        log.error("msg:\n"+e.getMessage());
        log.error("date:\n"+new Date());
        log.error("strce:\n"+e.getStackTrace());
        log.error("fillInStackTrace:\n"+e.fillInStackTrace());
        log.error("getCause:\n"+e.getCause());
        log.error("getLocalizedMessage:\n"+e.getLocalizedMessage());
        return JsonReturn.fail(CommonStatus.EXCEPTION).toJson();
    }
}
