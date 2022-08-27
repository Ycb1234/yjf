package com.example.waimai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.waimai.domain.Employee;
import com.example.waimai.dao.EmployeeMapper;
import com.example.waimai.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
