package com.shoppingbackend.dao;

import java.util.List;

import com.shoppingbackend.dto.Cetegory;

public interface CetegoryDao {
	
	
	List<Cetegory> list();
	Cetegory get(int id);
	boolean delete(Cetegory cetegory);
	boolean update(Cetegory cetegory);
	boolean add(Cetegory cetegory);

}
