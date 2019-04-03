package cn.crm.service;

import java.util.List;
import java.util.Map;

import cn.crm.pojo.EasyuiTree;

public interface EasyuiService {
	 Boolean isLogin(String username,String password);

	List<EasyuiTree> selectNavs(String id);

	Map<String, Object> getAllRecord(Integer page, Integer rows);
}
