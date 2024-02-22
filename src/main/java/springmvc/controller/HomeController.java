package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("THIS IS HOME PAGE URL");
		model.addAttribute("name","Gyanendra Pratap Shukla");
		List<String> f=new ArrayList<>();
		f.add("Shailesh");
		f.add("Shivam");
		f.add("Rustom");
		f.add("Shashank");
		model.addAttribute("friends",f);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name", "Rustom");
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time",now);
		modelAndView.setViewName("help");
		return modelAndView;
	}

}
