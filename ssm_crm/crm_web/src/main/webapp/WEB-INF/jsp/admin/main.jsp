<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/"; %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主菜单</title>
<!-- 导入easyui的资源文件 -->
     <!-- 如果不添加<%=basePath%> 则 访问不到静态路径 -->
	<link rel="stylesheet" type="text/css" href="<%=basePath%>js/easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>js/easyui/themes/icon.css">
	<script type="text/javascript" src="<%=basePath%>js/jquery-1.8.2.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/easyui/jquery.easyui.min.js"></script>
	<!-- 处理json 数据 --> 
	<script type="text/javascript" src="<%=basePath%>js/jsonHandler.js"></script>
	<!-- 汉化  将easyUI的信息 汉化 不然有的内容是英文 -->
    <script type="text/javascript" src="<%=basePath%>js/easyui/locale/easyui-lang-zh_CN.js"> </script>
</head>
<!-- 这里将页面布局放到 body上   实现对整个页面进行布局 -->
<body class="easyui-layout">  
    <!-- 东西南北中四个方位  不想用哪一个 可以去掉 -->
    <div data-options="region:'north',title:'北',split:true" style="height:100px;">
      <h1 style="color: red; "  align="center">EasyUI 试 验 田</h1>
    </div>
    <div data-options="region:'south',title:'南 Title',split:true" style="height:100px;"></div>
    <div data-options="region:'east',title:'东',split:true" style="width:100px;"></div>
    <!-- 在 div中 添加 iconCls的样式图标  注意 它是 data-options 里面的属性 不是单独的 -->

    <div data-options="region:'west',title:'西',split:true,iconCls:'icon-world'" style="width:100px;">
        <!-- 进行树控件的显示   原理是使用ajax 来完成数据的加载传输-->
        <ul id="tt">
        
        </ul>   
 
    </div>
    <div data-options="region:'center',title:'中部',noheader:true" style="padding:5px;background:#eee;" >
       	<div id="tab" class="easyui-tabs" data-options="fit:true">   
		    <div title="首页" style="padding:20px;" data-options="iconCls:'icon-house'">   
		       	 欢迎使用物流后台管理系统    
		    </div>   
		</div> 
    </div>
        <!-- 编写js脚本 实现树空间的json数据   
         使用loadFilter函数处理来自Web Services的JSON数据。
          根据easyUI要求的格式 来传入json数据  本质还是ajax   -->

    <script type="text/javascript">


       $(function(){
    	   $("#tt").tree({
    		   //這一步 就可以實現 顯示數的功能  會自動傳入json數據
    		 url:'<%=basePath%>admin/getTree',
    		  // checkbox:true,  添加复选框
    		  /*
    		  很多事件的回调函数都包含'node'参数，其具备如下属性：
               id：绑定节点的标识值。
               text：显示的节点文本。
               iconCls：显示的节点图标CSS类ID。
               checked：该节点是否被选中。
               state：节点状态，'open' 或 'closed'。
               attributes：绑定该节点的自定义属性。
               target：目标DOM对象。*/
             //用户点击一个节点的时候触发该事件
    	       onClick:function(node){
    	    	   //向中间区域 添加 tabs 标签       查看tabs 标签是否已经存在
    	    	   var flag = $("#tab").tabs('exists',node.text); //例如： 系统管理
    			   if(!flag){  //如果不存在则创建
    				   //注意这里NULL  是字符串 是 数据库里面的值
    				   if(node.href!='NULL'){
    					   //如href不为空 则添加tabs标签
    					   $("#tab").tabs('add',{
    						  title:node.text,/* 获取tree节点的文本内容 */
    						  iconCls:node.iconCls,/* 获取tree节点的图标 */
    						  closable:true,  //在设置为true的时候，选项卡面板将显示一个关闭按钮，在点击的时候会关闭选项卡面板。
    						  /* href属性：可以将指定页面内容加载到当前的选项卡面板中 */
    						  href:'<%=basePath%>'+node.href
    					   });			   
    				    }   				  
    				   }
    			   else{ //如果该标签已经存在  则 跳转到指定的选项卡中
    			      //select选择一个选项卡面板，'which'参数可以是选项卡面板的标题或者索引。
    				  $("#tab").tabs('select',node.text); 
    			   }
    	        }	 
    	   });   
       });
    </script>
</body>
</html>