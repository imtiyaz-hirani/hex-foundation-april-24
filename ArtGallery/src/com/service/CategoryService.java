package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.CategoryDao;
import com.dao.CategoryDaoImpl;
import com.model.Category;

public class CategoryService {

	CategoryDao dao = new CategoryDaoImpl();
	
	public List<Category> findAll() throws SQLException{
		return dao.findAll();
	}
}
