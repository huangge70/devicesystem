<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>
<body>
<div class="row">
    <div class="col-md-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                手机设备管理
            </div>
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                        <thead>
                        <tr>
                            <th>mobileId</th>
                            <th>品牌</th>
                            <th>内存</th>
                            <th>屏幕尺寸</th>
                            <th>设备价格</th>
                            <th>入库时间</th>
                            <th>设备状态</th>
                            <th>更新</th>
                            <th>删除</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${moList}" var="mobile">
                            <tr class="odd gradeX">
                                <td class="center">${mobile.mobileId}</td>
                                <td class="center">${mobile.mobileBrand}</td>
                                <td class="center">${mobile.mobileMemory}</td>
                                <td class="center">${mobile.mobileScreensize}</td>
                                <td>${mobile.mobilePrice}</td>
                                <td><fmt:formatDate value="${mobile.mobileStoragetime}" pattern="yyyy-MM-dd"/></td>
                                <td>${mobile.mobileStatus}</td>
                                <td><a href="/devicesystem/device/getMobileById?mobileId=${mobile.mobileId}">更新</a></td>
                                <td><a href="/devicesystem/device/deleteMobile?mobileId=${mobile.mobileId}">删除</a></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                        <tbody>
                        <form action="/devicesystem/device/addMobile" method="post">
                            <tr class="odd gradeX">
                                <td class="center"></td>
                                <td class="center"><input type="text" class="test" name="mobileBrand" placeholder="输入品牌"/></td>
                                <td class="center"><input type="text" class="test" name="mobileMemory" placeholder="输入内存"/></td>
                                <td class="center"><input type="text" class="test" name="mobileScreensize" placeholder="输入尺寸"/></td>
                                <td class="center"><input type="text" class="test" name="mobilePrice" placeholder="输入价格"/></td>
                                <td><input type="date" class="test" name="mobileStoragetime" placeholder="输入日期"/></td>
                                <td><input type="text" class="test" name="mobileStatus" value="1"/></td>
                                <td><button type="submit" value="添加"  class="btn btn-primary">添加</button></td>
                            </tr>
                        </form>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>