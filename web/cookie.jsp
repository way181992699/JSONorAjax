<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/7
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>cookie</title>

</head>
<script type="text/javascript">
    function init() {
        /* decodeURI（），解密（解码）函数*/
         var cookie = decodeURI(document.cookie);


        alert(cookie);
        var  c = cookie.split(";")

        for (var i = 0; i < c.length; i++) {
            var data = c[i].split("=");
            if (data[0] == 'userName') {
                document.getElementById("userName").value =data[1];
            } else {
                document.getElementById("password").value = data[1];
            }

        }

    }

</script>
<body onload="init();">
<div>

    <form action="cookie" method="get">
        用户名：<input type="text" name="userName" id="userName"><br/>
        密码：<input type="password" name="password" id="password"><br/>
        <input type="submit" value="提交">
    </form>
</div>
</body>
</html>
