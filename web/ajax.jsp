<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/5
  Time: 23:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ajax</title>
</head>
<script type="text/javascript">
    // 通过ajax提交请求
    function abcFun(){
        // 1.获取一个XMLHttpRequest对象
        var xmlhttp = new XMLHttpRequest();
        // 2.提交请求 GET 提交方式  TestServlet提交的地址  true表示异步提交
        xmlhttp.open("GET","ajax1",true);
        xmlhttp.send();
        // 3.获取客户端的响应
        xmlhttp.onreadystatechange = function(){
            /**
             0: 请求未初始化
             1: 服务器连接已建立
             2: 请求已接收
             3: 请求处理中
             4: 请求已完成，且响应已就绪
             */
            // 获取相关的数据
            //alert(xmlhttp.readyState+" "+xmlhttp.status);
            if(xmlhttp.readyState =='4' && xmlhttp.status =='200'){
                // 表示请求成功并返回了数据
                alert(xmlhttp.responseText);
            }
        }
    }

</script>
<body>
<input type="button" value="提交请求" onclick="abcFun();"><br/>
<input type="text" >
时间:<%=new Date() %>
</body>
</html>
