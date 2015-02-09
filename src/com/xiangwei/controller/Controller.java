package com.xiangwei.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


@org.springframework.stereotype.Controller

     public class Controller{

	@RequestMapping("/bbbb")	   
	public ModelAndView helloWorld(){
		ModelAndView modelAndView = new ModelAndView("NewFile");
		modelAndView.addObject("welcome_message","fuxk this nigger");
		return modelAndView;
	}
	
	@RequestMapping("/index.html")
	public ModelAndView index(){
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}
	
	@RequestMapping("/ccc")
	   
	public ModelAndView helloWorld2(){
		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("welcome_message","fuxk this nigger");
		return modelAndView;
	}
	@RequestMapping(value ="/submitselectedCar.html",method = RequestMethod.POST)
	public ModelAndView carView(@ModelAttribute("car1") car car1){
		
		
		
		ModelAndView Car_Model = new ModelAndView("AselectedCar");
		
	    buildFactory(car1); 	
		return Car_Model;
		
		
	}
	protected void buildFactory(car car1){
		     
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		     
		     
		     
		session.save(car1);
		session.getTransaction().commit();
		session.close();
		
		
	}
	@RequestMapping(value ="/selectAcar.html",method = RequestMethod.GET)
	public ModelAndView carView2(){
		
		ModelAndView Car_Model2 = new ModelAndView("selectAcar");
		
		return Car_Model2;
		
		
	}
	

}
