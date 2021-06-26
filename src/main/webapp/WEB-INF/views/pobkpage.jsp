<%--
  Created by IntelliJ IDEA.
  User: 13545
  Date: 2021/6/26
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<div style="padding: 15px;">
    <table class="layui-hide" id="test" lay-filter="demo"></table>
    <script type="text/html" id="barDemo">
        <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="recycle">回收</a>
    </script>

</div>
<script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
<script>
    var cup_id= '<%=request.getSession().getAttribute("cup_id")%>';
    layui.use('table', function () {
        var table = layui.table;
        table.render({
            elem: '#test'
            , url: '/powerbank/showPobkByCupId'
            ,method:'post'
            ,where:{"cup_id":cup_id}
            , cols: [[
                {field: 'pobkCupboardId', width: 80, title: '充电柜编号', sort: true}
                , {field: 'pobkId', width: 120, title: '充电宝编号', sort: true}
                , {field: 'pobkStatus', width: 120, title: '充电宝状态', sort: true}
                , {field: 'right', title: '操作', toolbar: "#barDemo"}
            ]]
            , page: false
            , height: 500
            , id: 'testTable'
        });
    });

    layui.use('table', function () {
        var table = layui.table;
        //监听工具条
        table.on('tool(demo)', function (obj) {
            var data = obj.data;
            if (obj.event === 'recycle') {
                layer.confirm('确定回收', function (index) {
                    $.ajax({
                        url: "/powerbank/recyclePobk",
                        type: "POST",
                        data: {"cup_id":cup_id,"pobk_id":data.pobkId},
                        success: function (data) {
                            var json = JSON.parse(data);
                            if (json.result == "1") {
                                //关闭弹框
                                layer.close(index);
                                layer.msg("回收成功", {icon: 6});
                                setTimeout('location.reload()',1000);//定时刷新;
                            } else {
                                layer.msg("回收失败", {icon: 5});
                            }
                        }
                    });
                    // layer.alert("支付+查看ID : " + data.orderId + " 的行,顺便现在cup_id为"+cup_id+",用户名："+name+"pobkid="+data.orderPobkid);
                });
            }
        });
    });
</script>
</body>
</html>

