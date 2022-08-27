package com.example.waimai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.waimai.dao.SetmealMapper;
import com.example.waimai.domain.Setmeal;
import com.example.waimai.service.SetmealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SetmealServiceImpl extends ServiceImpl<SetmealMapper, Setmeal> implements SetmealService {
}
