<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path=request.getScheme()+"://"+request.getServerName()+":"+
	request.getServerPort()+request.getContextPath()+"/";
	pageContext.setAttribute("path", path);
%>
<!DOCTYPE html>
<html>
<head>	
	<base href="<%=this.getServletContext().getContextPath() %>/doctor/">
    <title>修改医生</title>
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
<form action="${pageContext.request.contextPath}/situation/update"method="post" class="definewidth m20">
<input type="hidden" name="_method" value="put"/>
<table class="table table-bordered table-hover definewidth m10">
    <tr>
        <td width="10%" class="tableleft">学号</td>
        <td>${situation.sno}<input type="hidden" name="sno" value="${situation.sno}"/></td>
    </tr>    
    <tr>
        <td width="10%" class="tableleft">姓名</td>
        <td>${situation.sname}<input type="hidden" name="sname" value="${situation.sname}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">专业班级</td>
        <td>${situation.smajor}<input type="hidden" name="smajor" value="${situation.smajor}"/></td>
    </tr>
     <tr>
        <td width="10%" class="tableleft">就业选择</td>
        <td>
        	<c:if test="${situation.schoose == 1 }">待定</c:if> 
        	<c:if test="${situation.schoose == 2 }">就业</c:if>
        	<c:if test="${situation.schoose == 3 }">升学</c:if>
        </td>
        <input type="hidden" name="schoose" value="${situation.schoose}"/>
    </tr>
    <tr>
        <td width="10%" class="tableleft">公司/学校</td>
        <td>${situation.scompany}<input type="hidden" name="scompany" value="${situation.scompany}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">公司/学校联系人</td>
        <td>${situation.scompanyOwner}<input type="hidden" name="scompanyOwner" value="${situation.scompanyOwner}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">公司/学校联系方式</td>
        <td>${situation.slink}<input type="hidden" name="slink" value="${situation.slink}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">工作/专业</td>
        <td>${situation.sjob}<input type="hidden" name="sjob" value="${situation.sjob}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">是否对口</td>
        <td>
        	<c:if test="${situation.sright == 1 }">对口</c:if> 
        	<c:if test="${situation.sright == 2 }">不对口</c:if>
        </td><input type="hidden" name="sright" value="${situation.sright}"/>
    </tr>
    <tr>
        <td width="10%" class="tableleft">是否退回</td>
        <td>
        	<input type="radio" name="stag" value="1" checked/>退回&nbsp;&nbsp;&nbsp;
        	<input type="radio" name="stag" value="2"/>完成
    </tr>
    <tr>
        <td colspan="2">
			<center>
				<input name="save" id="save" type="submit" class="btn btn-primary" value="保存"/> &nbsp;&nbsp;
				<button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button>
			</center>
		</td>
    </tr>
</table>
</form>
</body>
</html>