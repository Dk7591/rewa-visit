package com.rewavisit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shoppingbackend.dao.ProductDAO;
import com.shoppingbackend.dto.Product;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {

	
	@Autowired
	public ProductDAO productDAO;
	
	
	@RequestMapping("/all/products")
	@ResponseBody
	public List<Product> getAllProducts()
	{
		return productDAO.listActiveProducts();
	}
	

	@RequestMapping("/cetegory/{id}/products")
	@ResponseBody
	public List<Product> getProductsByCetegory(@PathVariable int id)
	{
		return productDAO.listActiveProductsByCategory(id);
	}
	
	
}
