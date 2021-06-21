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
    <title>添加医生</title>
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
 	<script type="text/javascript" src="../Js/My97DatePicker/WdatePicker.js"></script>

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

<form action="${pageContext.request.contextPath}/company/save" method="post" class="definewidth m20" enctype="multipart/form-data">

<table class="table table-bordered table-hover definewidth m10">
    <tr>
        <td width="10%" class="tableleft">公司名称</td>
        <td><input type="text" name="ename" value=""/></td>
    </tr>
    
    <tr>
        <td width="10%" class="tableleft">公司类别</td>
        <td>
        	<select name="type">
        		<option value="1">线上教育类</option>
        		<option value="2">餐饮类</option>
        		<option value="3">互联网</option>
        		<option value="4">建筑类</option>
        		<option value="5">科研类</option>
        	</select>
        </td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">公司简介</td>
        <td><textarea name="abstrut"></textarea></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">招聘岗位</td>
        <td><input type="text" name="jobname"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">岗位信息</td>
        <td><textarea name="jobstrut"></textarea></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">薪资</td>
        <td><input type="text" name="salary"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">电子邮箱</td>
        <td><input type="text" name="email" value=""/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">联系电话</td>
        <td><input type="text" name="linkphone" value=""/></td>
    </tr>
    <tr>
        <td colspan="2">
			<center>
			<input name="save" id="save" type="submit" class="btn btn-primary" value="保存"/>
			 &nbsp;&nbsp;
			 <button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button>
			</center>
		</td>
    </tr>
</table>
</form>
</body>
</html>