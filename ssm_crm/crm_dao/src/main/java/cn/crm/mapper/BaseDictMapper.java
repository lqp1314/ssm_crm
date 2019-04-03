package cn.crm.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.crm.pojo.BaseDict;

@Repository("baseDictMapper")
public interface BaseDictMapper {
  /**
   * 根据类别代码查询数据 
   */
  List<BaseDict> queryBaseDictByDictTypeCode(String dictTypeCode);
 
}
