<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>公共申报系统-注册</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../../public/css/lib/bootstrap.min.css" />
<link rel="stylesheet" href="../../public/css/lib/formValidation.css"/>
</head>
<body>
<!-- head -->
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
        <li><a href="#">Link</a></li>
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
					<h2>Sign up</h2>
				</div>

				<form id="defaultForm" method="post" class="form-horizontal" action="/">
					<div class="form-group">
						<label class="col-lg-3 control-label">海关备案代码</label>
						<div class="col-lg-5">
							<input type="text" class="form-control" name="username"
								placeholder="输入海关备案代码" required
								data-fv-notempty-message="海关备案代码不能为空！"
								data-fv-stringlength="true" data-fv-stringlength-min="10"
								data-fv-stringlength-max="10" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-lg-3 control-label">手机</label>
						<div class="col-lg-5">
							<input type="text" class="form-control" name="telephone"
							    required
								data-fv-notempty-message="您的手机号不能为空！"
								data-fv-phone-country="CN"
								data-fv-phone-message="请输入正确的手机号码！"
			
								 />
								 <!-- ata-fv-remote="true" data-fv-remote-url="" -->	
						</div>
					</div>

					<div class="form-group">
						<label class="col-lg-3 control-label">电子邮箱</label>
						<div class="col-lg-5">
							<input class="form-control" name="email" type="email"
								data-fv-emailaddress-message="请输入正确的邮箱格式！" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-lg-3 control-label">密码</label>
						<div class="col-lg-5">
							<input type="password" class="form-control" name="password"
								required
								data-fv-notempty-message="密码不能为空！"
								data-fv-different="true" data-fv-different-field="username"
								data-fv-stringlength="true" data-fv-stringlength-min="6"
								data-fv-stringlength-max="10"
								data-fv-different-message="密码不能和海关备案代码一样！" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-lg-3 control-label">确认密码</label>
						<div class="col-lg-5">
							<input type="password" class="form-control"
								name="confirmPassword" required
								data-fv-notempty-message="确认密码不能为空！"
								data-fv-identical="true" data-fv-identical-field="password"
								data-fv-identical-message="您两个输入的密码不一致！" />
						</div>
					</div>


					<div class="form-group">
						<div class="col-lg-12 col-lg-offset-3">
							<button type="submit" class="btn btn-primary btn-lg">注&nbsp;&nbsp;&nbsp;&nbsp;册</button>
						</div>
					</div>
				</form>
			</div>
			</section>
			<!-- :form -->
		</div>
	</div>
	<script src="../../public/javascript/lib/jquery-2.0.3.min.js"></script>
    <script src="../../public/javascript/lib/bootstrap.min.js" ></script>
	<script type="text/javascript" src="../../public/javascript/lib/formValidation.js"></script>
		<script type="text/javascript" src="../../public/javascript/lib/validation/bootstrap.min.js"></script>
    <script type="text/javascript" src="../../public/javascript/lib/language/zh_CN.js"></script>
    <script type="text/javascript">
	$(document).ready(function() {
        $('#defaultForm').formValidation();
    });
	</script>
</body>
</html>