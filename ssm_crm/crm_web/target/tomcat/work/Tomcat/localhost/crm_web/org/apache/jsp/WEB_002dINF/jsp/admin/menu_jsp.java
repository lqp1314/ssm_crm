/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-04-02 15:26:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
  String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" ; 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>菜单管理</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("     <!-- 创建菜单jsp  使用 datagrid 数据表格 -->\r\n");
      out.write("     <!-- 这里采用js 的方式创建 -->\r\n");
      out.write("     <table id=\"dg\">\r\n");
      out.write("     </table> \r\n");
      out.write("     \r\n");
      out.write("     <script type=\"text/javascript\">\r\n");
      out.write("        $(function(){\r\n");
      out.write("        \t$(\"#dg\").datagrid({\r\n");
      out.write("        \t\t//接受传来的json字符串 完成数据的填充  还要加上 分页的数据  \r\n");
      out.write("        \t   url:'");
      out.print(basePath);
      out.write("admin/getPage',\r\n");
      out.write("        \t   //数据列  注意要和传来的field 一致  \r\n");
      out.write("       \t       columns:[[    //控制easyui的表头   \r\n");
      out.write("       \t    \t{checkbox:true}, //columns 里的属性 显示复选框   \r\n");
      out.write("       \t    \t/*单元格formatter(格式化器)函数，带3个参数： value：字段值。rowData：行记录数据。rowIndex: 行索引。 可以对数据进行一个格式化的操作*/\r\n");
      out.write("    \t        {field:'id',title:'主键',width:100,align:'center',formatter:function(value,row,index){\r\n");
      out.write("    \t        \t//if(index[0])\r\n");
      out.write("    \t        \t//if(value=='open'){\r\n");
      out.write("      \t        \tif(row.pid=='0'){ //对数据完成 拼串处理\r\n");
      out.write("    \t        \t\treturn \"<span style='color:red'>\"+value+\"</span>\"\r\n");
      out.write("    \t        \t}else{\r\n");
      out.write("    \t        \t\treturn \"<span style='color:blue'>\"+value+\"</span>\"\r\n");
      out.write("    \t        \t\t}\r\n");
      out.write("    \t        \t}  \t        \t\r\n");
      out.write("    \t        },    \r\n");
      out.write("    \t        {field:'text',title:'菜单名称',width:100,align:'center'},    \r\n");
      out.write("    \t        {field:'state',title:'菜单展开状态',width:100,align:'center',formatter: function(value,row,index){\r\n");
      out.write("\t\t        \t//if(value=='open'){\r\n");
      out.write("\t\t        \tif(value=='open'){\r\n");
      out.write("\t\t        \t\treturn '展开';\r\n");
      out.write("\t\t        \t}else{\r\n");
      out.write("\t\t        \t\treturn '关闭';\r\n");
      out.write("\t\t        \t}\r\n");
      out.write("\t\t        }},    \r\n");
      out.write("    \t        {field:'iconCls',title:'菜单图标',width:100,align:'center'},   \r\n");
      out.write("    \t        {field:'pid',title:'父标签主键',width:100,align:'center'},   \r\n");
      out.write("    \t        {field:'href',title:'菜单链接',width:100,align:'center',formatter: function(value,row,index){\r\n");
      out.write("\t\t        \t//if(value=='open'){\r\n");
      out.write("\t\t        \tif(row.href=='NULL'){\r\n");
      out.write("\t\t        \t\treturn '无链接';\r\n");
      out.write("\t\t        \t}else{\r\n");
      out.write("\t\t        \t\treturn value;\r\n");
      out.write("\t\t        \t}\r\n");
      out.write("\t\t       \t}},   \r\n");
      out.write("          \t   \r\n");
      out.write("    \t        ]],\r\n");
      out.write("    \t       /*  singleSelect:true, // 单选按钮 只能选一个  */\r\n");
      out.write("    \t        selectOnCheck:true , //如果为true，单击复选框将永远选择行。   如果为false，选择行将不选中复选框。\r\n");
      out.write("    \t        pagination:true, // easyUI的分页系统  是datagrid里面的一个属性 可以直接调用\r\n");
      out.write("    \t        fit:true , //将分页框放到最后面  最自动适应最佳的位置\r\n");
      out.write("    \t        /*数据网格（datagrid）面板的头部工具栏。可能的值：  用于存放 增删改查的操作\r\n");
      out.write("    \t                        一个  {} 是一个按钮操作    '_'  表示俩个按钮之间的 分割线|\r\n");
      out.write("    \t        */\r\n");
      out.write("    \t        toolbar:[\r\n");
      out.write("    \t        \t{\r\n");
      out.write("    \t        \t  text:\"添加菜单\",\r\n");
      out.write("    \t        \t  iconCls:'icon-add', //样式\r\n");
      out.write("    \t        \t  handler:function(){//当点击添加菜单时，会执行此处的handler函数 \r\n");
      out.write("  \t\t    \t\t\t$(\"#add\").window({\r\n");
      out.write("\t\t    \t\t\t\ttitle:'添加菜单',\r\n");
      out.write("\t\t    \t\t\t\ticonCls:'icon-add',\r\n");
      out.write("\t\t    \t\t\t\twidth:400,\r\n");
      out.write("\t\t    \t\t\t\theight:300,\r\n");
      out.write("\t\t    \t\t\t\tresizable:false // 窗口属性 定义是否能够改变窗口大小。\r\n");
      out.write("\t\t    \t\t\t});\r\n");
      out.write("\t\t    \t\t\r\n");
      out.write("\t\t    \t\t\tshowFirst();//调用函数\r\n");
      out.write("    \t        \t  }\r\n");
      out.write("    \r\n");
      out.write("    \t        \t},'_',{\t\r\n");
      out.write("    \t        \t\ticonCls:'icon-edit',\r\n");
      out.write("\t\t\t    \t\ttext:'修改菜单',\r\n");
      out.write("    \t        \t    handler:function(){alert('修改菜单')}    \t        \t\r\n");
      out.write("    \t        \t},'_',{\r\n");
      out.write("    \t        \t\ticonCls:'icon-remove',\r\n");
      out.write("\t\t\t    \t\ttext:'批量删除',\r\n");
      out.write("\t\t\t    \t\thandler:function(){\r\n");
      out.write("\t\t\t    \t\t\talert(\"删除\")\r\n");
      out.write("\t\t\t    \t\t}\r\n");
      out.write("\r\n");
      out.write("    \t        \t\r\n");
      out.write("    \t        \t}\t\r\n");
      out.write("    \t      \r\n");
      out.write("\r\n");
      out.write("    \t       ]\r\n");
      out.write("    \t        \t\r\n");
      out.write("        \t});\r\n");
      out.write("        \t   \t\r\n");
      out.write("        });\r\n");
      out.write("     \r\n");
      out.write("     </script> \r\n");
      out.write("     \r\n");
      out.write("     <!-- 添加菜单 div   通过点击相应的 toolbar函数 将这个div 在窗口上显示 $(\"#add\").window({});-->\r\n");
      out.write("     <!-- 将表格放置在中间位置   align-->\r\n");
      out.write("     <div id=\"add\" align=\"center\">\r\n");
      out.write("        <form action=\"#\" >\r\n");
      out.write("           <p style=\"color: lime;\">菜单名称:<input type=\"text\" name=\"text\"></p>\r\n");
      out.write("           <p>展开状态:\r\n");
      out.write("                 <select name=\"state\">\r\n");
      out.write("                      <option value=\"open\">展开</option>\r\n");
      out.write("                      <!-- 规定选项（在首次显示在列表中时）表现为选中状态。 -->\r\n");
      out.write("                      <option value=\"closed\" selected=\"selected\">关闭</option>\r\n");
      out.write("                 </select>  \r\n");
      out.write("           </p>\r\n");
      out.write("           <p>菜单图标:<input type=\"text\" name=\"iconCls\"></p>\r\n");
      out.write("           <p>菜单链接：<input type=\"text\" name=\"href\"></p>\r\n");
      out.write("           <p>父标签键：\r\n");
      out.write("\t\t\t\t<select name=\"pid\" id=\"pid\">\r\n");
      out.write("\t\t\t\t\t<option value=\"0\" selected=\"selected\">无</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t   </p>\r\n");
      out.write("          <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-ok'\" id=\"ok\">确定</a>\r\n");
      out.write("\t\t\t\t&nbsp;\r\n");
      out.write("\t\t  <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-cancel'\">取消</a>\r\n");
      out.write("        \r\n");
      out.write("        </form>\r\n");
      out.write("     </div>\r\n");
      out.write("         \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
