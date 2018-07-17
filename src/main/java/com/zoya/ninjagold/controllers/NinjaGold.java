package com.zoya.ninjagold.controllers;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class NinjaGold {
	Random rand = new Random ();
	
	
	@RequestMapping("/")
	public String showAll(HttpSession session){
		Integer total = (Integer)session.getAttribute("total");
		if(total== null) {
			session.setAttribute("total", 0);
			session.setAttribute("msg", "");
		}
		
		return "index";
	}
	
	@PostMapping("/{path}")
	public String findGold(@PathVariable String path,HttpSession session) {
		Date date = new Date();
		
		DateFormat dateFormat = new SimpleDateFormat(" MMM dd yyy 'at' hh:mm a ");
		
		String msg = "("+ dateFormat.format(date)+") " +"";
		if(path.equals("farm")) {
			Integer total = (Integer)session.getAttribute("total");			
			int val=rand.nextInt((20-10)+1)+10;
			total+=val;
			session.setAttribute("total", total);
			msg+="You entered a farm and earned "+val+" gold(s)";
				
	}
		
		else if(path.equals("cave")) {
			Integer total = (Integer)session.getAttribute("total");	
			int val=rand.nextInt((10-5)+1)+10;
			total+=val;
			session.setAttribute("total", total);
			msg +="You entered a cave and earned "+val+" gold(s)";
			
		}
		
		else if(path.equals("house")) {
		Integer total = (Integer)session.getAttribute("total");
			int val=rand.nextInt((5-2)+1)+5;
			total+=val;
			session.setAttribute("total", total);
			 msg+="You entered a house and earned "+val+" gold(s)";
		
		}
		
		else if(path.equals("casino")) {
			Integer total = (Integer)session.getAttribute("total");
			int val=rand.nextInt((50-(-50))+1)+(-50);
			total+=val;
			session.setAttribute("total", total);
			
			if(total<0) {
				 msg +="You entered a casino and lost "+val+" gold(s)";
			}
			
			else {
				msg +="You entered a casino and earned "+val+" gold(s)";
				}
		}
		
		else if(path.equals("spa")) {
			Integer total = (Integer)session.getAttribute("total");
			int val=rand.nextInt((20-5)+1)+5;
			total+=val;
			session.setAttribute("total", total);
			msg+="You entered a spa and lost "+val+" gold(s)";
			
			}
			
		session.setAttribute("msg", (String)session.getAttribute("msg")+msg+"\n");
		return "redirect:/";
		}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		System.out.println("resesttttt");
		return "redirect:/";
	}
	

}
