<%--
  Created by IntelliJ IDEA.
  User: 13545
  Date: 2021/6/22
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>table模块快速使用</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/layui.css" media="all">
</head>
<body>

<table id="demo" lay-filter="test"></table>

<script src="${pageContext.request.contextPath}/static/layui/layui.js"></script>
<script>
    layui.use('table', function(){
        var table = layui.table;

        //第一个实例
        table.render({
            elem: '#demo'
            ,height: 312
            ,url: '/user/findAll' //数据接口
            ,page: false //开启分页
            ,cols: [[ //表头
                {field: 'userId', title: 'ID', width:80, sort: true, fixed: 'left'}
                ,{field: 'userPhone', title: '用户手机', width:80}
                ,{field: 'userAlias', title: '用户昵称', width:80, sort: true}
                ,{field: 'userPassword', title: '用户密码', width:80}
                ,{field: 'userBalance', title: '用户余额', width: 177}
            ]]
        });

    });
</script>
</body>
</html>
