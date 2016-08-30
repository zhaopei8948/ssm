<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../default/pubTop.jsp" %>
<!DOCTYPE>
<html  lang="zh">
<head>
<base href="<%=basePath%>">
<title>公共申报系统-注册</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="public/css/lib/bootstrap.min.css" />
<link rel="stylesheet" href="public/css/lib/formValidation.css"/>
<link rel="stylesheet" type="text/css" href="public/css/lib/login.css" />
<link rel="stylesheet" type="text/css" href="public/css/lib/login-style.css" />
<link rel="stylesheet" type="text/css" href="public/css/lib/login-diy.css" />
</head>
<body>
<div class="container">
<!-- 	<div class="alert alert-warning alert-dismissible" role="alert"> -->
<!-- 						<button type="button" class="close" data-dismiss="alert" -->
<!-- 							aria-label="Close"> -->
<!-- 							<span aria-hidden="true">&times;</span> -->
<!-- 						</button> -->
<%-- 						<strong>警告!</strong> ${ userMap.error } --%>
<!-- 					</div> -->
    
       <header>
             <h1>公共申报系统--<span>电商的福音</span></h1>
				<nav class="codrops-demos">
					<span>点击 <strong>"注册"</strong> 加入我们</span>
				</nav>
      </header>
    <section>				
        <div id="container_demo" >
            <a class="hiddenanchor" id="toregister"></a>
            <a class="hiddenanchor" id="tologin"></a>
            <div id="wrapper">
                <div id="login" >
                   <form action="jsp/addUser" id="defaultForm" method="post" class="form-horizontal" >
                 
                        <h1><strong>注册</strong></h1> 
                       
                    <div class="form-group">
						<label class="col-lg-4 control-label">海关备案代码</label>
						<div class="col-lg-8">
							<input type="text" name="username" />
						</div>
					</div>
					
					
					<div class="form-group">
						<label class="col-lg-4 control-label">手机</label>
						<div class="col-lg-8">
							<input type="text"  name="telephone"/>
								 <!-- ata-fv-remote="true" data-fv-remote-url="" -->	
						</div>
					</div>

					<div class="form-group">
						<label class="col-lg-4 control-label">电子邮箱</label>
						<div class="col-lg-8">
							<input  name="email" type="email" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-lg-4 control-label">密码</label>
						<div class="col-lg-8">
							<input type="password"  name="password" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-lg-4 control-label">确认密码</label>
						<div class="col-lg-8">
							<input type="password"  name="confirmPassword"  />
						</div>
					</div>

					<div class="form-group">
						<div class="col-lg-12 col-lg-offset-8">
							<button type="submit" class="btn btn-primary btn-lg">注&nbsp;&nbsp;&nbsp;&nbsp;册</button>
						</div>
					</div>
					<p class="change_link">已有账号 ?
						<a href="jsp/session/login" class="to_register">登录</a>
					</p>
                   </form>
                </div>

            </div>
        </div>  
    </section>
</div>
	
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
                email: {
                    validators: {
                        notEmpty: {
                            message: '您的电子邮箱不能为空！'
                        },
                        emailAddress: {
                            message: '请输入正确的邮箱格式，以便更好地注册！'
                        }
                    }
                },
                telephone:{
                	validators: {
                        notEmpty: {
                            message: '您的手机号不能为空！'
                        },
                        phone: {
                            message: '请输入正确的手机号格式！',
                            counry: 'CN'
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
                        },
                        different:{
                        	field: "username",
                       		message: '密码不能和海关备案代码一样！'
                        }
                	}
                },
                confirmPassword:{
                	validators:{
                		notEmpty:{
                			message: '确认密码不能为空'
                		},
                		stringLength: {
                            min: 6,
                            max: 10,
                            message: '确认密码为6-10位！'
                        },
                        identical:{
                        	field: "password",
                        	message: "两次输入密码不一致！"
                        }
                	}
                },
            }
        });
        
        
    });
	</script>
</body>
</html>