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
<script src="${pageContext.request.contextPath}/user_vision/js/jquery.dropdown.js" type="text/javascript"></script>

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
$('.dropdown-toggle').dropdown()
if($(window).width() <= 900){
$(document).ready(function() {
							
							
							
			$('.mobile .title').click(function() {
										
										$(this).next("ul").slideToggle();
										$(this).toggleClass("minus");
										
										});
			
			

		});

}
</script>	
</head>
<body>
<div class="header">
<div class="container">
			<a class="logo"><img src="${pageContext.request.contextPath}/user_vision/images/logo1.png" alt="" /></a>
			<a class="logo"><img src="${pageContext.request.contextPath}/user_vision/images/logo2.png" alt="" /></a>
			
			<div class="nav mobile">
			<div class="title">Menu <span class="fa "></span></div>
			
			<ul id="con_ul" class="cleanfix">
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

					<c:forEach items="${page.list}" var="usr">
						<div class="ls-slide" data-ls="transition2d:1;timeshift:-1000;">
						<img src="${pageContext.request.contextPath}/user_vision/images/slider/slide-bg.jpg" class="ls-bg" alt="Slide background"/>
						
						
						<div class="ls-l videopreview" style="top:87px;left:0px;white-space: nowrap;" data-ls="offsetxin:-200;durationin:2000;offsetxout:-200;">
						<!--<iframe src="http://player.vimeo.com/video/34134308?portrait=0&amp;color=ff9933&autoplay=1" width="443" height="290" frameborder="0" webkitallowfullscreen mozallowfullscreen allowfullscreen></iframe>-->
						<img src="${pageContext.request.contextPath}/user_vision/images/slider/slide_bg.png" alt="" />
						</div>
						
						
						<div class="ls-l" style="top:140px;left:638px;white-space: nowrap;" data-ls="offsetxin:0;delayin:1000;easingin:easeInOutQuart;scalexin:0.7;scaleyin:0.7;offsetxout:-800;durationout:1000;">
						<h2 class="l1">${usr.nname}</h2>
						</div>
						
						<div class="ls-l" style="top:200px;left:583px;white-space: nowrap;" data-ls="offsetxin:0;delayin:1000;easingin:easeInOutQuart;scalexin:0.7;scaleyin:0.7;offsetxout:-800;durationout:1000;">
						<h2 class="l2">${usr.content}</h2>
						</div>
						
						<div class="ls-l" style="top:300px;left:583px;white-space: nowrap;" data-ls="offsetxin:0;delayin:1000;easingin:easeInOutQuart;scalexin:0.7;scaleyin:0.7;offsetxout:-800;durationout:1000;">
						<h2 class="l2">${usr.ntime}</h2>
						</div>

						</div><!--FIRST SLIDE-->
					</c:forEach>
						
   
	
</div>
</div> 
</div>

<div class="common_section">
<div class="container">

	
			<a class="footer_logo"><img src="${pageContext.request.contextPath}/user_vision/images/logo1.png" alt="" /></a>
		   
			<div class="copyright">Copyright &copy; 2021.Shanshan Wei All rights reserved.</div>                    

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