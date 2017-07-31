<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../default/pubTop.jsp" %>
<!DOCTYPE>
<html  lang="zh">
<head>
<base href="<%= basePath %>">
<title>公共申报系统-创建角色</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="public/css/lib/bootstrap.min.css" />
<link rel="stylesheet" href="public/css/lib/ace.min.css" />
</head>
<style>
body {
    padding-bottom: 0;
    background-color: white; 
    min-height: 100%;
    font-family: 'Open Sans';
    font-size: 13px;
    color: #393939;
    line-height: 1.5;
}
 .form-actions { 
     display: block; 
     background-color: #f5f5f5; 
     border-top: 1px solid #e5e5e5; 
     margin-bottom: 20px; 
     margin-top: 70px; 
     padding: 19px 0px 20px 180px; 
 } 
</style>
<body>
	<div class="container">
		<div class="page-header">
					<h1>添加角色</h1>
		</div>
		<form action="jsp/addRole" method="post" class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 角色名 </label>
				<div class="col-sm-9">
					<input type="text" id="form-field-1" name="name" required placeholder="角色名" class="col-xs-10 col-sm-5">
				</div>
		</div>

		<div class="clearfix form-actions">
			<div class="col-md-offset-3 col-md-9">
				<button class="btn btn-info" type="submit">
					<i class="icon-ok bigger-110"></i>
						提交
				</button>&nbsp; &nbsp; &nbsp;
				<button class="btn" type="reset">
					<i class="icon-undo bigger-110"></i>
						重置
					</button>
			</div>
		</div>
		</form>
	</div>
</body>
	<script src="public/javascript/lib/jquery-2.0.3.min.js"></script>
	<script src="public/javascript/lib/bootstrap.min.js" ></script>
</html>