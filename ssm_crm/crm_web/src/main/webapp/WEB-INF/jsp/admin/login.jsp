<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort() +request.getContextPath()+"/";
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<!-- 导入easyui的资源文件 -->
     <!-- 如果不添加<%=basePath%> 则 访问不到静态路径 -->
	<link rel="stylesheet" type="text/css" href="<%=basePath%>js/easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>js/easyui/themes/icon.css">
	<script type="text/javascript" src="<%=basePath%>js/jquery-1.8.2.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/jsonHandler.js"></script>
</head>
<body>
    <!-- 使用easyUI创建 简单的登录窗口   使用div的方式创建  标题 =登录-->
    <div  id="win" >
      <!-- 将窗口放置到中心位置  离顶端30 像素-->
       <center style="padding-top: 30px">
         <form id="form" >
            <p>用户名:<input type="text" name="username"></p>
            <p>密&nbsp;码:<input type="text" name="password"></p>
            <div>
            <!-- class 设为 按钮形式 iconCls 设置图标 -->
    		<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-ok'" id="login">登录</a>  
			&nbsp;
		    <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'">取消</a>  
            </div>    
         </form>
       </center>
    </div>
    
    <!-- 编写 js脚本 -->
    <script type="text/javascript">
      //将这个div 设置为 窗口形式      
      $(function(){
			$('#win').window({    
			    width:300,    
			    height:200,  
			    /*定义是否将窗体显示为模式化窗口。*/
			    modal:true,
			    title:'登录',/* 设置窗口的标题 */
			    iconCls:'icon-login'/* 设置窗口的图标 */,
			    /*定义是否可以拖动窗口*/
			    draggable:false,
			    /*是否可以折叠窗口*/
			    collapsible:false,
			    /*是否能够改变窗口大小*/
			    resizable:false,
			    /*如果设置为true，在窗体显示的时候显示阴影。*/
			    shadow:true
			});
        
           //给窗口按钮添加单击事件 
           $("#login").click(function(){
        	  //将得到的数据 全局序列化
        	 //var param = $("#form").serializeObject();
        	  //使用ajax 进行页面回显  key:value
        	  $.ajax({
        		url :"<%=basePath %>/admin/isLogin",
        		type:"post",
        		data:{
        	     /* 这个是 获得input里面的数值的方法 $("input[name=username]").val() 一定要记住*/
        	     username:$("input[name=username]").val(),
        	     password:$("input[name=password]").val(),
        		},
        		success:function(data)
        		{
        			//返回Boolean类型
        			if(data){  //登录成功 返回页面首页
        		      window.location.href="<%=basePath %>/admin/main";
        			}
        			else{//登录失败的情况下
        				//提示信息  调用easyUI的消息窗口 
        				/*
        				title：在头部面板显示的标题文本。
                        msg：显示的消息文本。
                        fn(b): 当用户点击“确定”按钮的时侯将传递一个true值给回调函数，否则传递一个false值。
        				*/
        				$.messager.confirm('确认','账号或密码不对!',function(r){
        					if(r){ //点击了确认按钮  
        					 //  将先前输入的账号和密码设为空
                             $("input[name=username]").val("");
							 $("input[name=password]").val("");
        					 //将焦点再次放到username上
        					 $("input[name=username]").focus();
        					}
        				});
        				
        			}
        				
        		}
        		
        		  
        		  
        		  
        	  });
           });
      });
    
    </script>
</body>
</html>