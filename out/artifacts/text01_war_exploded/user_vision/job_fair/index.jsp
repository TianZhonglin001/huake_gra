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
    
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Css/style.css" />

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
			<li><a href="${pageContext.request.contextPath}/notice/list_student">??????</a></li>
			<li><a href="${pageContext.request.contextPath}/User/edit_us/${loginUsers.uid}">????????????</a></li>
			<li><a href="${pageContext.request.contextPath}/user_vision/information/add.jsp">??????????????????</a></li>
			<li><a href="${pageContext.request.contextPath}/company/list_stu">?????????</a></li>
			<li><a href="${pageContext.request.contextPath}/login.jsp">??????</a></li>
			</ul>
			</div>

</div>
</div>




<div class="wrapper">
<div class="slider_main">
<div id="full-slider-wrapper">
<div id="layerslider" style="width:100%;height:473px;">

<form action="${pageContext.request.contextPath}/company/list_stu" method="post" class="definewidth m20">
<table class="table table-bordered table-hover definewidth m10">
	<tr>
	  <td width="10%" class="tableleft">???????????????</td>
	  <td><input type="text" id="ename" name="ename" value="${ename}"/></td>		
	  <td width="10%" class="tableleft">???????????????</td>
	  <td>
	    <select name="type" id="type">
	        <option value="0" >==?????????==</option>
	        <option value="1" <c:if test="${type == 1 }">selected='selected'</c:if>>???????????????</option>
	        <option value="2" <c:if test="${type == 2 }">selected='selected'</c:if>>?????????</option>
	        <option value="3" <c:if test="${type == 3 }">selected='selected'</c:if>>?????????</option>
	        <option value="4" <c:if test="${type == 4 }">selected='selected'</c:if>>?????????</option>
	        <option value="5" <c:if test="${type == 5 }">selected='selected'</c:if>>?????????</option>
        </select>
	  </td>
	</tr>
	<tr>
	  <td colspan="6">
	    <center>
			<input id="find" name="find" type="submit" class="btn btn-primary" value="??????"/>
		</center>
	  </td>
	 </tr>
</table>
</form>
   
<table class="table table-bordered table-hover definewidth m10" >
   <thead>
    <tr>
        <th>????????????</th>
        <th>????????????</th>
        <th>????????????</th>
        <th>??????</th>
        <th>??????</th>
    </tr>
    </thead>
    <tbody>
		<c:forEach items="${page.list}" var="usr">
        <tr>
				<td>${usr.ename}</td> 
				<td>
		        <c:if test="${usr.type == 1 }">???????????????</c:if>
		        <c:if test="${usr.type == 2 }">?????????</c:if>
		        <c:if test="${usr.type == 3 }">?????????</c:if>
		        <c:if test="${usr.type == 4 }">?????????</c:if>
		        <c:if test="${usr.type == 5 }">?????????</c:if>
		        </td> 
		        <td>${usr.jobname}</td> 
		        <td>${usr.salary}</td> 
				<td><a href="${pageContext.request.contextPath}/company/edit_stu/${usr.eno}">??????</a>
					</td>
			</tr>
		</c:forEach>
	 </tbody>
  </table>
  
  <table class="table table-bordered table-hover definewidth m10" >
  	<tr>
  		<th colspan="5">  <div class="inline pull-right page">
          <a href="${pageContext.request.contextPath}/company/list?pageNum=1${queryResult}" >??????</a> 
	          <a href="${pageContext.request.contextPath}/company/list?pageNum=${page.pageNum-1}${queryResult}">?????????</a>     
	          <a href="${pageContext.request.contextPath}/company/list?pageNum=${page.pageNum+1}${queryResult}" >?????????</a> 
	          <a href="${pageContext.request.contextPath}/company/list?pageNum=${page.pages}${queryResult}" >??????</a>
          
		  &nbsp;&nbsp;&nbsp;???<span class='current'>${page.total}</span>?????????
		  <span class='current'> ${page.pageNum} / ${page.pages} </span>???
		  
		  </div>
		 </th>
	</tr>
  </table>  
</body>
	
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