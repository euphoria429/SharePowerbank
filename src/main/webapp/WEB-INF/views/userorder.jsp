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
            <li class="layui-nav-item layui-hide-xs">查看订单</li>
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
                <li class="layui-nav-item"><a href="/user/returnpage">归还充电宝</a></li>
                <li class="layui-nav-item"><a href="">历史订单</a></li>
                <li class="layui-nav-item"><a href="/user/infopage">个人信息</a></li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">
            <div style="width:697px;height:550px;border:#ccc solid 1px;" id="container">
                <table class="layui-hide" id="test" lay-filter="demo"></table>
                <script type="text/html" id="barDemo">
                    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="pay">支付</a>
                </script>
            </div>
        </div>
    </div>

</div>
<script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
<script>
    //JS
</script>

<script type="text/javascript">
    layui.use('table', function () {
        var table = layui.table;
        table.render({
            elem: '#test'
            , url: '/order/findOrder'
            , cols: [[
                {field: 'cupboardId', width: 80, title: 'ID', sort: true}
                , {field: 'locationId', width: 120, title: '地址id', sort: true}
                , {field: 'pobkAvailableNum', width: 120, title: '可用充电宝', sort: true}
                ,{field: 'pobkNum', width: 120, title: '充电宝总数'}
                , {field: 'right', title: '操作', toolbar: "#barDemo"}
            ]]
            , page: false
            , height: 298
            , id: 'testTable'
        });
    });

    layui.use('table', function () {
        var table = layui.table;
        //监听工具条
        table.on('tool(demo)', function (obj) {
            var data = obj.data;
            if (obj.event === 'pay') {
                layer.confirm('确定支付', function (index) {
                    // $.ajax({
                    //     url: "/dept/deleteDept",
                    //     type: "POST",
                    //     data: {"id": data.cupboardId},
                    //     dataType: "json",
                    //     success: function (data) {
                    //         var json = JSON.parse(data);
                    //         if (json.result == "1") {
                    //             // obj.del();
                    //             //关闭弹框
                    //             layer.close(index);
                    //             layer.msg("租借成功", {icon: 6});
                    //             $(".layui-laypage-btn").click()
                    //         } else {
                    //             layer.msg("租借失败", {icon: 5});
                    //         }
                    //     }
                    // });
                    layer.alert("支付+查看ID : " + data.orderId + " 的行");
                });
            }
        });
    });
</script>
</body>
</html>
