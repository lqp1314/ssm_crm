package cn.crm.service;

import cn.crm.pojo.Customer;
import cn.crm.pojo.QueryVo;
import cn.crm.utils.Page;

public interface CustomerService {
  
	/**
	 * 根据条件分页查询客户  注意  这里用的是 page类  mapper层用的是  list<customer>
	 */
	Page<Customer> queryCustomerByQueryVo(QueryVo queryVo);
    
	//根据 ID查询 数据 
	Customer queryCustomerById(Integer id);
	//修改客户信息 
	void updateCustomerById(Customer customer );
	//删除客户通过ID
	void deleteCustomerById(Integer id);

}
