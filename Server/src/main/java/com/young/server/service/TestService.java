package com.young.server.service;

import com.young.server.domain.Test;
import com.young.server.domain.TestExample;
import com.young.server.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> listASC() {
        TestExample example = new TestExample();
        example.setOrderByClause("id asc");
        return testMapper.selectByExample(example);
    }

    public List<Test> listDesc() {
        TestExample example = new TestExample();
        example.setOrderByClause("id desc");
        return testMapper.selectByExample(example);
    }

    public  List<Test> getTest(){
        TestExample example = new TestExample();
        example.createCriteria().andIdEqualTo(1);
        return testMapper.selectByExample(example);
    }
}
