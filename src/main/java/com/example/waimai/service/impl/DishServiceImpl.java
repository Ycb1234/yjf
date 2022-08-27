package com.example.waimai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.waimai.dao.DishMapper;
import com.example.waimai.domain.Dish;
import com.example.waimai.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements DishService {
}
