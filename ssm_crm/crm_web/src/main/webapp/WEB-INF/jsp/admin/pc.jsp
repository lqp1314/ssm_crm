<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort() +request.getContextPath()+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath %>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>PC管理</title>
</head>
<body>
	<h1>我是PC管理页面</h1>
	
<!-- 	    <table class="easyui-datagrid">
        <thead>
    		<tr>
    			<th data-options="field:'code'">Code</th>
    			<th data-options="field:'name'">Name</th>
    			<th data-options="field:'price'">Price</th>
    		</tr>
        </thead>
        <tbody>
    		<tr>
    			<td>001</td><td>name1</td><td>2323</td>
    		</tr>
    		<tr>
    			<td>002</td><td>name2</td><td>4612</td>
    		</tr>
    	</tbody>
    </table> -->

   <table id="dg"></table> 
     <!-- 网络表格 -->
     <script type="text/javascript">
        $(function(){
        	$('#dg').datagrid({    
        	    url:'<%=basePath%>admin/getPC',    
        	    columns:[[    
        	        {field:'id',title:'主键',width:100,align:'center'},    
        	        {field:'text',title:'菜单名称',width:100,align:'center'},    
        	        {field:'state',title:'菜单展开状态',width:100,align:'center'},    
        	        {field:'iconCls',title:'菜单图标',width:100,align:'center'},   
        	        {field:'pid',title:'父标签主键',width:100,align:'center'},   
        	        {field:'href',title:'菜单链接',width:100,align:'center'},   
              	   
        	        ]]    
        	}); 
        });
       </script> 
</body>
</html>