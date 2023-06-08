package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author 
 * @email 
 * @date 2023-06-06 21:14:21
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
