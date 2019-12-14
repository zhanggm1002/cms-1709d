<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/public/css/bootstrap.min.css" rel="stylesheet">
<link href="/public/css/cms.css" rel="stylesheet">
<title>前台首页</title>
</head>
<body>
	<nav class="nav justify-content-end" style="background-color: #563d7c;">
	  <a class="nav-link disabled" href="#">CMS内容管理系统</a>
	  <a class="nav-link" href="http://127.0.0.1/" target="_blank">访问官网</a>
	  <a class="nav-link" href="#">管理员</a>
	  <a class="nav-link" href="/admin/user/logout">退出</a>
	</nav>
	<div class="container-fluid">
		<div class="row" style="margin-top: 15px;">
			  <div class="col-3">
			  	<!-- 左侧导航 -->
			    <div class="nav flex-column nav-pills">
				  <a class="nav-link active" href="javascript:;" url="/admin/welcome">后台首页</a>
				  <a class="nav-link" href="javascript:;" url="/admin/user">用户管理</a>
				  <a class="nav-link" href="javascript:;" url="/admin/article">文章管理</a>
				  <a class="nav-link" href="javascript:;" url="/admin/settings">系统设置</a>
				</div>
			  </div>
			  <div class="col-9">
			    <div class="tab-content" id="v-pills-tabContent">
				  
			  </div>
			</div>
		</div>
	</div>
<script type="text/javascript" src="/public/js/jquery.min.1.12.4.js"></script>
<script type="text/javascript" src="/public/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/public/js/ajaxfileupload.js"></script>
</body>
</html>