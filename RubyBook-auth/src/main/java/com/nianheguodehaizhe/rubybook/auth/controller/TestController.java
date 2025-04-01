package com.nianheguodehaizhe.rubybook.auth.controller;

import com.nianheguodehaizhe.framework.common.response.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nianheguodehaizhe.framework.biz.operationlog.aspect.ApiOperationLog;

@RestController
public class TestController {
    @GetMapping("/test")
    @ApiOperationLog(description = "测试接口")
    public Response<String> test(){
        return Response.success("测试成功");
    }
}
