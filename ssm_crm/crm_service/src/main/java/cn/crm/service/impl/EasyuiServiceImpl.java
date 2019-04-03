package cn.crm.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.crm.mapper.EasyuiMapper;
import cn.crm.pojo.EasyuiTree;

@Service("easyuiService")
public class EasyuiServiceImpl implements cn.crm.service.EasyuiService {

	@Autowired
	private EasyuiMapper easyuiMapper;
	@Override
	public Boolean isLogin(String username, String password) {
		int login = easyuiMapper.isLogin(username, password);
		System.out.println(login);
		if(login>=1)
		{
			return true;
		}
		return false;
	}
	@Override
	public List<EasyuiTree> selectNavs(String id) {
		// TODO Auto-generated method stub
		 return easyuiMapper.selectNavs(id);
	}
	/*
	 * (non-Javadoc)
	 * @see cn.crm.service.EasyuiService#getAllRecord(java.lang.Integer, java.lang.Integer)
	 * 
	 * 获得分页的 信息数据  注意  page 当前页 和 rows  每页的 数据数量
	 */
	@Override
	public Map<String, Object> getAllRecord(Integer page, Integer rows) {

		Integer startIndex=((page)-1)*(rows); //计算获取数据的索引   rows 每行的数
		//使用 limit 实现 每一个的数据 采集
		List<Map<String, Object>> rowsList=easyuiMapper.getAllRecord(startIndex,rows);
		// 获取总条数 
		int total = easyuiMapper.getTotal();
		System.out.println(startIndex);
		System.out.println(rows);
		Map<String, Object> map= new HashMap<String,Object>(); 
		map.put("total", total);
		map.put("rows", rowsList); //key值 只能使用 rows  不然 页面收不到
		return map;
	}

}
