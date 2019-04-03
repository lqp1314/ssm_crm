package cn.crm.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.crm.pojo.BaseDict;
import cn.crm.pojo.Customer;
import cn.crm.pojo.QueryVo;
import cn.crm.service.BaseDictService;
import cn.crm.service.CustomerService;
import cn.crm.utils.Page;

@Controller("customerController")
@RequestMapping(value="customer")
public class CustomerController {
	
	
	// 客户来源
	@Value("${CUSTOMER_FROM_TYPE}")
	private String CUSTOMER_FROM_TYPE;
	// 客户行业
	@Value("${CUSTOMER_INDUSTRY_TYPE}")
	private String CUSTOMER_INDUSTRY_TYPE;
	// 客户级别
	@Value("${CUSTOMER_LEVEL_TYPE}")
	private String CUSTOMER_LEVEL_TYPE;
	
    /**
     *显示用户列表 
     */
	@Autowired
	private BaseDictService baseDictService;
	
	@Autowired
	private CustomerService  customerService; 
	@RequestMapping("/list")   
	/**
	 * 存放类型  可以使 Map 也可以是 Model  本质上 两个是一样的   加入 queryVo 用来查询数据
	 * @param map
	 * @return
	 */
	
	public String queryCustomerList(QueryVo queryVo,Map map)
	{
        //判断客户名是否为空
		if(queryVo.getCustName()!=null && !"".equals(queryVo.getCustName().trim()))
		try {
			queryVo.setCustName(new String(queryVo.getCustName().getBytes("ISO-8859-1"),"UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 客户来源
		List<BaseDict> fromType = this.baseDictService.selectBaseDictListByCode(this.CUSTOMER_FROM_TYPE);
		// 所属行业
		List<BaseDict> industryType = this.baseDictService.selectBaseDictListByCode(this.CUSTOMER_INDUSTRY_TYPE);
		// 客户级别
		List<BaseDict> levelType = this.baseDictService.selectBaseDictListByCode(this.CUSTOMER_LEVEL_TYPE);
		map.put("fromType", fromType);
		map.put("industryType", industryType);
		map.put("levelType", levelType);
		
		System.out.println(queryVo.getCustIndustry()+"ss");
		System.out.println(queryVo.getCustSource()+"ss");
		System.out.println(queryVo.getCustLevel()+"ss");
		// 分页查询数据
		Page<Customer> page = this.customerService.queryCustomerByQueryVo(queryVo);
		// 把分页查询的结果放到模型中
		map.put("page", page);
		// 数据回显  查询结果传输完后  将上面查询的条件再次显示出来
		//第一张 用请求来的 page 输入  第二种 用 传来的 queryVo 来实现
		map.put("custName",queryVo.getCustName() );
		map.put("custSource", queryVo.getCustSource());
		map.put("custIndustry", queryVo.getCustIndustry());
		map.put("custLevel", queryVo.getCustLevel());

		return "customer";
	}
	
	
	/*
	 * 通过ID查询 用户
	 * 
	 *   ajax 请求  要求返回json 格式的字符串
	 */
	@RequestMapping(value="edit")
	@ResponseBody
	public Customer queryCustomerById(Integer id)
	{
		Customer customer = customerService.queryCustomerById(id);
		return customer;
	}
	
	/**
	 * 修改保存 
	 * 这里用到了 ajax的 serialize() 方法
	 * 在修改完成后 必须向ajax 传入 OK 的值 不然 ajax收不到 指令
	 */
	
	@RequestMapping("/update")
	@ResponseBody
	public  String updateCustomer(Customer customer)
	{
	   customerService.updateCustomerById(customer);
		return "OK";
	}
	
	//删除 也是一样 要返回OK的装填 返回给ajax
	@RequestMapping("/delete")
	@ResponseBody
	public String deleteCustomerById(Integer id)
	{
		customerService.deleteCustomerById(id);
		return "OK";
	}
	
}
