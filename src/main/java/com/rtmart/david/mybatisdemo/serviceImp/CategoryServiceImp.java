package com.rtmart.david.mybatisdemo.serviceImp;

import com.rtmart.david.mybatisdemo.mapper.CategoryMapper;
import com.rtmart.david.mybatisdemo.pojo.Category;
import com.rtmart.david.mybatisdemo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hubao.yang
 * @date 2019/11/13 0013 上午 11:38
 */

@Service
public class CategoryServiceImp implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public List<Category> findAll() {
        return categoryMapper.findAll();
    }
}
