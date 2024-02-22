package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	
	@RequestMapping("/one")
	public RedirectView one()
	{
		System.out.println("First Controller");
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("https://www.google.com");
		return redirectView;
	}
	@RequestMapping("/enjoy")
	public String enjoy()
	{
		System.out.println("This is second controller");
		return "";
	}

}
