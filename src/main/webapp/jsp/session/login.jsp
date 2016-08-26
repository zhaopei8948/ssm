<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../default/pubTop.jsp" %>
<!DOCTYPE>
<html>
<head>
<base href="<%= basePath %>">
<title>公共申报系统-登录</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="public/css/lib/bootstrap.min.css" />
<link rel="stylesheet" href="public/css/lib/formValidation.css"/>
</head>
<body>
<nav class="navbar navbar-default">
  <div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Brand</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
        <li><a href="#">Link</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">One more separated link</a></li>
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="sp/register/signup">注册</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<!-- body -->
	<div class="container">
		<div class="row">
			<!-- form: -->
			<section>
			<div class="col-lg-8 col-lg-offset-2">
				<div class="page-header">
					<h2>Login</h2>
				</div>
				<%  %>
					<div class="alert alert-warning alert-dismissible" role="alert">
						<button type="button" class="close" data-dismiss="alert"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<strong>警告!</strong> ${ userMap.error }
					</div>
			     <%  %>		
					<form action="jsp/createLogin" id="defaultForm" method="post" class="form-horizontal" >
				<center></center>
					<div class="form-group">
						<label class="col-lg-3 control-label">用户名</label>
						<div class="col-lg-5">
							<input type="text" class="form-control" name="username" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-lg-3 control-label">密码</label>
						<div class="col-lg-5">
							<input type="password" class="form-control" name="password" />
						</div>
					</div>

					<div class="form-group">
						<div class="col-lg-12 col-lg-offset-3">
							<button type="submit" class="btn btn-primary btn-lg">登&nbsp;&nbsp;&nbsp;&nbsp;录</button>
						</div>
					</div>
				</form>
			</div>
			</section>
			<!-- :form -->
		</div>
	</div>
<!-- body -->	
	<script src="public/javascript/lib/jquery-2.0.3.min.js"></script>
    <script src="public/javascript/lib/bootstrap.min.js" ></script>
	<script type="text/javascript" src="public/javascript/lib/formValidation.js"></script>
	<script type="text/javascript" src="public/javascript/lib/validation/bootstrap.min.js"></script>
    <script type="text/javascript" src="public/javascript/lib/language/zh_CN.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
        $('#defaultForm').bootstrapValidator({
            message: '不能为空！',
            feedbackIcons: {
            	/*  valid: 'glyphicon glyphicon-ok',
                 invalid: 'glyphicon glyphicon-remove',
                 validating: 'glyphicon glyphicon-refresh' */
            },
            fields: {
                username: {
                    message: '用户名(海关备案代码)不能为空！',
                    validators: {
                        notEmpty: {
                            message: '用户名(海关备案代码)不能为空！'
                        },
                        stringLength: {
                            min: 10,
                            max: 10,
                            message: '海关备案代码为10位！'
                        },
                        regexp: {
                            regexp: /^[a-zA-Z0-9_]+$/,
                            message: '您输入的海关备案代码格式有错！'
                        }
                    }
                },
                password:{
                	validators:{
                		notEmpty:{
                			message: '密码不能为空'
                		},
                		stringLength: {
                            min: 6,
                            max: 10,
                            message: '密码为6-10位！'
                        }
                	}
                }
                
            }
        });
        
        
    });
	</script>
	
</body>
</html>