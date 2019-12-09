package com.bharath.spring.springorm.product.dao.impl;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.bharath.spring.springorm.product.dao.ProductDao;
import com.bharath.spring.springorm.product.entity.Product;

public class ProductDaoImpl implements ProductDao {

	private HibernateTemplate hibernateTemplate;
	
	@Override
	public int create(Product product) {
		return 0;
	}

}
