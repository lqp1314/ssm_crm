package cn.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.crm.mapper.CustomerMapper;
import cn.crm.pojo.Customer;
import cn.crm.pojo.QueryVo;
import cn.crm.service.CustomerService;
import cn.crm.utils.Page;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{
   
	@Autowired
	private CustomerMapper customerMapper;	
	/**
	 * 根据条件查询
	 */
	@Override
	public Page<Customer> queryCustomerByQueryVo(QueryVo queryVo) {
		// TODO Auto-generated method stub
	  //设置查询条件 从哪一条数据开始查    0-9  10-19 20-29
		//当前页-1 * 每页行数
	
		if(queryVo!=null)
		{
		   //判断当前页d
			queryVo.setStart((queryVo.getPage()-1)*queryVo.getRows());
			//判断传来的参数 是否为空
			if(null != queryVo.getCustName() && !"".equals(queryVo.getCustName().trim())){
				queryVo.setCustName(queryVo.getCustName().trim());
			}
			if(null != queryVo.getCustSource() && !"".equals(queryVo.getCustSource().trim())){
				queryVo.setCustSource(queryVo.getCustSource().trim());
			}
	        //省略一下俩个
			if(null != queryVo.getCustIndustry() && !"".equals(queryVo.getCustIndustry().trim())){
				queryVo.setCustIndustry(queryVo.getCustIndustry().trim());
			}
			if(null != queryVo.getCustLevel() && !"".equals(queryVo.getCustLevel().trim())){
				queryVo.setCustLevel(queryVo.getCustLevel().trim());
			}
			
			
		}
		
		//查询结果集 
		List<Customer> list = this.customerMapper.queryCustomerByQueryVo(queryVo);
		
		//查询到的数据总条数
		int total = this.customerMapper.queryCountByQueryVo(queryVo);
		
		// 封装返回的page对象  
		Page<Customer> page = new Page<>();
		page.setPage(queryVo.getPage()); // 当前页
		page.setTotal(total); //总页数
		page.setRows(list); 
		page.setSize(queryVo.getRows());  //每页条数
		
		
		return page;
	}
	@Override
	public Customer queryCustomerById(Integer id) {
       Customer customer = customerMapper.queryCustomerById(id);
		return customer;
	}
	@Override
	public void updateCustomerById(Customer customer) {
         customerMapper.updateCustomerById(customer);
		 
	}
	@Override
	public void deleteCustomerById(Integer id) {
         customerMapper.deleteCustomerById(id);		
	}

}
