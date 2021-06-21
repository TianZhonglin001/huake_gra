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

<form action="${pageContext.request.contextPath}/company/list" method="post" class="definewidth m20">
<table class="table table-bordered table-hover definewidth m10">
	<tr>
	  <td width="10%" class="tableleft">公司名称：</td>
	  <td><input type="text" id="ename" name="ename" value="${ename}"/></td>		
	  <td width="10%" class="tableleft">公司类型：</td>
	  <td>
	    <select name="type" id="type">
	        <option value="0" >==请选择==</option>
	        <option value="1" <c:if test="${type == 1 }">selected='selected'</c:if>>线上教育类</option>
	        <option value="2" <c:if test="${type == 2 }">selected='selected'</c:if>>餐饮类</option>
	        <option value="3" <c:if test="${type == 3 }">selected='selected'</c:if>>互联网</option>
	        <option value="4" <c:if test="${type == 4 }">selected='selected'</c:if>>建筑类</option>
	        <option value="5" <c:if test="${type == 5 }">selected='selected'</c:if>>科研类</option>
        </select>
	  </td>
	</tr>
	<tr>
	  <td colspan="6">
	    <center>
			<input id="find" name="find" type="submit" class="btn btn-primary" value="查询"/>
		</center>
	  </td>
	 </tr>
</table>
</form>
   
<table class="table table-bordered table-hover definewidth m10" >
   <thead>
    <tr>
        <th>公司名称</th>
        <th>公司类型</th>
        <th>招聘岗位</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
		<c:forEach items="${page.list}" var="usr">
        <tr>
				<td>${usr.ename}</td> 
				<td>
		        <c:if test="${usr.type == 1 }">线上教育类</c:if>
		        <c:if test="${usr.type == 2 }">餐饮类</c:if>
		        <c:if test="${usr.type == 3 }">互联网</c:if>
		        <c:if test="${usr.type == 4 }">建筑类</c:if>
		        <c:if test="${usr.type == 5 }">科研类</c:if>
		        </td> 
		        <td>${usr.jobname}</td> 
				<td><a href="${pageContext.request.contextPath}/company/edit/${usr.eno}">修改</a>&nbsp;&nbsp;
					<a href="${pageContext.request.contextPath}/company/delete/${usr.eno}">删除</a>
					</td>
			</tr>
		</c:forEach>
	 </tbody>
  </table>
  
  <table class="table table-bordered table-hover definewidth m10" >
  	<tr>
  		<th colspan="5">  <div class="inline pull-right page">
          <a href="${pageContext.request.contextPath}/company/list?pageNum=1${queryResult}" >首页</a> 
	          <a href="${pageContext.request.contextPath}/company/list?pageNum=${page.pageNum-1}${queryResult}">上一页</a>     
	          <a href="${pageContext.request.contextPath}/company/list?pageNum=${page.pageNum+1}${queryResult}" >下一页</a> 
	          <a href="${pageContext.request.contextPath}/company/list?pageNum=${page.pages}${queryResult}" >尾页</a>
          
		  &nbsp;&nbsp;&nbsp;共<span class='current'>${page.total}</span>条记录
		  <span class='current'> ${page.pageNum} / ${page.pages} </span>页
		  
		  </div>
		 <div>
		 	<a href="${pageContext.request.contextPath}/company/add.jsp">添加公司</a>
		 </div>
		 
		 </th>
	</tr>
  </table>  
</body>

</html>
