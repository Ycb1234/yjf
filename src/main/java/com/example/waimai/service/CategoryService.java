package com.example.waimai.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.waimai.domain.Category;

public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
