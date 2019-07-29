package com.code2.adminportal;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.code2.adminportal.entity.Category;
import com.code2.adminportal.service.CategoryService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminPortalApplicationTests {

	@Autowired
	private CategoryService categoryService;
	@Test
	@Transactional
	public void contextLoads() {
		List<Category>categoris=categoryService.getCategories();
		
		assertEquals(3, categoris.size());
		Category category=categoryService.getCategory(2l);
		assertEquals("Electronic", category.getName());
	}
	
	
}

