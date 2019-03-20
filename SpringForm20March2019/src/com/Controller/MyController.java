package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("/myform")
	public ModelAndView processRequest()
	{	
		ModelAndView mv=new ModelAndView("displayform");
		User user = new User();
		mv.addObject("data", user);
		return mv;
	}
	
	@RequestMapping("/processform")
	public ModelAndView processRequest1(@ModelAttribute("data")User user)
	{	
		ModelAndView mv=new ModelAndView("HelloPage");
		mv.addObject("data1", user.getUname());
		mv.addObject("data2", user.getPass());
		mv.addObject("data3", user.getLoc());
		return mv;
	}

}
