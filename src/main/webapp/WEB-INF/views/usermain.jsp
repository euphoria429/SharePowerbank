<%--
  Created by IntelliJ IDEA.
  User: 13545
  Date: 2021/6/22
  Time: 22:31
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
        <div class="layui-logo layui-hide-xs layui-bg-black">用户中心</div>
        <!-- 头部区域（可配合layui 已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <!-- 移动端显示 -->
            <li class="layui-nav-item layui-show-xs-inline-block layui-hide-sm" lay-header-event="menuLeft">
                <i class="layui-icon layui-icon-spread-left"></i>
            </li>
            <li class="layui-nav-item layui-hide-xs">欢迎使用广药大共享充电宝系统</li>
        </ul>

        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">${username}</li>
            <li class="layui-nav-item"><a href="/user/userLogout">退出登录</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree layui-bg-black" lay-filter="test">
                <li class="layui-nav-item"><a href="">借充电宝</a></li>
                <li class="layui-nav-item"><a href="/user/orderpage">历史订单</a></li>
                <li class="layui-nav-item"><a href="/user/infopage">个人信息</a></li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">
            <div style="width:800px;height:550px;border:#ccc solid 1px;" id="container"></div>
            <table class="layui-hide" id="test" lay-filter="demo"></table>
            <script type="text/html" id="barDemo">
                <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="lent">借用</a>
                <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="retu">归还</a>
            </script>
        </div>
    </div>

</div>
<script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
<script>
    //JS
</script>

<script type="text/javascript">

    // window.onload = function(){
    //         alert("开始");
    //         var param1 = 1;
    //         $.ajax({
    //             type:"POST",
    //             url:"/powerbank/showcount",
    //             data:{'param1': param1},
    //             success:function(data){
    //                 alert(data);
    //             }
    //         });
    //     alert("结束");
    //
    // }

    var name= '<%=request.getSession().getAttribute("username")%>';

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
    var html_1='欢迎使用3号柜<br><input id="lent" type="button" value="查看"  onclick="return Display_1()"/> ';
    var html_2='欢迎使用2号柜<br><input id="lent" type="button" value="查看"  onclick="return Display_1()"/> ';
    var html_3='欢迎使用1号柜<br><input id="lent" type="button" value="查看"  onclick="return Display_1()"/> ';
    var infoWindow = new BMapGL.InfoWindow(html_1, opts);
    var infoWindow2 = new BMapGL.InfoWindow(html_2, opts2);
    var infoWindow3 = new BMapGL.InfoWindow(html_3, opts3);
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

    function Display_1(){
        layui.use('table', function () {
            var table = layui.table;
            table.render({
                elem: '#test'
                , url: '/cupboard/findInfo'
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

    }
    layui.use('table', function () {
        var table = layui.table;
        //监听表格复选框选择
        // table.on('checkbox(demo)', function (obj) {
        //     console.log(obj)
        // });
        //监听工具条
        table.on('tool(demo)', function (obj) {
            var data = obj.data;
            if (obj.event === 'lent') {
                layer.confirm('确定租借', function (index) {
                    $.ajax({
                        url: "/orders/lentPobk",
                        type: "POST",
                        data: {"cup_id": data.cupboardId,"username":name},
                        success: function (data) {
                            console.log(data);
                            var json = JSON.parse(data);
                            if (json.result == "1") {
                                //关闭弹框
                                layer.close(index);
                                layer.msg("租借成功", {icon: 6});
                                setTimeout('Display_1()',500);//刷新页面
                            } else {
                                layer.msg("租借失败", {icon: 5});
                            }
                        }
                    });
                    // layer.alert("借用+查看ID : " + data.cupboardId + " 的行");
                });
            }
            else if (obj.event === 'retu') {
                layer.open({
                    type:2,
                    title:'请选择未归还的订单',
                    shadeClose:false,           //弹框外的地方是否可以点击
                    offset:'30%',
                    area:['60%','50%'],
                    content:'/orders/orderpage?cup_id='+data.cupboardId,
                    cancel: function() {
                        // 你点击右上角 X 取消后要做什么
                        setTimeout('Display_1()', 1);
                    }
                });
                    // $.ajax({
                    //     url: "/cupboard/returnbank",
                    //     type: "POST",
                    //     data: {"id": data.cupboardId},
                    //     dataType: "json",
                    //     success: function (data) {
                    //         var json = JSON.parse(data);
                    //         if (json.result == "1") {
                    //             // obj.del();
                    //             //关闭弹框
                    //             layer.close(index);
                    //             layer.msg("归还成功", {icon: 6});
                    //             $(".layui-laypage-btn").click()
                    //         } else {
                    //             layer.msg("归还失败", {icon: 5});
                    //         }
                    //     }
                    // });
                    // layer.alert("归还：查看ID : " + data.cupboardId + " 的行");
            }
        });
    });
</script>
</body>
</html>
