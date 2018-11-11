package com.shoppingbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.shoppingbackend.dao.CetegoryDao;
import com.shoppingbackend.dto.Cetegory;


@Repository("cetegorydao")
public class CetegoryDaoImpl implements CetegoryDao {
	
	

	private static List<Cetegory> cetegories=new ArrayList<Cetegory>();
	 static
	 {
		 System.out.println("This is DaoImpl");
		 
		 //first Cetegory
		 Cetegory cetegory=new Cetegory();
		 //Add Cetegory
		 cetegory.setId(1);
		 cetegory.setName("Rani Tal");
		 cetegory.setDiscription("Rani Tal(Rani Talab) famous for Maa Kali and Talab ");
		 cetegory.setImageUrl("Cat1.png");
		 cetegories.add(cetegory);
		 
		 //second cetegory
		 cetegory=new Cetegory();
		 //Add Cetegory
		 cetegory.setId(2);
		 cetegory.setName("Chirahula temple");
		 cetegory.setDiscription("Chirahula Temple famous for God (Hanuman) ");
		 cetegory.setImageUrl("Cat2.png");
		 cetegories.add(cetegory);

		//Third cetegory
		 cetegory=new Cetegory();
		 //add Cetegory
		 cetegory.setId(3);
		 cetegory.setName("Kila");
		 cetegory.setDiscription("This place  famaous for Maha mritunjay shiv g ");
		 cetegory.setImageUrl("Cat3.png");
		 cetegories.add(cetegory);
		 
		 


	 
	 }

	public List<Cetegory> list() {
		
		
		
		return cetegories;
	}

	public Cetegory get(int id) {
		//Enhance for loop
		for(Cetegory cetegory:cetegories)
		{
			 if(cetegory.getId()==id)
			 {
				 return cetegory; 
			 }
		}
		return null;
	}

}
