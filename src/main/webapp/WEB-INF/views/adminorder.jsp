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
            <script type="text/html" id="barDemo">
                <a class="layui-btn layui-btn-xs" lay-event="update">修改</a>
                <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
            </script>

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
            , url: '/orders/findAll'
            , cols: [[
                {field: 'orderId', width: 80, title: '订单编号', sort: true}
                , {field: 'orderUserid', width: 120, title: '用户id', sort: true}
                , {field: 'orderPobkid', width: 120, title: '充电宝编号', sort: true}
                ,{field: 'orderCreatetime', width: 200, title: '创建时间'}
                ,{field: 'orderFinishtime', width: 200, title: '结束时间'}
                ,{field: 'orderCost', width: 120, title: '结算金额'}
                ,{field: 'orderStatus', width: 120, title: '订单状态'}
                , {field: 'right', title: '操作', toolbar: "#barDemo"}
            ]]
            , page: false
            , height: 700
            , id: 'testTable'
        });
    });

    layui.use('table', function () {
        var table = layui.table;
        //监听工具条
        table.on('tool(demo)', function (obj) {
            var data = obj.data;
            if (obj.event === 'update') {
                if(data.orderStatus!="未支付"){
                    layer.msg("不在可修改状态", {icon: 5});
                }else{
                    layer.prompt({
                        formType: 0,
                        value: '',
                        title: '请输入修改后的金额',
                        btn: ['确定','取消'], //按钮，
                        btnAlign: 'c'
                    }, function(value,index){
                        //此时获取到的数据为value
                        // layer.close(index);
                        $.ajax({
                            url: "/orders/changeCost",
                            type: "POST",
                            data: {"order_id": data.orderId,"cost":value},
                            success: function (data) {
                                console.log(data);
                                var json = JSON.parse(data);
                                if (json.result == "1") {
                                    //关闭弹框
                                    layer.close(index);
                                    layer.msg("修改成功", {icon: 6});
                                    setTimeout('location.reload()',1000);//定时刷新
                                } else {
                                    layer.close(index);
                                    layer.msg("修改失败", {icon: 5});
                                }
                            },

                        });
                    });
                }
            }

            if (obj.event === 'del') {
                if(data.orderStatus!="已支付"){
                    layer.msg("不在可删除状态", {icon: 5});
                }else{
                    layer.confirm('确定删除', function (index) {
                        $.ajax({
                            url: "/orders/delorder",
                            type: "POST",
                            data: {"order_id": data.orderId},
                            success: function (data) {
                                var json = JSON.parse(data);
                                if (json.result == "1") {
                                    //关闭弹框
                                    layer.close(index);
                                    layer.msg("删除成功", {icon: 6});
                                    setTimeout('location.reload()',1000);//定时刷新
                                } else {
                                    layer.msg("删除失败", {icon: 5});
                                }
                            }
                        });
                    });
                }
            }
        });
    });
</script>
</body>
</html>
