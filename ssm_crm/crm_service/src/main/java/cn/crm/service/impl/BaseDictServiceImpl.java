package cn.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.crm.mapper.BaseDictMapper;
import cn.crm.pojo.BaseDict;
import cn.crm.service.BaseDictService;

@Service("baseDictService")
public class BaseDictServiceImpl implements BaseDictService{

	@Autowired
	private BaseDictMapper baseDictMapper;
	@Override
	public List<BaseDict> selectBaseDictListByCode(String code) {
		// TODO Auto-generated method stub
				List<BaseDict> list = this.baseDictMapper.queryBaseDictByDictTypeCode(code);
				return list;
	}
	
	

	
}
