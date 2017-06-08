package com.ld.realm;

import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.ld.entity.Resource;
import com.ld.entity.Role;
import com.ld.entity.User;
import com.ld.service.ResourceService;
import com.ld.service.RoleService;
import com.ld.service.UserService;

public class UserRealm extends AuthorizingRealm {
	
	@Autowired
	private UserService userService;
	@Autowired
	private ResourceService resourceService;
	@Autowired
	private RoleService roleService;
	
	//获取用户权限信息
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		User user = (User)principals.getPrimaryPrincipal();
		List<Role> roles = roleService.findRolesByUserName(user.getName());
		List<Resource> resources = resourceService.findResourceByUserId(user.getId());
		return null;
	}
	
	//验证用户信息
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		String name = token.getPrincipal().toString();
		User user = userService.findUserByName(name);
		if(user == null){
			throw new UnknownAccountException();
		}
		SimpleAuthenticationInfo Authentication = new SimpleAuthenticationInfo(user,user.getPassWord(),getName());
		return Authentication;
	}

}
