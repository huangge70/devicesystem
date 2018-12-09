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
<div class="row">
    <div id="mainDiv" class="fa-border">

        [出错啦!]
        <br>
        <br>
        <c:if test="${exception!=null }"> ${exception.message }</c:if>

        <br><br>
        <button onclick="javascript:history.back();">返回</button>
    </div>
</div>

<script src="/devicesystem/static//js/jquery-1.10.2.js"></script>
<!-- Bootstrap Js -->
<script src="/devicesystem/static//js/bootstrap.min.js"></script>
<!-- Metis Menu Js -->
<script src="/devicesystem/static//js/jquery.metisMenu.js"></script>
<!-- DATA TABLE SCRIPTS -->
<script src="/devicesystem/static//js/dataTables/jquery.dataTables.js"></script>
<script src="/devicesystem/static//js/dataTables/dataTables.bootstrap.js"></script>
<script>
    $(document).ready(function () {
        $('#dataTables-example').dataTable();
    });
</script>
<!-- Custom Js -->
<script src="/devicesystem/static//js/custom-scripts.js"></script>
</body>
</html>