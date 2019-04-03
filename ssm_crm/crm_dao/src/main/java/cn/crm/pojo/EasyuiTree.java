package cn.crm.pojo;
/*
 * 存放 tree的 对象
 */
public class EasyuiTree {
   private String id;
   private String text;
   private String state;
   private String iconCls;
   private String pid;
   private String href;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	@Override
	public String toString() {
		return "EasyuiTree [id=" + id + ", text=" + text + ", state=" + state + ", iconCls=" + iconCls + ", pid=" + pid
				+ ", href=" + href + "]";
	}
}
