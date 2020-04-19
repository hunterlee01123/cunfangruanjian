package com.imooc.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.imooc.pojo.Emp;
import com.imooc.mapper.EmpMapper;
@Service
public class EmpService{

    @Resource
    private EmpMapper empMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return empMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(Emp record) {
        return empMapper.insert(record);
    }

    
    public int insertSelective(Emp record) {
        return empMapper.insertSelective(record);
    }

    
    public Emp selectByPrimaryKey(Integer id) {
        return empMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(Emp record) {
        return empMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Emp record) {
        return empMapper.updateByPrimaryKey(record);
    }

}
