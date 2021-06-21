  <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path=request.getScheme()+"://"+request.getServerName()+":"+
	request.getServerPort()+request.getContextPath()+"/";
	pageContext.setAttribute("path", path);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<!-- TITLE -->
<title>Home</title>

<!-- Main StyleSheet -->
<link href="${pageContext.request.contextPath}/user_vision/style.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/user_vision/style-responsive.css" rel="stylesheet" type="text/css" media="screen" />
<link href="${pageContext.request.contextPath}/user_vision/css/font-awesome.css" rel="stylesheet" type="text/css" />
<!--<link rel="stylesheet" href="css/bootstrap.min.css">-->
<link rel="stylesheet" href="${pageContext.request.contextPath}/user_vision/css/libs/animate.css">


<!-- bxSlider CSS file -->
<link href="${pageContext.request.contextPath}/user_vision/css/jquery.bxslider.css" rel="stylesheet" />


<!-- LayerSlider stylesheet -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/user_vision/layerslider/css/layerslider.css" type="text/css">
<!-- External libraries: jQuery & GreenSock -->
<script src="${pageContext.request.contextPath}/user_vision/layerslider/js/jquery.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/user_vision/layerslider/js/greensock.js" type="text/javascript"></script>
<!-- LayerSlider script files -->
<script src="${pageContext.request.contextPath}/user_vision/layerslider/js/layerslider.transitions.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/user_vision/layerslider/js/layerslider.kreaturamedia.jquery.js" type="text/javascript"></script>

<script src="${pageContext.request.contextPath}/user_vision/js/bootstrap.min.js" type="text/javascript"></script>


<!-- bxSlider Javascript file -->
<script src="${pageContext.request.contextPath}/user_vision/js/jquery.bxslider.js"></script>
<script>
$(document).ready(function(){
$('.bxslider').bxSlider({
						
						pager: false,
						controls: true,
						auto: true
						
						
						});
});
</script>



<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/user_vision/lightbox/jquery.fancybox.css" media="screen" />
<script src="${pageContext.request.contextPath}/user_vision/lightbox/jquery.fancybox.js"></script>
<script type="text/javascript">
		$(document).ready(function() {
								   
			$('.fancybox').fancybox();

		});
</script>


<!-- GOTO TOP JQUERY -->
<script type="text/javascript">
$(function() {
	$(window).scroll(function() {
		if($(this).scrollTop() != 0) {
			$('#gotop').fadeIn();	
		} else {
			$('#gotop').fadeOut();
		}
	});
 
	$('#gotop').click(function() {
		$('body,html').animate({scrollTop:0},800);
	});	
});
</script>
	


<!-- HEADER JQUERY -->
<script type="text/javascript">
$(function() {
	$(window).scroll(function() {
		if($(this).scrollTop() >= 200) {
			$('.header').addClass("header_fix");	
		} else {
		   $('.header').removeClass("header_fix");
		}
	});	
});
</script>


<script type="text/javascript">

if($(window).width() <= 900){
$(document).ready(function() {
							
							
							
			$('.mobile .title').click(function() {
										
										$(this).next("ul").slideToggle();
										$(this).toggleClass("minus");
										
										});
			
			

		});

}
</script>
	
   <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Css/style.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/Js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/Js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/Js/ckform.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/Js/common.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/Js/ckeditor/ckeditor.js"></script>
 

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
<div class="header">
<div class="container">
			<a class="logo"><img src="${pageContext.request.contextPath}/user_vision/images/logo1.png" alt="" /></a>
			<a class="logo"><img src="${pageContext.request.contextPath}/user_vision/images/logo2.png" alt="" /></a>
			
			<div class="nav mobile">
			<div class="title">Menu <span class="fa "></span></div>
			<ul>
			<li><a href="${pageContext.request.contextPath}/notice/list_student">首页</a></li>
			<li><a href="${pageContext.request.contextPath}/User/edit_us/${loginUsers.uid}">个人信息</a></li>
			<li><a href="${pageContext.request.contextPath}/situation/edit_stu/${loginUsers.username}">就业信息</a></li>
			<li><a href="${pageContext.request.contextPath}/company/list_stu">招聘会</a></li>
			<li><a href="${pageContext.request.contextPath}/login.jsp">退出</a></li>
			</ul>
			</div>

</div>
</div>




<div class="wrapper">
<div class="slider_main">
<div id="full-slider-wrapper">
<div id="layerslider" style="width:100%;height:473px;">

<form action="${pageContext.request.contextPath}/situation/add" method="post" class="definewidth m20" enctype="multipart/form-data">

<table class="table table-bordered table-hover definewidth m10">
    <tr>
        <td width="10%" class="tableleft">学号</td>
        <td>${loginUsers.username}<input type="hidden" name="sno" value="${loginUsers.username}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">姓名</td>
        <td>${loginUsers.name}<input type="hidden" name="sname" value="${loginUsers.name}"/></td>
    </tr>
     <tr>
        <td width="10%" class="tableleft">专业班级</td>
        <td><input type="text" name="smajor" value=""/></td>
    </tr>
    
    <tr>
        <td width="10%" class="tableleft">就业选择</td>
        <td>
        	<select name="schoose">
        		<option value="1">暂未打算</option>
        		<option value="2">就业</option>
        		<option value="3">升学</option>        		
        	</select>
        </td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">公司名称/学校</td>
        <td><input type="text" name="scompany" value=""/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">公司/招生联系人</td>
        <td><input type="text" name="scompanyOwner" value=""/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">公司/招生电话</td>
        <td><input type="text" name="slink" value=""/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">工作/专业名称</td>
        <td><input type="text" name="sjob" value=""/></td>
    </tr>
   <tr>
        <td width="10%" class="tableleft">是否对口</td>
        <td>
        	<select name="sright">
        		<option value="1">对口</option>
        		<option value="2">不对口</option>        		
        	</select>
        </td>
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
</div>
</div> 
</div>


</div><!--wrapper-->


<script>
	jQuery("#layerslider").layerSlider({
		responsive: false,
		responsiveUnder: 1100,
		layersContainer: 1100,
		skin: 'fullwidth',
		hoverPrevNext: false,
		skinsPath: 'layerslider/skins/'
	});


</script>

<script src="${pageContext.request.contextPath}/user_vision/js/wow.js"></script>
<script>
wow = new WOW(
  {
	animateClass: 'animated',
	offset:       100
  }
);
wow.init();
document.getElementById('moar').onclick = function() {
  var section = document.createElement('section');
  section.className = 'section--purple wow fadeInDown';
  this.parentNode.insertBefore(section, this);
};
</script>

<script type="text/javascript">
$(function() {
$('a[href*=#]:not([href=#])').click(function() {
if (location.pathname.replace(/^\//,'') == this.pathname.replace(/^\//,'') && location.hostname == this.hostname) {
var target = $(this.hash);
target = target.length ? target : $('[name=' + this.hash.slice(1) +']');
if (target.length) {
$('html,body').animate({
scrollTop: target.offset().top - 132
}, 2000);
return false;
}
}
});
});
</script>


<script type="text/javascript">


$(document).ready(function() {

if($(window).width() <= 1200){


$(function() {
$('a[href*=#]:not([href=#])').click(function() {
if (location.pathname.replace(/^\//,'') == this.pathname.replace(/^\//,'') && location.hostname == this.hostname) {
var target = $(this.hash);
target = target.length ? target : $('[name=' + this.hash.slice(1) +']');
if (target.length) {
$('html,body').animate({
scrollTop: target.offset().top - 132
}, 2000);
return false;
}
}
});
});



}

});


</script> 
	 


</body>
</html>