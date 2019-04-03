package cn.crm.pojo;
/**
 * 视图对象 用于返回 视图中出现的对象
 * @author lqf
 *  name="custName"    旁边富有 value值
 *  ........
 *  另外 在进行页面搜索的是 需要使用分页操作 所以需要添加相应的属性
 */
public class QueryVo {
	
	private String custName;
	private String custSource;
	private String custIndustry;
	private String custLevel;
	//当前页码数 
	private Integer page=1;
	//数据库从那一条数据开始查
	private Integer start;
	//每页显示的数据条数 每页显示10 条
	private Integer rows=10 ;
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustSource() {
		return custSource;
	}
	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}

	public String getCustIndustry() {
		return custIndustry;
	}
	public void setCustIndustry(String custIndustry) {
		this.custIndustry = custIndustry;
	}
	public String getCustLevel() {
		return custLevel;
	}
	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
    
}
