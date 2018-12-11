package com.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shoppingbackend.dao.CetegoryDao;
import com.shoppingbackend.dto.Cetegory;

public class CetegoryTestCase {

	private static AnnotationConfigApplicationContext context;
	private static CetegoryDao cetegorydao;
	private Cetegory cetegory;
	
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.shoppingbackend");
		context.refresh();
		
		cetegorydao=(CetegoryDao)context.getBean("cetegorydao");
	}
	
//	@Test
//	public void testAddCategory()
//	{
//		cetegory=new Cetegory();
//		
//		 cetegory.setName("Rani Tal");
//		 cetegory.setDiscription("Rani Tal(Rani Talab) famous for Maa Kali and Talab ");
//		 cetegory.setImageUrl("Cat1.png");
//		 
//		 assertEquals("Successfully added",true,cetegorydao.add(cetegory));
//	}
	
//	@Test
//	public void testGetCategory(){
//		
//		cetegory=cetegorydao.get(2);
//		
//		 assertEquals("Successfully fatch single cetegory from table","khando",cetegory.getName());
//	}
//	
	
	
	
//	@Test
//	public void testUpdateCategory()
//	{
//		cetegory=cetegorydao.get(2);
//		cetegory.setName("Khandho");
//		assertEquals("Updation test case successfully in table",true,cetegorydao.update(cetegory));
//	}
	
	
//	@Test
//	public void testDeleteCategory()
//	{
//		cetegory=cetegorydao.get(2);
//		assertEquals("Delete test case successfully in table",true,cetegorydao.delete(cetegory));
//	}
	
	
//	@Test
//	public void testListCategory()
//	{
//		assertEquals("Fatching list data test case successfully in table",2,cetegorydao.list().size());
//	}
	
	
	
	@Test
	public void testCRUDCategory()
	{
		
		//add operation
		cetegory=new Cetegory();
		
		 cetegory.setName("Rani Tal");
		 cetegory.setDiscription("Rani Tal(Rani Talab) famous for Maa Kali and Talab ");
		 cetegory.setImageUrl("Cat1.png");
		 assertEquals("Successfully added",true,cetegorydao.add(cetegory));
		 
		 cetegory=new Cetegory();
		 cetegory.setName("khandho");
		 cetegory.setDiscription("Khando famous for water fountation ");
		 cetegory.setImageUrl("Cat2.png");
		 assertEquals("Successfully added",true,cetegorydao.add(cetegory)); 
		 
		 
		 //Fatching and updating

			cetegory=cetegorydao.get(2);
			cetegory.setName("Khando");
			assertEquals("Updation test case successfully in table",true,cetegorydao.update(cetegory));
		 
		 //deleting
			assertEquals("Delete test case successfully in table",true,cetegorydao.delete(cetegory));
	
	
			
			//Fatching the list data
			assertEquals("Fatching list data test case successfully in table",1,cetegorydao.list().size());
	
	
	}
}
