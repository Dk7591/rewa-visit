package com.shoppingbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.shoppingbackend.dao.CetegoryDao;
import com.shoppingbackend.dto.Cetegory;


@Repository("cetegoryDao")
public class CetegoryDaoImpl implements CetegoryDao {
	
	

	private static List<Cetegory> cetegories=new ArrayList<Cetegory>();
	 static
	 {
		 System.out.println("This is DaoImpl");
		 
		 //first Cetegory
		 Cetegory cetegory=new Cetegory();
		 //Add Cetegory
		 cetegory.setId(1);
		 cetegory.setName("Television");
		 cetegory.setDiscription("This is the television description ");
		 cetegory.setImageUrl("Cat1.png");
		 cetegories.add(cetegory);
		 
		 //second cetegory
		 cetegory=new Cetegory();
		 //Add Cetegory
		 cetegory.setId(2);
		 cetegory.setName("Radio");
		 cetegory.setDiscription("This is the Redio description ");
		 cetegory.setImageUrl("Cat2.png");
		 cetegories.add(cetegory);

		//Third cetegory
		 cetegory=new Cetegory();
		 //add Cetegory
		 cetegory.setId(3);
		 cetegory.setName("Computer");
		 cetegory.setDiscription("This is the Computer description ");
		 cetegory.setImageUrl("Cat3.png");
		 cetegories.add(cetegory);
		 
		 


	 
	 }

	public List<Cetegory> list() {
		
		
		
		return cetegories;
	}

}
