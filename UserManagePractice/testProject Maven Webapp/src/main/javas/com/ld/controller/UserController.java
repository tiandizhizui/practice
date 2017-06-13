package com.ld.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ld.dao.UserMapper;
import com.ld.entity.Page;
import com.ld.entity.PageForm;
import com.ld.entity.User;
import com.ld.service.UserService;

@Controller
public class UserController {
	private static final String USER_LIST = "admin/user/UserList";
	private static final String USER_ADD = "admin/user/UserAdd";
	@Autowired
	private UserService userService;
	
	@RequestMapping("/UserList")
	@RequiresPermissions("User:view")
	public String GoToUserList(){
		return USER_LIST;
	}
	
	@RequestMapping("/UserAdd")
	@RequiresPermissions("User:create")
	public String GoToUserAdd(){
		return USER_ADD;
	}
	
	@RequestMapping("/UserPaging")
	@RequiresPermissions("User:view")
	@ResponseBody
	public Page Userpaging(int limit,int offset,String _){
		/*PageForm form = new PageForm(offset,limit);*/
		List<User> users = userService.findUserByLimit(offset,limit);
		Page page = new Page();
		page.setTotal(userService.getCount());
		page.setRows(users);
		return page;
	}
}
