package com.zscat.mall.admin.component;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import com.zscat.common.result.CommonResult;
import com.zscat.common.util.JsonUtil;

/**
 * 当访问接口没有权限时，自定义的返回结果
 * https://gitee.com/zscat-platform/mall on 2018/4/26.
 */
@Component
public class RestfulAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request,
                       HttpServletResponse response,
                       AccessDeniedException e) throws IOException, ServletException {
        System.out.println("7777777777777777777777777777777");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.getWriter().println(JsonUtil.objectToJson(new CommonResult().forbidden(e.getMessage())));
        response.getWriter().flush();
    }
}
