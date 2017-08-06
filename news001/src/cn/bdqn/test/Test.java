package cn.bdqn.test;

import cn.bdqn.bean.News_User;
import cn.bdqn.service.UserService;
import cn.bdqn.service.impl.UserServiceImpl;

public class Test {
	public static void main(String[] args) {
		UserService service=new UserServiceImpl();
		News_User user=service.login("admin", "admin");
		System.out.println(user);
	}
}
