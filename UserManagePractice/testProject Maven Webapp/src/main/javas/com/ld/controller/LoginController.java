package com.ld.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ld.entity.AjaxResult;
import com.ld.entity.Resource;
import com.ld.entity.User;
import com.ld.service.MenueService;
import com.ld.service.ResourceService;
import com.ld.service.UserService;

@Controller
@RequestMapping("/System")
public class LoginController extends BaseController{
	@Autowired
	private ResourceService resourceService;
	@Autowired
	private UserService userService;
	
	private final static String ADMIN_LOGIN = "admin/login/login";
	private final static String INDEX = "admin/index/index";
	private final static String TEST = "admin/index/test";
	
	@InitBinder({ "user" })
	public void initBinderUser(WebDataBinder binder) {
		binder.setFieldDefaultPrefix("user.");
	}
	
	@RequestMapping(value="/Login",method = RequestMethod.GET)
	public String ShowLoginForm(){
		return ADMIN_LOGIN;
	}
	
	@RequestMapping(value="/Login",method = RequestMethod.POST)
	@ResponseBody
	public AjaxResult Login(Model model,@RequestBody User user){
		Subject CurrentUser = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(user.getName(), user.getPassWord());
		try{
			CurrentUser.login(token);
		}catch(UnknownAccountException ex){
			return new AjaxResult(false, "�˺Ų�����!");
		}catch(IncorrectCredentialsException ex){
			return new AjaxResult(false, "�������!");
		}
		return new AjaxResult(true, "");
	}
	
	@RequestMapping("/{name}/index")
	public String GotoIndex(Model model,@PathVariable("name") String name){	
		User user = userService.findUserByName(name);
		MenueService menues = resourceService.findMenueByUserId(user.getId());
		model.addAttribute("menues", menues);
		return INDEX;
	}
	
	@RequestMapping(value="/test1")
	@ResponseBody
	public void test(@RequestParam("id") int id){
		List<Resource> list = resourceService.findResourceByUserId(id);
		System.out.println("test�����Ѿ�����" + id);
	}
	
}
