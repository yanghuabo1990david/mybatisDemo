package com.rtmart.david.mybatisdemo.mapper;

import com.rtmart.david.mybatisdemo.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author hubao.yang
 * @date 2019/11/13 0013 上午 11:29
 */
@Mapper
public interface CategoryMapper {
    @Select("select * from category_")
    public List<Category> findAll() ;
}
