package com.ecommerce.sb_ecom.service;

import com.ecommerce.sb_ecom.payload.request.CategoryDTO;
import com.ecommerce.sb_ecom.payload.response.CategoryResponse;


public interface CategoryService {

    CategoryResponse getAllCategories();

    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
