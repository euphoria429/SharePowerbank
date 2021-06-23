<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>HIS - 东软云医院</title>
    <link rel="stylesheet"  href="${pageContext.request.contextPath}/static/layui/css/layui.css" media="all"/>
    <script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">HIS - 东软云医院</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">

        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    控制台
                </a>
            </li>
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    Admin
                </a>
            </li>
            <li class="layui-nav-item"><a href="">退出</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree" lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">医院基本信息</a>
                    <dl class="layui-nav-child">
                        <dd class="layui-this"><a href="/control/toDept">科室信息</a></dd>
                        <dd><a href="javascript:;">疾病信息</a></dd>
                        <dd><a href="javascript:;">药品信息</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 17px;">>科室信息管理</div>
        <div style="padding: 10px; background-color: #F2F2F2;">
            <div class="layui-card">
                <div class="layui-card-body">
                    <!--cardBody-->
                    <form class="layui-form" action="">
                        <div class="layui-row">
                            <div class="layui-col-xs3">
                                <div class="grid-demo grid-demo-bg1">
                                    <div class="layui-form-item">
                                        <label class="layui-form-label">查询字段</label>
                                        <div class="layui-input-block">
                                            <select id="selects" name="deptsname" lay-filter="dept">
                                                <option value="0">ID编码</option>
                                                <option value="1">科室编码</option>
                                                <option value="2" selected="true">科室名称</option>
                                                <option value="3">科室类别</option>
                                                <option value="4">科室类型</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="layui-col-xs6">
                                <div class="grid-demo grid-demo-bg1">
                                    <div class="layui-form-item">
                                        <label class="layui-form-label"></label>
                                        <div class="layui-input-block">
                                            <input id="demoReload" type="text" name="title" lay-verify="title"
                                                   autocomplete="off" placeholder="要查找的内容" class="layui-input">
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="layui-col-xs3">
                                <div class="grid-demo grid-demo-bg1">
                                    <div class="layui-form-item">
                                        <button class="layui-btn" data-type="reload" type="button">搜索</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>
                    <table class="layui-hide" id="test" lay-filter="demo"></table>
                    <script type="text/html" id="barDemo">
                        <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
                        <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
                        <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
                    </script>
                    <!--cardBody-->
                </div>
            </div>
        </div>
    </div>

    <div class="layui-footer">
        © 东软云医院 - 20175233周升
    </div>
</div>
<script src="../layui/layui.js"></script>
<script>
    layui.use('table', function () {
        var table = layui.table;
        table.render({
            elem: '#test'
            , url: '/user/findAll'
            , cols: [[
                {checkbox: true, fixed: true}
                , {field: 'userId', width: 80, title: 'ID', sort: true}
                , {field: 'userPhone', width: 120, title: '用户手机'}
                , {field: 'userAlias', width: 120, title: '用户昵称', sort: true}
                , {field: 'userPassword', width: 120, title: '用户密码'}
                , {field: 'userBalance', width: 120, title: '用户余额', sort: true}
                , {field: 'right', title: '操作', toolbar: "#barDemo"}
            ]]
            , page: false
            , height: 298
            , id: 'testTable'
        });
    });
</script>
<script>
    //JavaScript代码区域
    layui.use('element', function () {
        var element = layui.element;
    });
    //监听工具条
    layui.use('table', function () {
        var table = layui.table;
        //监听表格复选框选择
        table.on('checkbox(demo)', function (obj) {
            console.log(obj)
        });
        //监听工具条
        table.on('tool(demo)', function (obj) {
            var data = obj.data;
            if (obj.event === 'detail') {
                layer.alert("查看ID : " + data.id + " 的行");
            } else if (obj.event === 'del') {
                layer.confirm('真的删除行么', function (index) {
                    $.ajax({
                        url: "/dept/deleteDept",
                        type: "POST",
                        data: {"id": data.id},
                        dataType: "json",
                        success: function (data) {
                            var json = JSON.parse(data);
                            if (json.result == "1") {
                                obj.del();
                                //关闭弹框
                                layer.close(index);
                                layer.msg("删除成功", {icon: 6});
                                $(".layui-laypage-btn").click()
                            } else {
                                layer.msg("删除失败", {icon: 5});
                            }
                        }
                    });
                });
            } else if (obj.event === 'edit') {
                //layer.alert('编辑行：<br>'+ JSON.stringify(data));
                layer.open({
                    type: 2,
                    closeBtn: 2,
                    title: '修改科室信息',
                    area: ['400px', '420px'],
                    shade: 0.8,
                    id: (new Date()).valueOf(), //设定一个id，防止重复弹出 时间戳1280977330748
                    btnAlign: 'r',
                    moveType: 1, //拖拽模式，0或者1
                    content: '/control/toDeptEdit?id=' + data.id + "&dept_code=" + data.dept_code
                        + "&dept_name=" + encodeURI(encodeURI(data.dept_name)) + "&dept_catagory=" + data.dept_catagory + "&dept_type=" + data.dept_type
                });
            }
        });
        var $ = layui.$, active = {
            reload: function () {
                var demoReload = $('#demoReload').val();//获取输入框的值
                var selects = $('#selects').val();//获取输入框的值
                //alert(demoReload+selects);
                //执行重载
                table.reload('testTable', {
                    page: {
                        curr: 1 //重新从第 1 页开始
                    }
                    , where: {valu: demoReload, domain: selects}//这里传参  向后台
                    , url: '/dept/findAllDeptPageBy'//后台做模糊搜索接口路径
                    , method: 'post'
                });
            }
        };
        //这个是用于创建点击事件的实例
        $('.layui-form-item .layui-btn').on('click', function () {
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });
    });
    function a() {
        $(".layui-laypage-btn").click();
    }
</script>
</body>
</html>
