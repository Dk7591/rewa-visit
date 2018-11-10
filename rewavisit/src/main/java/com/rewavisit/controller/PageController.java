package com.rewavisit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shoppingbackend.dao.CetegoryDao;

@Controller
public class PageController {
	
	
@Autowired
private CetegoryDao cetegoryDao;

	@RequestMapping(value= {"/", "/home", "/index"})	
	public ModelAndView index()
	{
			ModelAndView mv=new ModelAndView("page");
			mv.addObject("title","Home");
			//Passing the cetegory
			mv.addObject("cetegories",cetegoryDao.list());
			mv.addObject("userClickHome",true);
			return mv;
	}
	
	
	}

