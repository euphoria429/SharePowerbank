<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>用户登陆</title>
    <link rel="stylesheet"  href="${pageContext.request.contextPath}/static/layui/css/layui.css" media="all"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/login.css" media="all"/>
    <style>
        /* 覆盖原框架样式 */
        .layui-elem-quote{background-color: inherit!important;}
        .layui-input, .layui-select, .layui-textarea{background-color: inherit; padding-left: 30px;}
    </style>
</head>
<body>
<!-- Head -->
<div class="layui-fluid">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-sm12 layui-col-md12 zyl_mar_01">
            <blockquote class="layui-elem-quote">广东药科大学共享充电宝管理系统</blockquote>
        </div>
    </div>
</div>
<!-- Head End -->

<!-- Carousel -->
<div class="layui-row">
    <div class="layui-col-sm12 layui-col-md12">
        <div class="layui-carousel zyl_login_height" id="zyllogin" lay-filter="zyllogin">
            <div carousel-item="">
                <div>
                    <div class="zyl_login_cont"></div>
                </div>
                <div>
                    <div class="background">
                        <span></span><span></span><span></span>
                        <span></span><span></span><span></span>
                        <span></span><span></span><span></span>
                        <span></span><span></span><span></span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Carousel End -->

<!-- Footer -->
<div class="layui-row">
    <div class="layui-col-sm12 layui-col-md12 zyl_center zyl_mar_01">
        © 2021 - GDPU共享充电宝登陆界面 || 黄彩霞
    </div>
</div>
<!-- Footer End -->



<!-- LoginForm -->
<div class="zyl_lofo_main">
    <fieldset class="layui-elem-field layui-field-title zyl_mar_02">
        <legend>欢迎登陆 - GDPU充电宝管理平台</legend>
    </fieldset>
    <div class="layui-row layui-col-space15">
        <form id="myForm" class="layui-form zyl_pad_01" >
            <div class="layui-col-sm12 layui-col-md12">
                <div class="layui-form-item">
                    <input type="text" name="userName" lay-verify="required|userName" autocomplete="off" placeholder="账号" class="layui-input">
                    <i class="layui-icon layui-icon-username zyl_lofo_icon"></i>
                </div>
            </div>
            <div class="layui-col-sm12 layui-col-md12">
                <div class="layui-form-item">
                    <input type="password" name="nuse" lay-verify="required|pass" autocomplete="off" placeholder="密码" class="layui-input">
                    <i class="layui-icon layui-icon-password zyl_lofo_icon"></i>
                </div>
            </div>
            <div class="layui-col-sm12 layui-col-md12">
                <div class="layui-row">
                    <div class="layui-col-xs4 layui-col-sm4 layui-col-md4">
                        <div class="layui-form-item">
                            <input type="text" name="vercode" id="vercode" lay-verify="required|vercodes" autocomplete="off" placeholder="验证码" class="layui-input" maxlength="4">
                            <i class="layui-icon layui-icon-vercode zyl_lofo_icon"></i>
                        </div>
                    </div>
                    <div class="layui-col-xs4 layui-col-sm4 layui-col-md4">
                        <div class="zyl_lofo_vercode zylVerCode" onclick="zylVerCode()"></div>
                    </div>
                </div>
            </div>
            <div class="layui-col-sm12 layui-col-md12">
                <button id="userLogin" class="layui-btn layui-btn-fluid" lay-submit="" lay-filter="demo1" >用户登录</button>
            </div>

            <div class="layui-col-sm12 layui-col-md12">
                <br>
                <button id="adminLogin" class="layui-btn layui-btn-fluid layui-btn-normal" lay-submit="" lay-filter="demo2" >后台登录</button>
            </div>
            <div class="layui-col-sm12 layui-col-md12">
                <br>
                <button id="userResigter" class="layui-btn layui-btn-fluid layui-btn-primary " lay-submit="" lay-filter="demo3" >用户注册</button>
            </div>
        </form>
    </div>
