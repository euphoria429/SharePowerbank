<%--
  Created by IntelliJ IDEA.
  User: 13545
  Date: 2021/6/26
  Time: 18:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>注销成功</title>
</head>
<body>
<h1 style="text-align: center">注销成功，三秒后跳转<span id="remainSeconds">3</span></h1>
</body>

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
