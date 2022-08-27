package com.example.waimai.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.example.waimai.domain.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee>{
}
