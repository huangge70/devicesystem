<%@ page import="java.net.InetAddress" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!DOCTYPE html >
<html>

<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta http-equiv="Cache-Control" content="no-siteapp" />
	<meta name="viewport"
		content="width=device-width, maximum-scale=1.0, initial-scale=1.0,initial-scale=1.0,user-scalable=no" />
	<meta name="apple-mobile-web-app-capable" content="yes" />
	<title>设备管理系统注册页面</title>
	<link rel="stylesheet" href="/devicesystem/static/layui/css/layui.css">
	<link rel="stylesheet" href="/devicesystem/static/css/login.css">
	<script src="/devicesystem/static/layui/layui.js" type="text/javascript"></script>
	<script src="/devicesystem/static/js/jquery-1.10.2.min.js"></script>
	<style type="text/css">
		a:hover{
			color: rgba(0, 0, 255, 0.67)
		}
	</style>
</head>

<body class="login">
	<div class="login-box">
		<div class="login-logo">
			<text style="font-size:35px;">
				欢迎注册设备管理系统
			</text>
		</div>
		<div class="login-box-body">
			<p class="login-box-msg">注册账号</p>
			<form id="loginForm" action="/devicesystem/user/register1" class="layui-form" method="post">
				<div class="form-group has-feedback" style="margin-bottom:10px;width: 500px">
					<span class="layui-icon form-control-feedback">&#xe612;</span>
					<input name="loginName" id="loginName" autofocus required lay-verify="required"
						class=" form-control required" style="display: inline-block;" value="" placeholder="用户名">
					<span class="btm-text" style="color: red">${message1}</span>
				</div>
				<div class="form-group has-feedback" style="margin-bottom:10px;">
					<span class="layui-icon form-control-feedback">&#xe612;</span>
					<input name="realName" id="realName" autofocus required lay-verify="required"
						   class=" form-control required" value="" placeholder="真实姓名"/>

				</div>
				<div class="form-group has-feedback" style="margin-bottom:10px;display: inline-block">
					<span class="layui-icon form-control-feedback">&#xe678;</span>
						<input name="tel" id="tel" autofocus required lay-verify="required"
						class="form-control required" value="" style="display: inline-block;" placeholder="手机">
					<span class="btm-text" style="color: red">${message2}</span>
				</div>
				<div class="form-group has-feedback" style="margin-bottom:10px;">
					<span class="layui-icon form-control-feedback">&#xe673;</span>
					<input type="password" name="password" id="password" required lay-verify="required|pass"  
						class=" form-control required" autocomplete="new-password" value="" placeholder="密码">
				</div>
				<div class="row" style="margin-bottom:20px;padding:0 20px;">
					<div class="col-md-6"></div>
				</div>
				<div class="row" style="margin-bottom:20px;">
					<!-- /.col -->
					<div class="col-xs-12">
						<button class="btn btn-block btn-primary btn-lg" type="submit" >注册</button>
					</div>
					<!-- /.col -->
					<div class="col-xs-12">
						 <p class="btm-text"><a href="/devicesystem">已有账号请登录</a></p>
					</div>
					<div class="col-xs-12">
						<p class="btm-text" style="color: red">${message}</p>
					</div>
				</div>
			</form>
		</div>
		<!-- /.login-box-body -->
	</div>
</body>
</html>