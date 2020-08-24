package com.young.business.controller;

import com.young.server.domain.Test;
import com.young.server.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/test")
@RestController
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping("/list_asc")
    public List<Test> listAsc(){
        return testService.listASC();
    }

    @GetMapping("/list_desc")
    public List<Test> listDesc(){
        return testService.listDesc();
    }
    @GetMapping("/one")
    private List<Test> getTest(){
        return testService.getTest();
    }
}
