/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-04-02 13:41:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/"; 
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>主菜单</title>\r\n");
      out.write("<!-- 导入easyui的资源文件 -->\r\n");
      out.write("     <!-- 如果不添加");
      out.print(basePath);
      out.write(" 则 访问不到静态路径 -->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("js/easyui/themes/default/easyui.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("js/easyui/themes/icon.css\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/jquery-1.8.2.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("\t<!-- 处理json 数据 --> \r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/jsonHandler.js\"></script>\r\n");
      out.write("\t<!-- 汉化  将easyUI的信息 汉化 不然有的内容是英文 -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/easyui/locale/easyui-lang-zh_CN.js\"> </script>\r\n");
      out.write("</head>\r\n");
      out.write("<!-- 这里将页面布局放到 body上   实现对整个页面进行布局 -->\r\n");
      out.write("<body class=\"easyui-layout\">  \r\n");
      out.write("    <!-- 东西南北中四个方位  不想用哪一个 可以去掉 -->\r\n");
      out.write("    <div data-options=\"region:'north',title:'北',split:true\" style=\"height:100px;\">\r\n");
      out.write("      <h1 style=\"color: red; \"  align=\"center\">EasyUI 试 验 田</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div data-options=\"region:'south',title:'南 Title',split:true\" style=\"height:100px;\"></div>\r\n");
      out.write("    <div data-options=\"region:'east',title:'东',split:true\" style=\"width:100px;\"></div>\r\n");
      out.write("    <!-- 在 div中 添加 iconCls的样式图标  注意 它是 data-options 里面的属性 不是单独的 -->\r\n");
      out.write("\r\n");
      out.write("    <div data-options=\"region:'west',title:'西',split:true,iconCls:'icon-world'\" style=\"width:100px;\">\r\n");
      out.write("        <!-- 进行树控件的显示   原理是使用ajax 来完成数据的加载传输-->\r\n");
      out.write("        <ul id=\"tt\">\r\n");
      out.write("        \r\n");
      out.write("        </ul>   \r\n");
      out.write(" \r\n");
      out.write("    </div>\r\n");
      out.write("    <div data-options=\"region:'center',title:'中部',noheader:true\" style=\"padding:5px;background:#eee;\" >\r\n");
      out.write("       \t<div id=\"tab\" class=\"easyui-tabs\" data-options=\"fit:true\">   \r\n");
      out.write("\t\t    <div title=\"首页\" style=\"padding:20px;\" data-options=\"iconCls:'icon-house'\">   \r\n");
      out.write("\t\t       \t 欢迎使用物流后台管理系统    \r\n");
      out.write("\t\t    </div>   \r\n");
      out.write("\t\t</div> \r\n");
      out.write("    </div>\r\n");
      out.write("        <!-- 编写js脚本 实现树空间的json数据   \r\n");
      out.write("         使用loadFilter函数处理来自Web Services的JSON数据。\r\n");
      out.write("          根据easyUI要求的格式 来传入json数据  本质还是ajax   -->\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("       $(function(){\r\n");
      out.write("    \t   $(\"#tt\").tree({\r\n");
      out.write("    \t\t   //這一步 就可以實現 顯示數的功能  會自動傳入json數據\r\n");
      out.write("    \t\t url:'");
      out.print(basePath);
      out.write("admin/getTree',\r\n");
      out.write("    \t\t  // checkbox:true,  添加复选框\r\n");
      out.write("    \t\t  /*\r\n");
      out.write("    \t\t  很多事件的回调函数都包含'node'参数，其具备如下属性：\r\n");
      out.write("               id：绑定节点的标识值。\r\n");
      out.write("               text：显示的节点文本。\r\n");
      out.write("               iconCls：显示的节点图标CSS类ID。\r\n");
      out.write("               checked：该节点是否被选中。\r\n");
      out.write("               state：节点状态，'open' 或 'closed'。\r\n");
      out.write("               attributes：绑定该节点的自定义属性。\r\n");
      out.write("               target：目标DOM对象。*/\r\n");
      out.write("             //用户点击一个节点的时候触发该事件\r\n");
      out.write("    \t       onClick:function(node){\r\n");
      out.write("    \t    \t   //向中间区域 添加 tabs 标签       查看tabs 标签是否已经存在\r\n");
      out.write("    \t    \t   var flag = $(\"#tab\").tabs('exists',node.text); //例如： 系统管理\r\n");
      out.write("    \t\t\t   if(!flag){  //如果不存在则创建\r\n");
      out.write("    \t\t\t\t   //注意这里NULL  是字符串 是 数据库里面的值\r\n");
      out.write("    \t\t\t\t   if(node.href!='NULL'){\r\n");
      out.write("    \t\t\t\t\t   //如href不为空 则添加tabs标签\r\n");
      out.write("    \t\t\t\t\t   $(\"#tab\").tabs('add',{\r\n");
      out.write("    \t\t\t\t\t\t  title:node.text,/* 获取tree节点的文本内容 */\r\n");
      out.write("    \t\t\t\t\t\t  iconCls:node.iconCls,/* 获取tree节点的图标 */\r\n");
      out.write("    \t\t\t\t\t\t  closable:true,  //在设置为true的时候，选项卡面板将显示一个关闭按钮，在点击的时候会关闭选项卡面板。\r\n");
      out.write("    \t\t\t\t\t\t  /* href属性：可以将指定页面内容加载到当前的选项卡面板中 */\r\n");
      out.write("    \t\t\t\t\t\t  href:'");
      out.print(basePath);
      out.write("'+node.href\r\n");
      out.write("    \t\t\t\t\t   });\t\t\t   \r\n");
      out.write("    \t\t\t\t    }   \t\t\t\t  \r\n");
      out.write("    \t\t\t\t   }\r\n");
      out.write("    \t\t\t   else{ //如果该标签已经存在  则 跳转到指定的选项卡中\r\n");
      out.write("    \t\t\t      //select选择一个选项卡面板，'which'参数可以是选项卡面板的标题或者索引。\r\n");
      out.write("    \t\t\t\t  $(\"#tab\").tabs('select',node.text); \r\n");
      out.write("    \t\t\t   }\r\n");
      out.write("    \t        }\t \r\n");
      out.write("    \t   });   \r\n");
      out.write("       });\r\n");
      out.write("    </script>\r\n");
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
