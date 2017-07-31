<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../default/pubTop.jsp" %>
<!DOCTYPE>
<html  lang="zh">
<head>
<base href="<%= basePath %>">
<title>公共申报系统-登录</title>
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
                   <form action="jsp/createLogin" id="loginForm" method="post" class="form-horizontal" >
                 
                        <h1><strong>登录</strong></h1> 
                       
                       <div class="form-group">
						<label class="col-lg-3 control-label">用户名</label>
						<div class="col-lg-8">
							<input type="text" name="username" placeholder="请输入用户名：海关备案代码" />
						</div>
					</div>
					 <div class="form-group">
						<label class="col-lg-3 control-label" >密&nbsp;&nbsp;码</label>
						<div class="col-lg-8">
							<input type="password"  name="password" placeholder="请输入密码"/>
						</div>
					</div>

                        
                        <p class="keeplogin"> 
	                    <input type="checkbox" name="loginkeeping" id="loginkeeping" value="loginkeeping" /> 
                        <label for="loginkeeping">记住我 ！</label>
                        </p>
                       <div class="form-group">
						<div class="col-lg-12 col-lg-offset-7">
							<button type="submit" class="btn btn-primary btn-lg">登&nbsp;&nbsp;&nbsp;&nbsp;录</button>
						</div>
					</div>
                       </form>
                        <p class="change_link">还没有账号 ?
	                    <a href="jsp/register/signup" class="to_register">注册一个</a>
                       </p>
                    
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
        $('#loginForm').bootstrapValidator({
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