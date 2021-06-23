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

    <title>用户中心</title>
    <link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">

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
        <div class="layui-logo layui-hide-xs layui-bg-black">用户中心</div>
        <!-- 头部区域（可配合layui 已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <!-- 移动端显示 -->
            <li class="layui-nav-item layui-show-xs-inline-block layui-hide-sm" lay-header-event="menuLeft">
                <i class="layui-icon layui-icon-spread-left"></i>
            </li>
            <li class="layui-nav-item layui-hide-xs">归还充电宝</li>
        </ul>

        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item"><a href="">退出登录</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree layui-bg-black" lay-filter="test">
                <li class="layui-nav-item"><a href="/user/mainpage">借充电宝</a></li>
                <li class="layui-nav-item"><a href="">归还充电宝</a></li>
                <li class="layui-nav-item"><a href="/user/orderpage">历史订单</a></li>
                <li class="layui-nav-item"><a href="/user/infopage">个人信息</a></li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">
            <div style="width:697px;height:550px;border:#ccc solid 1px;" id="container"></div>
        </div>
    </div>

</div>
<script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
<script>
    //JS
</script>

<script type="text/javascript">
    var map = new BMapGL.Map('container');
    var point = new BMapGL.Point(113.40592,23.060042);
    var point2=new BMapGL.Point(113.406534,23.061098);
    var point3=new BMapGL.Point(113.407495,23.060832);
    map.centerAndZoom(point, 18);
    map.centerAndZoom(point2, 18);
    map.centerAndZoom(point3,18);
    // 创建点标记
    var marker = new BMapGL.Marker(point);
    var marker2=new BMapGL.Marker(point2);
    var marker3=new BMapGL.Marker(point3);
    map.addOverlay(marker);
    map.addOverlay(marker2);
    map.addOverlay(marker3);
    // 创建信息窗口
    var opts = {
        width: 150,
        height: 50,
        title: '8栋充电宝'
    };
    var opts2 = {
        width: 150,
        height: 50,
        title: '6栋充电宝'
    };
    var opts3 = {
        width: 150,
        height: 50,
        title: '4栋充电宝'
    };
    var infoWindow = new BMapGL.InfoWindow('欢迎使用', opts);
    var infoWindow2 = new BMapGL.InfoWindow('欢迎使用', opts2);
    var infoWindow3 = new BMapGL.InfoWindow('欢迎使用', opts3);
    // 点标记添加点击事件
    marker.addEventListener('click', function () {
        map.openInfoWindow(infoWindow, point); // 开启信息窗口
    });
    marker2.addEventListener('click', function () {
        map.openInfoWindow(infoWindow2, point2); // 开启信息窗口
    });
    marker3.addEventListener('click', function () {
        map.openInfoWindow(infoWindow3, point3); // 开启信息窗口
    });
</script>
</body>
</html>
