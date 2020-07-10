package com.young.system.controller;

import com.young.system.domain.Test;
import com.young.system.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping("/test")
    public List<Test> list(){
        return testService.list();
    }
}
