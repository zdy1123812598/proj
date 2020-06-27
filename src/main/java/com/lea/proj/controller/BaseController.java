package com.lea.proj.controller;

import com.lea.proj.service.exception.PasswordNotException;
import com.lea.proj.service.exception.ServiceException;
import com.lea.proj.service.exception.UsernameDuplicateException;
import com.lea.proj.service.exception.UsernameNotFoundException;
import com.lea.proj.utils.JsonResult;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 控制器基类
 */
public abstract class BaseController {
    /**
     * 返回成功状态码2000
     */
    public static final int SUCCESS = 2000;
    public static final int ERROR = 4000;

    @ExceptionHandler({ServiceException.class, FileUploadException.class})
    public JsonResult<Void> handleException(Throwable ex) {

        JsonResult<Void> jsonResult = new JsonResult<>(ex);

        if (ex instanceof UsernameDuplicateException) {
            //用户名被占用  -  2002
            jsonResult.setState(2002);
        } else if (ex instanceof UsernameNotFoundException) {
            //用户名找不到  -  2003
            jsonResult.setState(2003);
        } else if (ex instanceof PasswordNotException) {
            //密码错误
            jsonResult.setState(2004);
        }
        //返回响应值
        return jsonResult;
    }
}
