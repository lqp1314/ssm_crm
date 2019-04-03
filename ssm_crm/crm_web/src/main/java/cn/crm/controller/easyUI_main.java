package cn.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.support.json.JSONParser;
import com.fasterxml.jackson.core.JsonParser;

import cn.crm.pojo.EasyuiTree;
import cn.crm.service.EasyuiService;

@Controller
@RequestMapping(value="/admin")
public class easyUI_main {

     /*
      *  获取导航栏信息  通过json数据  实现 tree控件
      */
	
	@Autowired
	private EasyuiService easuiService;
	@RequestMapping("/getTree")
	@ResponseBody
	//(@RequestParam(defaultValue = "0")   要求先加载  父节点  不默认视为0 的话  默认传来的是 null  会造成混乱 所以 要默认为0
    public List<EasyuiTree> getAllNavs(@RequestParam(defaultValue = "0") String id) {
        System.out.println("id=" + id);
        List<EasyuiTree> list = easuiService.selectNavs(id);
 
        System.out.println(list);
        return list;
    }
	
	/*
	 *  href属性：可以将指定页面内容加载到当前的选项卡面板中 
     *	href:'<%=basePath %>admin/'+node.href
	 */
	@RequestMapping("/pc")
    public String to_page()
    {
		return "/admin/pc";
    }
	/*
	 * 将 json  数据传递到菜单管理的页面上 
	 */
	@RequestMapping("/menu")
	public String to_menu()
	{
		
		return "/admin/menu";
	}
	
	@RequestMapping(value="/getPC")
	@ResponseBody
    public List<EasyuiTree> getAllNavs() {
	
        List<EasyuiTree> list = easuiService.selectNavs("0");
 
        System.out.println(list);
        return list;
    }
	
	//获得总记录数  包括分页的数据    getPage
	@RequestMapping(value="/getPage")
	@ResponseBody
	public Map<String, Object> getPage(@RequestParam(defaultValue="1")Integer page, @RequestParam(defaultValue="10")Integer rows )
	{
	    Map<String, Object> map = easuiService.getAllRecord(page,rows);
		System.out.println(map);
/*		Map<String, Object> map = new HashMap<>();
		map.put("page", page);
		map.put("row", rows);
		*/
		return map;
	}
}