</div>
<!-- LoginForm End -->
<div style="display: none;" id="gb">
    <form class="layui-form"  id="register" action="">
        <div class="layui-form-item">
            <label class="layui-form-label">手机号</label>
            <div class="layui-input-inline">
                <input type="text" name="phone" required lay-verify="phones" placeholder="请输入手机号" autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">用户密码</label>
            <div class="layui-input-inline">
                <input type="password" name="password" required lay-verify="pwd" placeholder="请输入密码" autocomplete="off" class="layui-input" id="pass1">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">确认密码</label>
            <div class="layui-input-inline">
                <input type="password" name="passwords" required lay-verify="pwd" placeholder="请再次输入密码" autocomplete="off" class="layui-input" id="pass2">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">用户昵称</label>
            <div class="layui-input-inline">
                <input type="text" name="alias"  placeholder="请输入昵称" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </form>
</div>

<!-- Jquery Js -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
<!-- Layui Js -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/layui/layui.js"></script>
<!-- Jqarticle Js -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/assembly/jqarticle/jparticle.min.js"></script>
<!-- ZylVerificationCode Js-->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/assembly/zylVerificationCode/zylVerificationCode.js"></script>
<script>

    layui.use(['carousel', 'form'], function(){
        var carousel = layui.carousel
            ,form = layui.form;

        //自定义验证规则
        //要放在form.on外面，千万不能放在提交步骤中，否则会不触发

        $(function() {
            $("#userResigter").click(function() {
                layer.open({
                    type: 1,
                    title: "注册页面",
                    area: ['400px', '400px'],
                    offset:'30%',
                    content: $("#gb"),
                    cancel: function() {
                        // 你点击右上角 X 取消后要做什么
                        setTimeout('window.location.reload()', 1);
                    },
                    success: function() {
                        form.on('submit(formDemo)', function(data) {
                            var formObj = document.getElementById("register");
                            formObj.action="/user/register";
                            formObj.method="post";
                            formObj.submit();
                        });
                    }
                })
                form.render();
            })

            //验证输入的密码是否相同；
            $("#pass2").blur(function() {
                var pass1 = $("#pass1").val();
                var pass2 = $("#pass2").val();
                if(pass1 != pass2) {
                    layer.msg("两次输入的密码不一致", {
                        "icon": 2,
                        "time": 2000
                    });
                    $("#pass2").val("");
                    return false;
                }
                return true;
            });
        });

        form.verify({
            userName: function(value){
                if(value.length < 5){
                    return '账号至少得5个字符';
                }
            }
            ,pass: [/^[\S]{6,12}$/,'密码必须6到12位，且不能出现空格']
            ,vercodes: function(value){
                //获取验证码
                var zylVerCode = $(".zylVerCode").html();
                if(value!=zylVerCode){
                    return '验证码错误（区分大小写）';
                }
            }
            ,content: function(value){
                layedit.sync(editIndex);
            }
        });

        form.on("submit(demo1)",function (data) {
            var formObj = document.getElementById("myForm");
            formObj.action="/user/login";
            formObj.method="post";
            formObj.submit();
        })

        form.on("submit(demo2)",function (data){
            var formObj = document.getElementById("myForm");
            formObj.action="/admin/login";
            formObj.method="post";
            formObj.submit();
        })

        //设置轮播主体高度
        var zyl_login_height = $(window).height()/1.3;
        var zyl_car_height = $(".zyl_login_height").css("cssText","height:" + zyl_login_height + "px!important");


        //Login轮播主体
        carousel.render({
            elem: '#zyllogin'//指向容器选择器
            ,width: '100%' //设置容器宽度
            ,height:'zyl_car_height'
            ,arrow: 'always' //始终显示箭头
            ,anim: 'fade' //切换动画方式
            ,autoplay: false //是否自动切换false true
            ,arrow: 'hover' //切换箭头默认显示状态||不显示：none||悬停显示：hover||始终显示：always
            ,indicator: 'none' //指示器位置||外部：outside||内部：inside||不显示：none
            ,interval: '5000' //自动切换时间:单位：ms（毫秒）
        });

        //监听轮播--案例暂未使用
        carousel.on('change(zyllogin)', function(obj){
            var loginCarousel = obj.index;
        });

        //粒子线条
        $(".zyl_login_cont").jParticle({
            background: "rgba(0,0,0,0)",//背景颜色
            color: "#fff",//粒子和连线的颜色
            particlesNumber:100,//粒子数量
            //disableLinks:true,//禁止粒子间连线
            //disableMouse:true,//禁止粒子间连线(鼠标)
            particle: {
                minSize: 1,//最小粒子
                maxSize: 3,//最大粒子
                speed: 30,//粒子的动画速度
            }
        });

    });

</script>
</body>
</html>

