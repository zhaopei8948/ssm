<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../default/pubTop.jsp"%>
<!DOCTYPE>
<html lang="zh">
<head>
<base href="<%= basePath %>">
<title>公共申报系统-角色</title>
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
</style>
<body>

	<div class="container">
		<div class="col-xs-12 col-sm-9">
			<div class="page-header">
				<h1>角色信息</h1>
			</div>
			<div class="space-12"></div>

			<div class="profile-user-info profile-user-info-striped">
				<div class="profile-info-row">
					<div class="profile-info-name">Id</div>

					<div class="profile-info-value">
						<span class="editable editable-click" id="username">${role.id }</span>
					</div>
				</div>

				<div class="profile-info-row">
					<div class="profile-info-name">角色名称</div>

					<div class="profile-info-value">
						<i class="icon-map-marker light-orange bigger-110"></i> <span
							class="editable editable-click" id="country">${role.name }</span>
					</div>
				</div>

				<div class="profile-info-row">
					<div class="profile-info-name">跟新时间</div>

					<div class="profile-info-value">
						<span class="editable editable-click" id="age">${role.updateTime }</span>
					</div>
				</div>

				<div class="profile-info-row">
					<div class="profile-info-name">创建时间</div>

					<div class="profile-info-value">
						<span class="editable editable-click" id="age">${role.createTime }</span>
					</div>
				</div>

			
			</div>

			<div class="space-20"></div>

		
			<div class="hr hr2 hr-double"></div>

			<div class="space-6"></div>

			<div class="center">
			<a href="jsp/role/index" class="btn btn-sm btn-default"> <i
					class="icon-rss bigger-150 middle"></i> <span class="bigger-110"> << 返回 </span> <i class="icon-on-right icon-arrow-right"></i>
				</a>
				<a href="#" class="btn btn-sm btn-primary"> <i
					class="icon-rss bigger-150 middle"></i> <span class="bigger-110">修改 >></span> <i class="icon-on-right icon-arrow-right"></i>
				</a>
			</div>
		</div>
	</div>

</body>
</html>