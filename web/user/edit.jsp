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
<head>
    <title>修改药品</title>
    <base href="<%=this.getServletContext().getContextPath() %>/medicine/">
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
<form action="${pageContext.request.contextPath}/User/update" method="post" class="definewidth m20" enctype="multipart/form-data">
<input type="hidden" name="uid" value="${user.uid}"/>
<table class="table table-bordered table-hover definewidth m10">
    <tr>
        <td width="10%" class="tableleft">姓名</td>
        <td><input type="text" name="name"  readonly="readonly" value="${user.name}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">图片</td>
        <td>
        <input type="hidden" name="oldpicture" />
        <input type="file" name="pic1"/>
        <img  width="80px" height="50px" src="${pageContext.request.contextPath}/user/user_headimg/${user.picture}" ></img>
        </td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">账号</td>
        <td><input type="text" name="username" value="${user.username}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">密码</td>
        <td><input type="text" name="password" value="${user.password}" /></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">联系方式</td>
        <td><input type="text" name="phone" value="${user.phone}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">性别</td>
        <td>
        	<input type="radio" name="sex" value="1" <c:if test="${user.sex == 1}">checked='checked'</c:if>/>男&nbsp;&nbsp;&nbsp;
        	<input type="radio" name="sex" value="2" <c:if test="${user.sex == 2}">checked='checked'</c:if>/>女
        </td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">年龄</td>
        <td><input type="text" name="age" value="${user.age}"/></td>
    </tr>

    <tr>
        <td width="10%" class="tableleft">出生日期</td>
        <td><input type="text" name="birthday" value="${user.birthday} "/>(例如:1999-11-08)</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">邮箱</td>
        <td><textarea name="email" >${user.email}</textarea></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">身份</td>
        <td>
        	<input type="radio" name="sex" value="1" <c:if test="${user.department == 1}">checked='checked'</c:if>/>教师&nbsp;&nbsp;&nbsp;
        	<input type="radio" name="sex" value="2" <c:if test="${user.department == 2}">checked='checked'</c:if>/>学生
        </td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">简历</td>
        <td><input type="text" name="resume" value="${user.resume}"/></td>
    </tr>
    <tr>
        <td colspan="2">
			<center>
				<button type="submit" class="btn btn-primary" >保存</button> &nbsp;&nbsp;
				<button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button>
			</center>
		</td>
    </tr>
</table>
</form>
</body>
</html>