package org.antwalk.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.antwalk.model.Movie;
import org.antwalk.model.User;
import org.antwalk.model.Valentine;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController
{
	@RequestMapping("/")
	public String home()   //homeBean
	{
		return "home";
	}

	@RequestMapping("greet")          //welcomeBean
	public String welcome(HttpServletRequest request)
	{
		String firstName=request.getParameter("firstname");
		request.setAttribute("fName",firstName);
		return "welcome";
	}

	@RequestMapping("show")
	public ModelAndView showModel(HttpServletRequest request) //ShowModel Bean
	{
		ModelAndView mv=new ModelAndView("showModel");
		Movie movie=new Movie("BusinessMan",2012,"5 Star",180);
		String name="Mahesh";
		List<String> cities=new ArrayList<>();
		cities.add("Macherla");
		mv.addObject("name",name);
		mv.addObject("model",movie);
		mv.addObject("lists",cities);
		return mv;
	}

	@RequestMapping("user")
	public ModelAndView showUser() //ShowModel Bean
	{
		ModelAndView mv=new ModelAndView("userForm");
		User user=new User();
		Map<String,String> genderMap=new HashMap<>();
		genderMap.put("Male","Male");
		genderMap.put("Female", "Female");
		Map<String,String> countryMap=new HashMap<>();
		countryMap.put("India", "India");
		countryMap.put("USA", "USA");
		countryMap.put("UK", "UK");
		countryMap.put("China", "China");
		countryMap.put("Australia", "Australia");
		mv.addObject("user",user);
		mv.addObject("country",countryMap);
		mv.addObject("gender",genderMap);
		return mv;
	}


	@RequestMapping("userInfo")
	public ModelAndView showUserInfo(@Valid User user,BindingResult result) //ShowModel Bean
	{
		ModelAndView mv=new ModelAndView("userInfo");
		System.out.println(user);
		mv.addObject("user",user);
		if(result.hasErrors())
		{
			System.out.println("Has Errors");
		}
		return mv;
	}

	@RequestMapping("valentineform")
	public ModelAndView showvalentine()
	{
		ModelAndView mv=new ModelAndView("valentineform");
		Valentine val=new Valentine();
		Map<String,String> giftMap=new HashMap<>();
		giftMap.put("Chocolate", "Chocolate");
		giftMap.put("Teddy", "Teddy");
		giftMap.put("Flowers", "Flowers");
		giftMap.put("Clothes","Clothes");
		mv.addObject("gifts", giftMap);
		mv.addObject("valentine",val);
		return mv;
	}


	@RequestMapping("valentinedetails")
	public ModelAndView showvalentinedetails(@ModelAttribute("valentine") Valentine val)
	{
		ModelAndView mv=new ModelAndView("valentinedetails");
		System.out.println(val);
		mv.addObject("valentine", val);
		return mv;

	}
}
