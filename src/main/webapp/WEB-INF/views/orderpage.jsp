<%--
  Created by IntelliJ IDEA.
  User: 13545
  Date: 2021/6/25
  Time: 18:57
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
        <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="pay">归还</a>
    </script>

</div>
<script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
<script>
    var name= '<%=request.getSession().getAttribute("username")%>';
    var cup_id= '<%=request.getSession().getAttribute("cup_id")%>';
    // alert(name);
    layui.use('table', function () {
        var table = layui.table;
        table.render({
            elem: '#test'
            , url: '/orders/showreturnOrder'
            ,method:'post'
            ,where:{"username":name}
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
                layer.confirm('确定归还', function (index) {
                    $.ajax({
                        url: "/orders/returnPobk",
                        type: "POST",
                        data: {"order_id": data.orderId,"cup_id":cup_id,"pobk_id":data.orderPobkid,"username":name},
                        success: function (data) {
                            var json = JSON.parse(data);
                            if (json.result == "1") {
                                //关闭弹框
                                layer.close(index);
                                layer.msg("归还成功", {icon: 6});
                                setTimeout('location.reload()',1000);//定时刷新;
                            } else {
                                layer.msg("归还失败", {icon: 5});
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
