<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Home</title>
    <!-- Bootstrap Styles   从templates文件夹中，访问static文件夹中的静态资源时，路径：/static/css/***-->
    <link href="/devicesystem/static/css/bootstrap.css" rel="stylesheet" />
    <!-- FontAwesome Styles-->
    <link href="/devicesystem/static/css/font-awesome.css" rel="stylesheet" />
    <!-- Morris Chart Styles-->
    <link href="/devicesystem/static/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
    <!-- Custom Styles-->
    <link href="/devicesystem/static/css/custom-styles.css" rel="stylesheet" />
    <!-- Google Fonts-->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>

<body>
<%
    if ((String)request.getSession().getAttribute("result")==("fail")) {
%>
<script type="javascript">
    alert("您没有相应的权限！");
</script>
<%
        request.getSession().removeAttribute("result");
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
                <a class="navbar-brand" href="index.jsp"><i class="fa fa-gear"></i> <strong>设备管理系统</strong></a>
            </div>

            <ul class="nav navbar-top-links navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
                        <i class="fa fa-envelope fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-messages">

                    </ul>
                </li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
                        <i class="fa fa-tasks fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-tasks">
                    </ul>
                </li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
                        <i class="fa fa-bell fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-alerts">
                    </ul>
                </li>
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
                        </li>
                    </ul>
                </li>
            </ul>
        </nav>
        <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
                    <li>
                        <a href="#"><i class="fa fa-dashboard"></i>移动计算与移动智能实验室</a>
                    </li>
                    <li>
                        <a href="/devicesystem/index/getIndex"  class="active-menu"><i class="fa fa-desktop"></i>设备概览</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-sitemap"></i>查找设备<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="/devicesystem/device/getMobile" >手机</a>
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
        <div id="page-wrapper">
            <div id="page-inner">
                <div class="row">
                    <div class="col-md-12">
                        <h1 class="page-header">
                            设备概览 <small>实验室设备小计</small>
                        </h1>
						<ol class="breadcrumb">
                          <li><a href="#">设备管理系统</a></li>
                          <li><a href="#">设备概览</a></li>
                        </ol>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-3 col-sm-12 col-xs-12" >
                        <div class="panel  panel-primary text-center no-boder bg-color-green green" >
                            <div class="panel-left pull-left green" >
                                <h3>手机</h3>

                            </div>
                            <div class="panel-right">
                                <h3><a href="/devicesystem/device/getMobile">${mobileNum}台</a></h3>

                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-12 col-xs-12">
                        <div class="panel panel-primary text-center no-boder bg-color-blue">
                              <div class="panel-left pull-left blue">
                                <h3>主机</h3>
								</div>
                                
                            <div class="panel-right">
							<h3><a href="/devicesystem/device/getHost">${hostNum}台</a> </h3>

                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-12 col-xs-12">
                        <div class="panel panel-primary text-center no-boder bg-color-red">
                            <div class="panel-left pull-left red">
                                <h3>交换机</h3>
                               
                            </div>
                            <div class="panel-right">
                                <h3><a href="/devicesystem/device/getSwitch">${switchNum}台</a> </h3>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-12 col-xs-12">
                        <div class="panel panel-primary text-center no-boder bg-color-brown">
                            <div class="panel-left pull-left brown">
                                <h3>测距仪</h3>
                                
                            </div>
                            <div class="panel-right">
                                <h3><a href="/devicesystem/device/getRan">${ranNum}台</a> </h3>

                            </div>
                        </div>
                    </div>
                </div>
			</div>
        </div>
    </div>
    <!-- /. WRAPPER  -->
    <!-- JS Scripts-->
    <!-- jQuery Js -->
    <script src="/devicesystem/static/js/jquery-1.10.2.js"></script>
    <!-- Bootstrap Js -->
    <script src="/devicesystem/static/js/bootstrap.min.js"></script>
	 
    <!-- Metis Menu Js -->
    <script src="/devicesystem/static/js/jquery.metisMenu.js"></script>
    <!-- Morris Chart Js -->
    <script src="/devicesystem/static/js/morris/raphael-2.1.0.min.js"></script>
    <script src="/devicesystem/static/js/morris/morris.js"></script>
	
	
	<script src="/devicesystem/static/js/easypiechart.js"></script>
	<script src="/devicesystem/static/js/easypiechart-data.js"></script>
	
	 <script src="/devicesystem/static/js/Lightweight-Chart/jquery.chart.js"></script>

    <!-- Custom Js -->
    <script src="/devicesystem/static/js/custom-scripts.js"></script>
 

</body>

</html>