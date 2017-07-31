<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../default/pubTop.jsp" %>
<!DOCTYPE>
<html  lang="zh">
<head>
<base href="<%= basePath %>">
<title>公共申报系统-角色</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="public/css/lib/bootstrap.min.css" />
<link rel="stylesheet" href="public/css/lib/jquery.gritter.css">
</head>
<body>
	<div class="container">
	<a class="btn btn-info" href="jsp/role/newRole">添加</a>
		<table class=table table-striped">
			<tr>
				<th>角色ID</th>
				<th>角色名</th>
				<th>操作</th>
			</tr>
		<c:forEach var="role" items="${roles }"> 
			<tr>
				<td>${role.id}</td>
				<td>${role.name}</td>
				<td>
				<a href="jsp/role/${role.id}/show" class="btn btn-primary">查看</a>
<%-- 				<button class="btn btn-danger" onclick="modal_fun('${role.id}')">删除</button> --%>
				</td>
			</tr>
		</c:forEach> 
		</table>
	</div>

	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"> 
		<div class="modal-dialog"> 
		    <div class="modal-content"> 
		        <div class="modal-header"> 
		        <input type="hidden" id="rId" name="roleId" value=""  />
		            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button> 
		            <h4 class="modal-title" id="myModalLabel"></h4> 
		        </div> 
		        <div class="modal-body"></div> 
		        <div class="modal-footer"> 
		            <button type="button" class="btn btn-primary">确定</button> 
		            <button type="button" class="btn btn-default" data-dismiss="modal">取消</button> 
		        </div> 
		    </div><!-- /.modal-content --> 
		</div><!-- /.modal --> 
	</div>
</body>
	<script src="public/javascript/lib/jquery-2.0.3.min.js"></script>
	<script src="public/javascript/lib/bootstrap.min.js" ></script>
<script>
function modal_fun(obj){
	var id = "";
		id = obj;
	$(".modal-title").empty();
	$(".modal-body").empty();
	$("#rId").val("");
	$(".modal-title").append("提示");
	$(".modal-body").append("您确定要删除该数据吗？");
	$("#rId").val(id);
	$('#myModal').modal('toggle'); 
}
</script>
</html>