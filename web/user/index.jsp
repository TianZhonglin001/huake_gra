<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path=request.getScheme()+"://"+request.getServerName()+":"+
	request.getServerPort()+request.getContextPath()+"/";
	pageContext.setAttribute("path", path);
	
	String imgPath=request.getScheme()+"://"+request.getServerName()+":"+
			request.getServerPort()+"/Hospital-pic/";
	pageContext.setAttribute("imgPath", imgPath);
%>
<!DOCTYPE html>
<html>
<base href="<%=this.getServletContext().getContextPath() %>/medicine/">
<head>
    <title>药品查询</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="../Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="../Css/style.css" />
    <script type="text/javascript" src="../Js/jquery.js"></script>
    <script type="text/javascript" src="../Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="../Js/bootstrap.js"></script>
    <script type="text/javascript" src="../Js/ckform.js"></script>
    <script type="text/javascript" src="../Js/common.js"></script>

    <style type="text/css">
        body {
            padding-bottom: 40px;
        }
        .sidebar-nav {
            padding: 9px 0;
        }

        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        }


    </style>
    <script type="text/javascript">
		$(function(){
			$("#newNav").click(function(){
				window.location.href="${pageContext.request.contextPath}/medicine/add.jsp";
			});
			$("#ret").click(function(){
				$("#name").val("");
				$("#department").val("0");
			});
			$("#checkall").click(function(){
				$("tbody input").prop("checked",$(this).prop("checked"));
			});
			$("#delAll").click(function(){
				var ids = [];
				$("tbody input:checked").each(function(index,item){
					var id = $(item).val();
					alert(id);
					ids.push(id);
				});
				$.ajax({
					type:"post",
					url:"${pageContext.request.contextPath}/medicine/batchDelete",
					data:{"ids":ids,"_method":"delete"},
					success:function(msg){
						if(msg.status == 200){
							window.location.href="${pageContext.request.contextPath}/medicine/list";
						}
					}
				});
		});
    </script>
</head>
<body>

<form action="${pageContext.request.contextPath}/User/list" method="post" class="definewidth m20">
	<table class="table table-bordered table-hover definewidth m10">
	    <tr>
	        <td width="10%" class="tableleft">搜索账号：</td>
	        <td><input type="text" id="username" name="username" value="${username}"/></td>
			
	        <td width="10%" class="tableleft">身份：</td>
	        <td>
		        <select name="department" id="department">
		        	<option value="0" >==请选择==</option>
		       		<option value="1"  <c:if test="${department == 1 }">selected='selected'</c:if>>教师</option>
			        <option value="2"  <c:if test="${department == 2 }">selected='selected'</c:if>>学生</option>
		        </select>
	        </td>
	    </tr>
	    <tr>
			  <td colspan="4">
				<center>
					<input id="find" name="find" type="submit" class="btn btn-primary" value="查询"/>
			  		<input id="ret" name="ret" type="button" class="btn btn-primary" value="清空"/> 
				</center>
	        </td>
	    </tr>
	</table>
</form>
   
<table class="table table-bordered table-hover definewidth m10" >
   <thead>
    <tr>
    	<th>头像</th>
        <th>姓名</th>
        <th>账号</th>
        <th>性别</th>
        <th>身份</th>
        <th>操作</th>
    </tr>
  
    </thead>
    <tbody>
    	<c:forEach items="${page.list}" var="usr">
        <tr>
        		<td><img width="80px" height="60px" src="${pageContext.request.contextPath}/user/user_headimg/${usr.picture}"></img></td> 
				<td>${usr.name}</td> 
				<td>${usr.username}</td>
				<td>
		        	<c:if test="${usr.sex == 1 }">男</c:if>
		        	<c:if test="${usr.sex == 2 }">女</c:if>
		        </td> 
		        <td>
		        	<c:if test="${usr.department == 1 }">教师</c:if>
		        	<c:if test="${usr.department == 2 }">学生</c:if>
		        </td>
				<td>
					<a href="${pageContext.request.contextPath}/User/edit/${usr.uid}">修改</a>&nbsp;&nbsp;
					<a href="${pageContext.request.contextPath}/User/delete/${usr.uid}">删除</a>&nbsp;&nbsp;
					<a href="${pageContext.request.contextPath}/User/detail/${usr.uid}">详情>>></a>
				</td>
			</tr>
		</c:forEach>
     </tbody>
  </table>
  
  <table class="table table-bordered table-hover definewidth m10" >
  	<tr><th colspan="5">  
  			<div class="inline pull-right page">
	          <a href="${pageContext.request.contextPath}/medicine/list?pageNum=1${queryResult}" >首页</a> 
	          <a href="${pageContext.request.contextPath}/medicine/list?pageNum=${page.pageNum-1}${queryResult}">上一页</a>     
	          <a href="${pageContext.request.contextPath}/medicine/list?pageNum=${page.pageNum+1}${queryResult}" >下一页</a> 
	          <a href="${pageContext.request.contextPath}/medicine/list?pageNum=${page.pages}${queryResult}" >尾页</a>
			  &nbsp;&nbsp;&nbsp;
			     共<span class='current'>${page.total}</span>条记录
			  <span class='current'>${page.pageNum} / ${page.pages} </span>页
		  </div>
		 <div>
			<a href="${pageContext.request.contextPath}/user/add.jsp">添加用户信息</a>	
		 </div>
		 
		 </th></tr>
  </table>
  
</body>
</html>
