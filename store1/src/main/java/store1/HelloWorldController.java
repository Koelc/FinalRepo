package store1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorldController {
	String message = "Welcome to PizzaStore!";
	@RequestMapping("/")
	public String ShowIndex()
	{
		return "index";
	}
 
	@RequestMapping("/registration")
	public String ShowReg()
	{
		return "registration";
	}
	
	/*public ModelAndView showMessage(@RequestParam(value = "name", required = false, defaultValue = "World") String name)
	{
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("HelloWorld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}*/
	
	
	
	@RequestMapping("/returnhome")
	public String ShowSecond()
	{
		return "index";
	}
}