<%--
  Created by IntelliJ IDEA.
  User: 13545
  Date: 2021/6/22
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>跳转...</title>
</head>
<body>
登录失败，三秒后跳转
</body>
<span id="remainSeconds">3</span>
<script type="text/javascript">
    var sec = 3;
    function jump(){
        sec--;
        if(sec > 0){
            document.getElementById('remainSeconds').innerHTML = sec;
            setTimeout(this.jump,1000);
        }else{
            window.location.href = '../index.jsp';
        }
    }
    setTimeout(jump,1000);
</script>
</html>
