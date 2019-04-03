package cn.crm.mapper;
/**
 * 客户操作类
 * @author lqf
 *
 */

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.crm.pojo.Customer;
import cn.crm.pojo.QueryVo;

@Repository
public interface CustomerMapper {
 /**
  * 根据queryVo分页查询数据   根据queryVo查询出customer的集合 然后返回该集合
  */
  List<Customer> queryCustomerByQueryVo(QueryVo querVo);	
  //总条数
  int queryCountByQueryVo(QueryVo queryVo);
  
  //根据id 查询客户 
  Customer queryCustomerById(Integer id);
  
  //修改客户信息 通过id
  void updateCustomerById(Customer customer);
  
  //通过id删除客户
  void deleteCustomerById(Integer id);
  
}
