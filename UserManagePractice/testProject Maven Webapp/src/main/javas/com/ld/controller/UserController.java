package com.ld.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ld.entity.Page;
import com.ld.entity.User;

@Controller
public class UserController {
	private static final String USER_LIST = "admin/user/UserList";
	
	@RequestMapping("/UserList")
	@RequiresPermissions("User:view")
	public String GoToUserList(){
		return USER_LIST;
	}
	
	@RequestMapping("/UserPaging")
	@ResponseBody
	public Page Userpaging(int limit,int offset,String _){
		User user1 = new User("����", "123");
		Page page = new Page();
		List<User> rows = new ArrayList<User>();
		for(int i = 0;i < 6;i++){
			rows.add(user1);
		}
		page.setRows(rows);
		page.setTotal(6);
		return page;
	}
}
