package com.ciq.Controller1;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.ciq.DAO.ProductDaoImpl;
import com.ciq.Model.LogClass;
import com.ciq.Model.Product;

@Controller
public class ProductController {
    @Autowired
	private ProductDaoImpl impl;
    
    
	@RequestMapping(value = "/")
	public String home(Model m) {
		List<Product> products = impl.getProducts();
		m.addAttribute("pr", products);
		return "index1";
		//return "LOGIN";
	}
	
	//show add products form
	@RequestMapping("/add")
	public String addProduct(Model md) {
		//base.jsp in ${title}
		md.addAttribute("title","Add Product");
		return "adding_product";
	}
	
	//its handle the INSERT as well as UPDATE
	//handle add product form
	//adding_product.jsp page in form action url
	@RequestMapping(value = "/myproduct", method = RequestMethod.POST)
	public RedirectView  handleProduct(@ModelAttribute Product pr,HttpServletRequest req) {
		System.out.println(pr);
		
		impl.createProduct(pr);
		
		RedirectView rv=new  RedirectView();
		//takes the page back
		rv.setUrl(req.getContextPath()+"/");
		return rv;
	}
	
	//delete handler
	@RequestMapping("/delete/{prodid}")
	public RedirectView deleteProduct(@PathVariable("prodid") int pid,HttpServletRequest req) {
		impl.deleteProduct(pid);
		RedirectView rv=new RedirectView();
		rv.setUrl(req.getContextPath()+"/");//it takes back to the home page
		return rv;
	}
	
	//show the updateview page
	@RequestMapping("/update/{pid}")
	public String updateForm(@PathVariable("pid") int id,Model m) {
		Product product = impl.getProduct(id);
		m.addAttribute("upd", product);
		return "updform";
	}
	
	
	@PostMapping("/update")
	public String update(@ModelAttribute("id") Product p) {
		System.out.println(p);
		impl.updatepr(p);
		return "redirect:/";
	}
	


	//77777777777777777777777777777777777777777777777777777
//	@RequestMapping(value ="/login",method = RequestMethod.GET)
//	 public String loginForm() {
//		 return "LOGIN";
//	 }
		
		@GetMapping(value = "/lg")
		//@GetMapping("/updateEmp")
		public ModelAndView loginInfo(@RequestParam("psw") String ps,@RequestParam("usr") String username, LogClass logclass) {
		   //getById():bz first we load the data and then updating the data

			if(ps.equals("afreen")&&username.equals("afreen")) {
				ModelAndView modelAndView = new ModelAndView("index1");
				return modelAndView;
			}
			else {
				System.out.println("incorrect password"); };
				ModelAndView modelAndView1 = new ModelAndView("incorrectpsw");

			return modelAndView1;
			
		}
	
}
