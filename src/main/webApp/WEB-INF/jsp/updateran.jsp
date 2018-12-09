<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>
<body>
<div class="row">
    <div class="col-md-12">
        <!-- Advanced Tables -->
        <div class="panel panel-default">
            <div class="panel-heading">
                手机设备管理
            </div>
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                        <thead>
                        <tr>
                            <th>测距仪Id</th>
                            <th>品牌</th>
                            <th>测量精度(mm)</th>
                            <th>测量距离(m)</th>
                            <th>测量方式</th>
                            <th>入库时间</th>
                            <th>价格</th>
                            <th>设备状态</th>
                        </tr>
                        </thead>
                        <tbody>
                        <form action="/devicesystem/device/updateRan" method="post">
                            <tr class="odd gradeX">
                                <td class="center"><input type="text" class="test" name="ranId" value="${ran.ranId}"/></td>
                                <td class="center"><input type="text" class="test" name="ranBrand" value="${ran.ranBrand}"/></td>
                                <td class="center"><input type="text" class="test" name="ranAccuracy" value="${ran.ranAccuracy}"/></td>
                                <td class="center"><input type="text" class="test" name="ranDistance" value="${ran.ranDistance}"/></td>
                                <td class="center"><input type="text" class="test" name="ranMethod" value="${ran.ranMethod}"/></td>
                                <td><input type="date" class="test" name="ranStoragetime" value="${ran.ranStoragetime}"/></td>
                                <td><input type="text" class="test" name="ranPrice" value="${ran.ranPrice}"/></td>
                                <td><input type="text" class="test" name="ranStatus" value="${ran.ranStatus}"/></td>
                            </tr>
                            <tr class="odd gradeX">
                                <td><button type="submit" class="btn-primary">提交更新</button></td>
                            </tr>
                        </form>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <!--End Advanced Tables -->
    </div>
</div>

</body>
</html>