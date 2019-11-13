package com.rtmart.david.mybatisdemo.controller;

import com.rtmart.david.mybatisdemo.pojo.Category;
import com.rtmart.david.mybatisdemo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author hubao.yang
 * @date 2019/11/13 0013 上午 11:37
 */
@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @RequestMapping("/getCategorys")
    @ResponseBody
    public List<Category>  getCategorys()
    {
        return categoryService.findAll();
    }
}
