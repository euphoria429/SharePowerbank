<%--
  Created by IntelliJ IDEA.
  User: 13545
  Date: 2021/6/22
  Time: 23:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

    <meta name="keywords" content="百度地图,百度地图API，百度地图自定义工具，百度地图所见即所得工具" />
    <meta name="description" content="百度地图API自定义地图，帮助用户在可视化操作下生成百度地图" />

    <title>后台管理</title>
    <link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.js" type="text/javascript" charset="utf-8"></script>

    <style type="text/css">
        html,body{margin:0;padding:0;}
        .iw_poi_title {color:#CC5522;font-size:14px;font-weight:bold;overflow:hidden;padding-right:13px;white-space:nowrap}
        .iw_poi_content {font:12px arial,sans-serif;overflow:visible;padding-top:4px;white-space:-moz-pre-wrap;word-wrap:break-word}
    </style>
    <script src="//api.map.baidu.com/api?type=webgl&v=1.0&ak=vNFOMHB02Ey6oGS0nQH6Hg4ju9u5T7jS"></script>

</head>
<body>
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo layui-hide-xs layui-bg-black">后台管理</div>
        <!-- 头部区域（可配合layui 已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <!-- 移动端显示 -->
            <li class="layui-nav-item layui-show-xs-inline-block layui-hide-sm" lay-header-event="menuLeft">
                <i class="layui-icon layui-icon-spread-left"></i>
            </li>
            <li class="layui-nav-item layui-hide-xs">查看订单</li>
        </ul>

        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">${admin}</li>
            <li class="layui-nav-item"><a href="/admin/adminLogout">退出登录</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree layui-bg-black" lay-filter="test">
                <li class="layui-nav-item"><a href="/admin/mainpage">电宝管理</a></li>
                <li class="layui-nav-item"><a href="/admin/orderpage">订单管理</a></li>
                <li class="layui-nav-item"><a href="/admin/infopage">用户管理</a></li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">
            <table class="layui-hide" id="test" lay-filter="demo"></table>
        </div>
    </div>

</div>
<script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
<script>
    //JS
</script>

<script type="text/javascript">
    // alert(name);
    layui.use('table', function () {
        var table = layui.table;
        table.render({
            elem: '#test'
            , url: '/user/findAll'
            , cols: [[
                {field: 'userId', width: 80, title: '用户编号', sort: true}
                , {field: 'userPhone', width: 130, title: '手机号', sort: true}
                , {field: 'userAlias', width: 130, title: '昵称', sort: true}
                ,{field: 'userBalance', width: 130, title: '余额'}
            ]]
            , page: false
            , height: 700
            , id: 'testTable'
        });
    });
</script>
</body>
</html>
