<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title></title>
    <!-- Bootstrap Styles-->
    <link href="/devicesystem/static//css/bootstrap.css" rel="stylesheet" />
    <!-- FontAwesome Styles-->
    <link href="/devicesystem/static//css/font-awesome.css" rel="stylesheet" />
    <!-- Morris Chart Styles-->

    <!-- Custom Styles-->
    <link href="/devicesystem/static//css/custom-styles.css" rel="stylesheet" />
    <!-- Google Fonts-->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
    <!-- TABLE STYLES-->
    <link href="/devicesystem/static//js/dataTables/dataTables.bootstrap.css" rel="stylesheet" />
</head>
<body>
<%
    if ((String)request.getAttribute("result")==("success")) {
%>
<script>
    alert("修改成功！");
</script>
<%
    }
%>
<div id="wrapper">
    <nav class="navbar navbar-default top-navbar" role="navigation">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index"><i class="fa fa-gear"></i> <strong>设备管理系统</strong></a>
        </div>

        <ul class="nav navbar-top-links navbar-right">
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
                    <i class="fa fa-envelope fa-fw"></i> <i class="fa fa-caret-down"></i>
                </a>
                <ul class="dropdown-menu dropdown-messages">

                </ul>
                <!-- /.dropdown-messages -->
            </li>
            <!-- /.dropdown -->
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
                    <i class="fa fa-tasks fa-fw"></i> <i class="fa fa-caret-down"></i>
                </a>
                <ul class="dropdown-menu dropdown-tasks">

                </ul>
                <!-- /.dropdown-tasks -->
            </li>
            <!-- /.dropdown -->
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
                    <i class="fa fa-bell fa-fw"></i> <i class="fa fa-caret-down"></i>
                </a>
                <ul class="dropdown-menu dropdown-alerts">
                </ul>
                <!-- /.dropdown-alerts -->
            </li>
            <!-- /.dropdown -->
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
                    <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                </a>
                <ul class="dropdown-menu dropdown-user">
                    <li><a href="/devicesystem/user/queryuser"><i class="fa fa-user fa-fw"></i> 个人中心</a>
                    </li>
                    <li class="divider"></li>
                    <li><a href="/devicesystem/user/logout"><i class="fa fa-sign-out fa-fw"></i> 退出</a>
                    </li>
                </ul>
                <!-- /.dropdown-user -->
            </li>
            <!-- /.dropdown -->
        </ul>
    </nav>
    <!--/. NAV TOP  -->
    <nav class="navbar-default navbar-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav" id="main-menu">
                <li>
                    <a href="#"><i class="fa fa-dashboard"></i>移动计算与移动智能实验室</a>
                </li>
                <li>
                    <a href="/devicesystem/index/getIndex"><i class="fa fa-desktop"></i>设备概览</a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-sitemap"></i>查找设备<span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="/devicesystem/device/getMobile" class="active-menu">手机</a>
                        </li>
                        <li>
                            <a href="/devicesystem/device/getHost">主机</a>
                        </li>
                        <li>
                            <a href="/devicesystem/device/getSwitch">交换机</a>
                        </li>
                        <li>
                            <a href="/devicesystem/device/getRan">测距仪</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="/devicesystem/device/mobilemanage"><i class="fa fa-edit"></i>设备管理<span class="fa arrow"></span></a>
                </li>

                <li>
                    <a href="/devicesystem/deviceorder/queryRecordByUserId" ><i class="fa fa-bar-chart-o"></i>借阅记录</a>
                </li>
                <li>
                    <a href="/devicesystem/user/queryuser"><i class="fa fa-qrcode"></i>个人中心</a>
                </li>

                <li>
                    <a href="#"><i class="fa fa-fw fa-file"></i>系统说明</a>
                </li>
                <li>
                    <a href="/devicesystem/deviceorder/queryRecord" ><i class="fa fa-table"></i> 查看所有记录</a>
                </li>
            </ul>
        </div>
    </nav>
    <!-- /. NAV SIDE  -->
    <div id="page-wrapper" >
        <div id="page-inner">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="page-header">
                        个人信息
                    </h1>
                </div>
            </div>


            <div class="row">

                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            个人信息 <small>User Information</small>
                        </div>

                        <div class="panel-body">
                            <div class="table-responsive">
                                <form action="/devicesystem/user/updateuser" method="post">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                        <tr>
                                            <td style="text-align: center">用 户 名</td>
                                            <td><input type="text" name="loginName" autofocus required lay-verify="required" value="${user.loginName}"/></td>
                                        </tr>
                                        <tr>
                                            <td style="text-align: center">密码</td>
                                            <td><input type="text" name="password" autofocus required lay-verify="required" value="${user.password}"/></td>
                                        </tr>
                                        <tr>
                                            <td style="text-align: center">真实姓名</td>
                                            <td><input type="text" name="realName" autofocus required lay-verify="required" value="${user.realName}"/></td>
                                        </tr>
                                        <tr>
                                            <td style="text-align: center">联系电话</td>
                                            <td><input type="text" name="tel" autofocus required lay-verify="required" value="${user.tel}"/></td>
                                        </tr>
                                        <tr>
                                            <td style="text-align: center">邮箱地址</td>
                                            <td><input type="text" name="email" value="${user.email}"/></td>
                                        </tr>

                                </table>
                                    <input type="hidden" name="userId"  value="${user.userId}"/>
                                    <input type="hidden" name="roleId" value="${user.roleId}" />
                                    <div class="col-xs-12">
                                        <button class="btn btn-block btn-primary btn-lg" type="submit" >提交修改</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
            </div>
        </div>
    </div>
    <!-- /. PAGE INNER  -->
</div>
<!-- /. PAGE WRAPPER  -->
<!-- /. WRAPPER  -->
<!-- JS Scripts-->
<!-- jQuery Js -->
<script src="/devicesystem/static//js/jquery-1.10.2.js"></script>
<!-- Bootstrap Js -->
<script src="/devicesystem/static//js/bootstrap.min.js"></script>
<!-- Metis Menu Js -->
<script src="/devicesystem/static//js/jquery.metisMenu.js"></script>
<!-- DATA TABLE SCRIPTS -->
<script src="/devicesystem/static//js/dataTables/jquery.dataTables.js"></script>
<script src="/devicesystem/static//js/dataTables/dataTables.bootstrap.js"></script>

<!-- Custom Js -->
<script src="/devicesystem/static//js/custom-scripts.js"></script>
</body>
</html>

</html>