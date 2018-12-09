<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
<body>
<div class="row">
    <div class="col-md-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                交换机设备管理
            </div>
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                        <thead>
                        <tr>
                            <th>switchId</th>
                            <th>品牌</th>
                            <th>接口数</th>
                            <th>接口类型</th>
                            <th>设备价格</th>
                            <th>入库时间</th>
                            <th>设备状态</th>
                            <th>更新</th>
                            <th>删除</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${swList}" var="sw">
                            <tr class="odd gradeX">
                                <td class="center">${sw.switchboardId}</td>
                                <td class="center">${sw.switchboardBrand}</td>
                                <td class="center">${sw.switchboardPortnumber}</td>
                                <td class="center">${sw.switchboardInterfacetype}</td>
                                <td>${sw.switchboardPrice}</td>
                                <td><fmt:formatDate value="${sw.switchboardStoragetime}" pattern="yyyy-MM-dd"/></td>
                                <td>${sw.switchboardStatus}</td>
                                <td><a href="/devicesystem/device/getSwitchById?switchId=${sw.switchboardId}">更新</a></td>
                                <td><a href="/devicesystem/device/deleteSwitch?switchId=${sw.switchboardId}">删除</a></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                        <tbody>
                        <form action="/devicesystem/device/addSwitch" method="post">
                            <tr class="odd gradeX">
                                <td class="center"></td>
                                <td class="center"><input type="text" class="test" name="switchboardBrand" placeholder="输入品牌"/></td>
                                <td class="center"><input type="text" class="test" name="switchboardPortnumber" placeholder="输入接口数"/></td>
                                <td class="center"><input type="text" class="test" name="switchboardInterfacetype" placeholder="输入接口类型"/></td>
                                <td class="center"><input type="text" class="test" name="switchboardPrice" placeholder="输入价格"/></td>
                                <td><input type="date" class="test" name="switchboardStoragetime" placeholder="输入日期"/></td>
                                <td><input type="text" class="test" name="switchboardStatus" value="1"/></td>
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