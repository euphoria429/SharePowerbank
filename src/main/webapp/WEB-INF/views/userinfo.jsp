<%--
  Created by IntelliJ IDEA.
  User: 13545
  Date: 2021/6/22
  Time: 23:05
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
            <li class="layui-nav-item layui-hide-xs">个人信息</li>
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
                <li class="layui-nav-item"><a href="/user/mainpage">借充电宝</a></li>
                <li class="layui-nav-item"><a href="/user/orderpage">历史订单</a></li>
                <li class="layui-nav-item"><a href="">个人信息</a></li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">
            <form class="layui-form layui-form-pane" id="editForm" lay-filter="editform">
                <div class="layui-form-item">
                    <label class="layui-form-label" id="user_id">用户编号</label>
                    <div class="layui-input-inline">
                        <input type="text" id="id" name="id" required lay-verify="required" autocomplete="off"
                               class="layui-input" readonly>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label" id="user_phone">用户账号</label>
                    <div class="layui-input-inline">
                        <input type="text" id="phone" name="phone" required lay-verify="required|phone|number" autocomplete="off"
                               class="layui-input" readonly>
                    </div>
                </div>

                <div class="layui-form-item">
                    <label class="layui-form-label" id="user_alias">昵称</label>
                    <div class="layui-input-inline">
                        <input type="text" id="alias" name="alias" required lay-verify="required" autocomplete="off"
                               class="layui-input" readonly>
                    </div>
                </div>

                <div class="layui-form-item">
                    <label class="layui-form-label" id="user_balance">用户余额</label>
                    <div class="layui-input-inline">
                        <input type="text" id="balance" name="balance"  autocomplete="off"
                               class="layui-input" readonly>
                        <div class="layui-form-item" style="text-align: center;">
                                <input class="layui-btn layui-btn-sm"  id="addmoney" value="充值" >
                        </div>
                    </div>

                </div>
            </form>
        </div>
    </div>

</div>
<script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
<script>
    //JS
</script>

<script type="text/javascript">
    var name= '<%=request.getSession().getAttribute("username")%>';
    layui.use(['form','layer','jquery'],function () {
            var form=layui.form;
            var layer=layui.layer;
            var $ =layui.jquery;
            $(function () {
                $.ajax({
                    url: "/user/showInfo",
                    method: "post",
                    data: {"username":name},
                    success: function (data) {
                        var json = JSON.parse(data);//这步关键啊
                        /* 渲染表单 */
                        form.val("editform", {
                            "id":json.user_id,
                            "phone":json.user_phone,
                            "alias":json.user_alias,
                            "balance":json.user_balance
                        });
                        // layer.alert("查看ID : " + data.userId + " 查看昵称："+data.userAlias);
                    }
                });
                $("#addmoney").click(function () {
                    layer.prompt({
                        formType: 0,
                        value: '',
                        title: '请输入充值金额',
                        btn: ['确定','取消'], //按钮，
                        btnAlign: 'c'
                    }, function(value,index){
                        //此时获取到的数据为value
                        // layer.close(index);
                        $.ajax({
                            url: "/user/addmoney",
                            type: "POST",
                            data: {"username": name,"money":value},
                            success: function (data) {
                                console.log(data);
                                var json = JSON.parse(data);
                                if (json.result == "1") {
                                    //关闭弹框
                                    layer.close(index);
                                    layer.msg("充值成功", {icon: 6});
                                    setTimeout('location.reload()',1000);//定时刷新
                                } else {
                                    layer.msg("充值失败", {icon: 5});
                                }
                            },

                        });
                    });
                })
            })

        })
</script>
</body>
</html>

