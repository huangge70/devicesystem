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
                测距仪设备管理
            </div>
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                        <thead>
                        <tr>
                            <th>ranId</th>
                            <th>品牌</th>
                            <th>测量精度(mm)</th>
                            <th>测量距离(m)</th>
                            <th>测量方式</th>
                            <th>入库时间</th>
                            <th>价格</th>
                            <th>设备状态</th>
                            <th>更新</th>
                            <th>删除</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${ranList}" var="ra">
                            <tr class="odd gradeX">
                                <td class="center">${ra.ranId}</td>
                                <td class="center">${ra.ranBrand}</td>
                                <td class="center">${ra.ranAccuracy}</td>
                                <td class="center">${ra.ranDistance}</td>
                                <td>${ra.ranMethod}</td>
                                <td><fmt:formatDate value="${ra.ranStoragetime}" pattern="yyyy-MM-dd"/></td>
                                <td>${ra.ranPrice}</td>
                                <td>${ra.ranStatus}</td>
                                <td><a href="/devicesystem/device/getRanById?ranId=${ra.ranId}">更新</a></td>
                                <td><a href="/devicesystem/device/deleteRan?ranId=${ra.ranId}">删除</a></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                        <tbody>
                        <form action="/devicesystem/device/addRan" method="post">
                            <tr class="odd gradeX">
                                <td class="center"></td>
                                <td class="center"><input type="text" class="test" name="ranBrand" placeholder="品牌"/></td>
                                <td class="center"><input type="text" class="test" name="ranAccuracy" placeholder="精准度"/></td>
                                <td class="center"><input type="text" class="test" name="ranDistance" placeholder="测量距离"/></td>
                                <td class="center"><input type="text" class="test" name="ranMethod" placeholder="测量方式"/></td>
                                <td><input type="date" class="test" name="ranStoragetime" placeholder="输入日期"/></td>
                                <td><input type="text" class="test" name="ranPrice" placeholder="价格"/></td>
                                <td><input type="text" class="test" name="ranStatus" value="1"/></td>
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