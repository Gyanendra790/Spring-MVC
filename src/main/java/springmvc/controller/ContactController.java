package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired 
	UserService userService;
	@ModelAttribute
	public void commonData(Model model)
	{
		model.addAttribute("Header","Learn SPRING");
		model.addAttribute("Desc","By Gyanendra Pratap Shukla");
	}
	@RequestMapping("/contact")
	public String showForm(Model model)
	{
		//common data
//		model.addAttribute("Header","Learn SPRING");
//		model.addAttribute("Desc","By Gyanendra Pratap Shukla");
		return "contact";
	}
	@RequestMapping(path="/processForm" ,method=RequestMethod.POST)
	public String formHandle(@ModelAttribute User user,Model model)
	{
		//common Data
//		model.addAttribute("Header","Learn SPRING");
//		model.addAttribute("Desc","By Gyanendra Pratap Shukla");
		model.addAttribute("user",user);
		model.addAttribute("message","Registered Successfully");
		this.userService.createUser(user);
		if(user.getUserName().isBlank())
			return "contact";
		return "success";
	}
/*
	@RequestMapping(path="/processForm" ,method=RequestMethod.POST)
	public String formHandle(@RequestParam("email")String email,
			                 @RequestParam("userName")String userName,
			                 @RequestParam("password")String password,Model model)
	{
//		model.addAttribute("UserName",userName);
//		model.addAttribute("UserEmail",email);
//		model.addAttribute("UserPassword",password);
		User user=new User();
		user.setEmail(email);
		user.setUserName(userName);
		user.setPassword(password);
		model.addAttribute("user",user);
		return "success";
	}*/

}
