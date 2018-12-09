<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!DOCTYPE html >
<html  xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta charset="utf-8"  content=""/>
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<title>设备管理系统登录页</title>
	<link rel="stylesheet" href="/devicesystem/static/layui/css/layui.css">
	<link rel="stylesheet" href="/devicesystem/static/css/login.css">
	<link rel="stylesheet" href="/devicesystem/static/css/flexboxgrid.min.css">
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
	<script src="/devicesystem/static/layui/layui.js" type="text/javascript"></script>
	<style type="text/css">
		a:hover{color: rgba(0, 0, 255, 0.67)
		}
	</style>

</head>

<body class="login" onload="fnonload();">
	<div class="login-box">
		<div class="login-logo">
			<text style="font-size:35px;">
				欢迎登录设备管理系统
			</text>
		</div>
		<div class="login-box-body">
			<p class="login-box-msg">账号密码登陆</p>
			<form id="loginForm" class="layui-form" method="post" action="/devicesystem/user/login">
				<div class="form-group has-feedback">
					<span class="layui-icon form-control-feedback">&#xe612;</span>
					<input name="loginName" id="loginName" autofocus required lay-verify="required"
						class="form-control required" value="" placeholder="登录账号">
				</div>
				<div class="form-group has-feedback" style="margin-bottom:10px;">
					<span class="layui-icon form-control-feedback">&#xe673;</span>
					<input type="password" name="password" id="password" required lay-verify="required"  
						class="form-control required" value="" placeholder="密码">
				</div>

				<div class="row" style="line-height:30px;padding:0 20px;">
					<div class="col-lg-6">
						<div class="checkbox">
							<input type="checkbox" name="sla" value="1" lay-skin="primary" checked title="七天内自动登录">
						</div>
					</div>
				</div>

				<div class="row" style="margin-bottom:20px;padding:0 20px;">
					<div class="col-md-6"></div>
				</div>
				<div class="row" style="margin-bottom:20px;padding:0 20px;">

					<!-- /.col -->
					<div class="col-xs-12">
						<button class="btn btn-block btn-primary btn-lg" type="submit">立即登录</button>
					</div>
					<!-- /.col -->

						<div class="col-xs-12">
							<p class="btm-text">还没有账号？<a  href="/devicesystem/user/register">注册新账号</a></p>
						</div>
					<div class="col-xs-12">
						<p class="btm-text" style="color: red">${message}</p>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>

</html>