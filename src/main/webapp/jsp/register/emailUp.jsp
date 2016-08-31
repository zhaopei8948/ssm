<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../default/pubTop.jsp" %>
<!DOCTYPE>
<html  lang="zh">
<head>
<base href="<%= basePath %>">
<title>公共申报系统-修改邮箱</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- basic styles -->
		<link href="public/css/lib/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="public/css/lib/font-awesome.min.css" />

		<!--[if IE 7]>
		  <link rel="stylesheet" href="public/css/lib/font-awesome-ie7.min.css" />
		<![endif]-->

		<!-- page specific plugin styles -->


		<!-- ace styles -->

		<link rel="stylesheet" href="public/css/lib/ace.min.css" />
		<link rel="stylesheet" href="public/css/lib/ace-rtl.min.css" />
		<link rel="stylesheet" href="public/css/lib/ace-skins.min.css" />

		<!--[if lte IE 8]>
		  <link rel="stylesheet" href="public/css/lib/ace-ie.min.css" />
		<![endif]-->

		<!-- inline styles related to this page -->

		<!-- ace settings handler -->

		<script src="public/javascript/lib/ace-extra.min.js"></script>

		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

		<!--[if lt IE 9]>
		<script src="public/javascript/lib/html5shiv.js"></script>
		<script src="public/javascript/lib/respond.min.js"></script>
		<![endif]-->
</head>
<style>
.navbar {
    margin-left: 0;
    margin-right: 0;
    border: 0;
    -webkit-box-shadow: none;
    box-shadow: none;
    border-radius: 0;
    margin: 0;
    padding-left: 0;
    padding-right: 0;
    min-height: 45px;
    height:45px;
    position: relative;
    background: #438eb9;
}
.navbar-container {
    padding-left: 10px;
    padding-right: 0px; 
}
#main-container{
    margin-top: 30px;
}
.jumbotron{
    height: 500px
}
em{color: blue}
</style>

<body>
<div class="navbar navbar-default" id="navbar">
			<script type="text/javascript">
				try{ace.settings.check('navbar' , 'fixed')}catch(e){}
			</script>

			<div class="container" id="navbar-container">
				<div class="navbar-header pull-left">
					<a href="#" class="navbar-brand">
						<small>
							<i class="icon-leaf"></i>
							郑州综合保税区公共申报管理系统
						</small>
					</a>
				</div>
				<div class="navbar-header pull-right" role="navigation">
					<ul class="nav ace-nav">

						<li class="light-blue">
							<a data-toggle="dropdown" href="#" class="dropdown-toggle">
								<img class="nav-user-photo" src="public/image/avatars/user.jpg" alt="Jason's Photo" />
								<span class="user-info">
									<small>欢迎光临,</small>
									Jason
								</span>

								<i class="icon-caret-down"></i>
							</a>

							<ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
								<li>
									<a href="#">
										<i class="icon-cog"></i>
										设置
									</a>
								</li>

								<li>
									<a href="#">
										<i class="icon-user"></i>
										个人资料
									</a>
								</li>

								<li class="divider"></li>

								<li>
									<a href="#">
										<i class="icon-off"></i>
										退出
									</a>
								</li>
							</ul>
						</li>
					</ul><!-- /.ace-nav -->
				</div><!-- /.navbar-header -->
			</div><!-- /.container -->
		</div>
<div class="container" id="main-container">
      <div class="jumbotron">
        <div class="page-header">
          <h1>邮箱激活 <small>须知</small></h1>
        </div>
        <p>&nbsp;&nbsp;尊敬的用户，您好</p>
        <p>&nbsp;&nbsp;欢迎您成为本平台的用户，您的邮箱为  <em id="email">785113099@qsq.com</em>  为了更好地为您服务请点击下方按钮前往邮箱进行邮箱验证，完成账户激活，谢谢！</p>
        <p>
          <div clall="row" >
          <a class="col-lg-3 btn btn-lg btn-primary" href="javascript:void(0);" id="gotoemail" target="_blank">前往邮箱激活账户 »</a>
          <div class="col-sm-7 col-lg-offset-2" id="email-error"></div>
          </div>
        </p>
        <br />
          <br />          <div class="form-group">
						<div class="col-lg-8 col-lg-offset-1">
							<p><small>没有收到邮件您可以查看一下帮助：</small></p>
							<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<small>1.查看您的邮件垃圾内(个别邮箱会把该邮件看作垃圾邮件)</small></p>
							<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<small>2.请检查邮箱地址是否正确，您可以  <em><a href="jsp/register/emailUp">返回</a></em> 修改您的邮箱</small></p>
							<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<small>3.若仍未收到确认，请尝试  >> <button type="button" class="btn btn-xs">发送</button></small></p>
						</div>
					</div>
      </div>

    </div>

		<!-- basic scripts -->

		<!--[if !IE]> -->

		<script type="text/javascript">
			window.jQuery || document.write("<script src='public/javascript/lib/jquery-2.0.3.min.js'>"+"<"+"script>");
		</script>

		<!-- <![endif]-->

		<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='public/javascript/lib/jquery-1.10.2.min.js'>"+"<"+"script>");
</script>
<![endif]-->
	<script type="text/javascript">
			if("ontouchend" in document) document.write("<script src='public/javascript/lib/jquery.mobile.custom.min.js'>"+"<"+"script>");
		</script>
		<script src="public/javascript/lib/bootstrap.min.js"></script>
		<script src="public/javascript/lib/typeahead-bs2.min.js"></script>

		<!-- page specific plugin scripts -->

		<!--[if lte IE 8]>
		  <script src="public/javascript/lib/excanvas.min.js"></script>
		<![endif]-->
</body>
</html>