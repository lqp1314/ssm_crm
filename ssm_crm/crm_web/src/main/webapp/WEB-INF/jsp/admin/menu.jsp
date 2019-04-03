<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%  String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" ; %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>菜单管理</title>
</head>
<body>
     <!-- 创建菜单jsp  使用 datagrid 数据表格 -->
     <!-- 这里采用js 的方式创建 -->
     <table id="dg">
     </table> 
     
     <script type="text/javascript">
        $(function(){
        	$("#dg").datagrid({
        		//接受传来的json字符串 完成数据的填充  还要加上 分页的数据  
        	   url:'<%=basePath%>admin/getPage',
        	   //数据列  注意要和传来的field 一致  
       	       columns:[[    //控制easyui的表头   
       	    	{checkbox:true}, //columns 里的属性 显示复选框   
       	    	/*单元格formatter(格式化器)函数，带3个参数： value：字段值。rowData：行记录数据。rowIndex: 行索引。 可以对数据进行一个格式化的操作*/
    	        {field:'id',title:'主键',width:100,align:'center',formatter:function(value,row,index){
    	        	//if(index[0])
    	        	//if(value=='open'){
      	        	if(row.pid=='0'){ //对数据完成 拼串处理
    	        		return "<span style='color:red'>"+value+"</span>"
    	        	}else{
    	        		return "<span style='color:blue'>"+value+"</span>"
    	        		}
    	        	}  	        	
    	        },    
    	        {field:'text',title:'菜单名称',width:100,align:'center'},    
    	        {field:'state',title:'菜单展开状态',width:100,align:'center',formatter: function(value,row,index){
		        	//if(value=='open'){
		        	if(value=='open'){
		        		return '展开';
		        	}else{
		        		return '关闭';
		        	}
		        }},    
    	        {field:'iconCls',title:'菜单图标',width:100,align:'center'},   
    	        {field:'pid',title:'父标签主键',width:100,align:'center'},   
    	        {field:'href',title:'菜单链接',width:100,align:'center',formatter: function(value,row,index){
		        	//if(value=='open'){
		        	if(row.href=='NULL'){
		        		return '无链接';
		        	}else{
		        		return value;
		        	}
		       	}},   
          	   
    	        ]],
    	       /*  singleSelect:true, // 单选按钮 只能选一个  */
    	        selectOnCheck:true , //如果为true，单击复选框将永远选择行。   如果为false，选择行将不选中复选框。
    	        pagination:true, // easyUI的分页系统  是datagrid里面的一个属性 可以直接调用
    	        fit:true , //将分页框放到最后面  最自动适应最佳的位置
    	        /*数据网格（datagrid）面板的头部工具栏。可能的值：  用于存放 增删改查的操作
    	                        一个  {} 是一个按钮操作    '_'  表示俩个按钮之间的 分割线|
    	        */
    	        toolbar:[
    	        	{
    	        	  text:"添加菜单",
    	        	  iconCls:'icon-add', //样式
    	        	  handler:function(){//当点击添加菜单时，会执行此处的handler函数 
  		    			$("#add").window({
		    				title:'添加菜单',
		    				iconCls:'icon-add',
		    				width:400,
		    				height:300,
		    				resizable:false // 窗口属性 定义是否能够改变窗口大小。
		    			});
		    		
		    			showFirst();//调用函数
    	        	  }
    
    	        	},'_',{	
    	        		iconCls:'icon-edit',
			    		text:'修改菜单',
    	        	    handler:function(){alert('修改菜单')}    	        	
    	        	},'_',{
    	        		iconCls:'icon-remove',
			    		text:'批量删除',
			    		handler:function(){
			    			alert("删除")
			    		}

    	        	
    	        	}	
    	      

    	       ]
    	        	
        	});
        	   	
        });
     
     </script> 
     
     <!-- 添加菜单 div   通过点击相应的 toolbar函数 将这个div 在窗口上显示 $("#add").window({});-->
     <!-- 将表格放置在中间位置   align-->
     <div id="add" align="center">
        <form action="#" >
           <p style="color: lime;">菜单名称:<input type="text" name="text"></p>
           <p>展开状态:
                 <select name="state">
                      <option value="open">展开</option>
                      <!-- 规定选项（在首次显示在列表中时）表现为选中状态。 -->
                      <option value="closed" selected="selected">关闭</option>
                 </select>  
           </p>
           <p>菜单图标:<input type="text" name="iconCls"></p>
           <p>菜单链接:<input type="text" name="href"></p>
           <p>父标签键:
				<select name="pid" id="pid">
					<option value="0" selected="selected">无</option>
				</select>
		   </p>
          <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-ok'" id="ok">确定</a>
				&nbsp;
		  <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'">取消</a>
        
        </form>
     </div>
         
</body>
</html>