package com.shoppingbackend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shoppingbackend.dao.CetegoryDao;
import com.shoppingbackend.dto.Cetegory;


@Repository("cetegorydao")
@Transactional
public class CetegoryDaoImpl implements CetegoryDao {
	
	@Autowired
	private SessionFactory sessionFactory;


	public List<Cetegory> list() {
		
String selectActiveCetegory = "FROM Cetegory WHERE active = :active";
		
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCetegory);
				
		query.setParameter("active", true);
						
		return query.getResultList();
		
		//return cetegories;
	}

	public Cetegory get(int id) {
		return sessionFactory.getCurrentSession().get(Cetegory.class, Integer.valueOf(id));
	}

	public boolean add(Cetegory cetegory) {

	try{
		//add the cetegory to the databse table
		
		sessionFactory.getCurrentSession().persist(cetegory);
		return true;

	}
	catch(Exception e){
		e.printStackTrace();
		System.out.println("This is add operation test case ");
		return false;
	}

}

	
//	Delete particular data
public boolean delete(Cetegory cetegory) {
	cetegory.setActive(false);
	try{
		//add the cetegory to the databse table
		
		sessionFactory.getCurrentSession().update(cetegory);
		return true;

	}
	catch(Exception e){
		e.printStackTrace();
		System.out.println("This is test case deletion ");
		return false;
	}
}


//Update Particular data
public boolean update(Cetegory cetegory) {
	try{
		//add the cetegory to the databse table
		
		sessionFactory.getCurrentSession().update(cetegory);
		return true;

	}
	catch(Exception e){
		e.printStackTrace();
		System.out.println("This is test case updation ");
		return false;
	}
}
}
