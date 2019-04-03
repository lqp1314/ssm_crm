package cn.crm.mapper;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;

import cn.crm.pojo.EasyuiTree;

@Resource
public interface EasyuiMapper {
	//查看密码和账号是否正确
	//@Param  使用它进行数据绑定 否则 接受不到数据  
   int isLogin(@Param("username")String username,@Param("password")String password);

    List<EasyuiTree> selectNavs(@Param("id")String id);
    //总条数
    int getTotal();
    //  分页需要的信息 
	List<Map<String, Object>> getAllRecord(@Param("startIndex")Integer startIndex, @Param("rows")Integer rows);
}
