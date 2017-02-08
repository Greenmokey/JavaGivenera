<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=utf-8" %>>
<%@ page language="java" import="java.util.*" %>>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="keyword" content="">
<meta name="description" content="">
<link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/givenera.css"/>" rel="stylesheet">
<!-- HTML5 Shim 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
<!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
<!--[if lt IE 9]>
 <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
 <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
<![endif]-->
<script src="<c:url value="/resources/js/jquery.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>

</head>
<body>
<div class="container mb20">
	<div class="row">
        <div class="col-lg-12 head">
			<h4>来自Givenera的分享</h4>
        </div>
    </div>
	<div class="mt20 head-t">
		<p>保定<span>2017-01-13</span></p>
	</div>
	<div class="row">
        <div class="col-xs-4">
        	<img src="<c:url value="/resources/images/t1.png"/>" class="img-circle" width="50" height="50">
       
			<p class="mt5 ml">${user1.userName}</p>
		</div>
		<div class="col-xs-4">
			<div class="text-center mt15 hel">Helped</div>
		</div>
		<div class="col-xs-4">
			<div class="right">
				<img src="<c:url value="/resources/images/t2.png"/>" class="img-circle" width="50" height="50">

				<p class="mt5">${user2.userName}</p>
			</div>
        </div>
    </div>
	<div class="row">
		<div class="col-lg-12 text-center mt5">
			<img src="<c:url value="/resources/images/banner.png"/>" class="img-responsive center-block wid" alt="Cinque Terre">
		</div>
	</div>
	<div class="row">
		<div class="col-lg-12 mt10 ft12">
			${content.description}
		</div>
	</div>
</div>

<div class="container bg-image">
	<div style="height:25px"></div>
	<div class="row">
		<div class="col-lg-12 mt10 bts">
			Givenera:让我们一起努力实现“让助人为乐在全世界成为一种生活方式的梦想！“，相信星星之火必将燎原！
		</div>
	</div>
	<div class="row">
		<div class="col-lg-12 mt20 mb10">
			<button class="btn btn-info btn-md btn-block" type="submit" onclick="">下载安卓版Givenera  &nbsp;&nbsp;&nbsp;立即使用</button> 							
		</div>
		<div class="col-lg-12 mt10 mb20">
			<button class="btn btn-info btn-md btn-block" type="submit" onclick="">下载苹果版Givenera  &nbsp;&nbsp;&nbsp;立即使用</button> 							
		</div>
	</div>
	<div style="height:30px"></div>
</div>
</body>
</html>
