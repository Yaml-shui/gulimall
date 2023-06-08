package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

	@Autowired
	private BrandService brandService;

	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		//新增
//		brandEntity.setName("iphone");
//		brandService.save(brandEntity);
//		System.out.println("保存成功");

		//修改
//		brandEntity.setBrandId(1L);
//		brandEntity.setDescript("手机");
//		brandService.updateById(brandEntity);
//		System.out.println("修改成功");

		//查询
		BrandEntity brand = brandService.getById(1L);
		System.out.println(brand);
	}

}
