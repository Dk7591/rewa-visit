package com.rewavisit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shoppingbackend.dao.CetegoryDao;
import com.shoppingbackend.dao.ProductDAO;
import com.shoppingbackend.dto.Cetegory;
import com.shoppingbackend.dto.Product;

@Controller
public class PageController {
	
private static final Logger Logger=LoggerFactory.getLogger(PageController.class);	
	@Autowired
	public ProductDAO productdao;
	
@Autowired
private CetegoryDao cetegorydao;

	@RequestMapping(value= {"/", "/home", "/index"})	
	public ModelAndView index()
	{
			ModelAndView mv=new ModelAndView("page");
			mv.addObject("title","Home");
			
			Logger.info("Inside Of PageController index - INFO");
			Logger.debug("Inside Of PageController index - DEBUG");
			//Passing the cetegory
			mv.addObject("cetegories",cetegorydao.list());
			mv.addObject("userClickHome",true);
			return mv;
	}
	
	
	@RequestMapping("/aboutUs")	
	public ModelAndView aboutUs()
	{
			ModelAndView mv=new ModelAndView("page");
			mv.addObject("title","AboutUs");
			//Passing the cetegory
			mv.addObject("userClickAboutUs",true);
			return mv;
	}
//	@RequestMapping("/gallary")	
//	public ModelAndView gallary()
//	{
//			ModelAndView mv=new ModelAndView("page");
//			mv.addObject("title","Gallary");
//			//Passing the cetegory
//			mv.addObject("userClickGallary",true);
//			return mv;
//	}
	@RequestMapping("/contact")	
	public ModelAndView contact()
	{
			ModelAndView mv=new ModelAndView("page");
			mv.addObject("title","Contact");
			//Passing the cetegory
			mv.addObject("cetegories",cetegorydao.list());
			mv.addObject("userClickContact",true);
			return mv;
	}
	
	/*
	 * Method to load all the product
	 * 
	 * */
	@RequestMapping(value="/show/all/gallary")	
	public ModelAndView showAllGallary()
	{
			ModelAndView mv=new ModelAndView("page");
			mv.addObject("title","All the Gallary");
			//Passing the cetegory
			
			System.out.println("All Gallary");
			mv.addObject("cetegories",cetegorydao.list());
			mv.addObject("userClickAllGallary",true);
			return mv;
	}
	
	@RequestMapping(value="/show/cetegory/{id}/gallary")	
	public ModelAndView showCetegoryGallary(@PathVariable("id") int id)
	{
			ModelAndView mv=new ModelAndView("page");
			
			//Cetegory dao fatch for single 
			
			Cetegory cetegory=null;
			cetegory=cetegorydao.get(id);
			
			mv.addObject("title", cetegory.getName());
			System.out.println("Gallary");
			//Passing the cetegory
			mv.addObject("cetegories",cetegorydao.list());
			
			//Passing the single cetegory
			
			mv.addObject("cetegory",cetegory);
			mv.addObject("userClickCetegoryGallary",true);
			return mv;
	}
	
	
//	view single product
	
	@RequestMapping(value="/show/{id}/product")	
	public ModelAndView showSingleProduct(@PathVariable int id)
	{
			ModelAndView mv=new ModelAndView("page");
			
			//Productdao fatch for single 
			Product product=productdao.get(id);
			
			product.setViews(product.getViews()+1);
			
			//Update View
			
			productdao.update(product);
			
			mv.addObject("title",product.getName());
			mv.addObject("product",product);
			mv.addObject("userClickShowProduct",true);
			
			
			return mv;
	}
	
	
	
	
	
	}

