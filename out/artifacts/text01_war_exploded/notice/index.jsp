  <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path=request.getScheme()+"://"+request.getServerName()+":"+
	request.getServerPort()+request.getContextPath()+"/";
	pageContext.setAttribute("path", path);
%>
<!DOCTYPE html>
<html>
<head>
	<base href="<%=this.getServletContext().getContextPath() %>/doctor/">
    <title>门诊医生</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="../Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="../Css/style.css" />
    <script type="text/javascript" src="../Js/jquery.js"></script>
    <script type="text/javascript" src="../Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="../Js/bootstrap.js"></script>
    <script type="text/javascript" src="../Js/ckform.js"></script>
    <script type="text/javascript" src="../Js/common.js"></script>
    <script type="text/javascript" src="../Js/jquery-3.4.1.js"></script>

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
			$("#ret").click(function(){
				$("#name").val("");
				$("#department").val("0");
			});
		});
    </script>
</head>
<body>

<form action="${pageContext.request.contextPath}/notice/list" method="post" class="definewidth m20">
<table class="table table-bordered table-hover definewidth m10">
	<tr>
	  <td width="10%" class="tableleft">标题：</td>
	  <center>
	  <td><input type="text" id="nname" name="nname" value="${nname}"/></td>
	  <td><input id="find" name="find" type="submit" class="btn btn-primary" value="查询"/></td>
	  </center>		
	</tr>
</table>
</form>
   
<table class="table table-bordered table-hover definewidth m10" >
   <thead>
    <tr>
        <th>标题</th>
        <th>内容</th>
        <th>发布时间</th>
    </tr>
    </thead>
    <tbody>
		<c:forEach items="${page.list}" var="usr">
        <tr>
				<td>${usr.nname}</td> 
		        <td>${usr.content}</td> 
		        <td>${usr.ntime}</td>
				<td><a href="${pageContext.request.contextPath}/notice/edit/${usr.nid}">修改</a>&nbsp;&nbsp;
					<a href="${pageContext.request.contextPath}/notice/delete/${usr.nid}">删除</a>
					</td>
			</tr>
		</c:forEach>
	 </tbody>
  </table>
  
  <table class="table table-bordered table-hover definewidth m10" >
  	<tr>
  		<th colspan="5">  <div class="inline pull-right page">
          <a href="${pageContext.request.contextPath}/notice/list?pageNum=1${queryResult}" >首页</a> 
	          <a href="${pageContext.request.contextPath}/notice/list?pageNum=${page.pageNum-1}${queryResult}">上一页</a>     
	          <a href="${pageContext.request.contextPath}/notice/list?pageNum=${page.pageNum+1}${queryResult}" >下一页</a> 
	          <a href="${pageContext.request.contextPath}/notice/list?pageNum=${page.pages}${queryResult}" >尾页</a>
          
		  &nbsp;&nbsp;&nbsp;共<span class='current'>${page.total}</span>条记录
		  <span class='current'> ${page.pageNum} / ${page.pages} </span>页
		  
		  </div>
		 <div>
		 	<a href="${pageContext.request.contextPath}/notice/add.jsp">添加公告</a>
		 </div>
		 
		 </th>
	</tr>
  </table>  
</body>

</html>
