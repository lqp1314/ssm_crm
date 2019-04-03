package cn.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.crm.service.EasyuiService;

/*
 * 使用easyUI形式 实现登录 按键
 */
@Controller
@RequestMapping("/admin")
public class easyUI_Login {
   @Autowired
   private EasyuiService easyuiService;
	//登录
	@RequestMapping("/login")
	public String toLogin()
	{
		return "/admin/login";
	}
	
	//通过ajax返回数据 查看登录是否成功
	@RequestMapping("/isLogin")
	@ResponseBody
	public Boolean isLogin(String username,String password)
	{
		System.out.println(username);
		System.out.println(password);
		
		return easyuiService.isLogin(username, password);

	}
	
	//后台首页
	@RequestMapping("/main")
	public String to_main()
	{
		return "/admin/main";
	}
}
