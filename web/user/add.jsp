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
    <title>添加药品</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="../Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="../Css/style.css" />
    <script type="text/javascript" src="../Js/jquery.js"></script>
    <script type="text/javascript" src="../Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="../Js/bootstrap.js"></script>
    <script type="text/javascript" src="../Js/ckform.js"></script>
    <script type="text/javascript" src="../Js/common.js"></script>
    <script type="text/javascript" src="../Js/ckeditor/ckeditor.js"></script>
 

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
	<script	type="text/javascript">
 		$(function(){
 			$("#backid").click(function(){
 				window.history.go(-1);
 			});
 		});
 	</script>
</head>
<body>

<form action="${pageContext.request.contextPath}/User/save" method="post" class="definewidth m20" enctype="multipart/form-data">
<table class="table table-bordered table-hover definewidth m10">
    <tr>
        <td width="10%" class="tableleft">姓名</td>
        <td><input type="text" name="name"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">图片</td>
        <td><input type="file" name="pic"/></td>
    </tr> 
    <tr>
        <td width="10%" class="tableleft">账号</td>
        <td><input type="text" name="username"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">密码</td>
        <td><input type="text" name="password"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">手机号</td>
        <td><input type="text" name="phone"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">性别</td>
        	<td>
        	<input type="radio" name="sex" value="1" checked/>男&nbsp;&nbsp;&nbsp;
        	<input type="radio" name="sex" value="2"/>女
        	</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">年龄</td>
        <td><input type="text" name="age" /></td>
    </tr>

    <tr>
        <td width="10%" class="tableleft">出生日期</td>
         <td>
        	<input type="text" name="birthday"/>			
		</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">邮箱</td>
        <td><input type="text" name="email" /></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">身份</td>
        	<td>
        	<input type="radio" name="department" value="1" checked/>教师&nbsp;&nbsp;&nbsp;
        	<input type="radio" name="department" value="2"/>学生
        	</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">简历</td>
        <td><input type="text" name="resume"/></td>
    </tr>
   
    <tr>
        <td colspan="2">
			<center>
				<button type="submit" class="btn btn-primary">保存</button> &nbsp;&nbsp;
				<button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button>
			</center>
		</td>
    </tr>
</table>
</form>
</body>
</html>