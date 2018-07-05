<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/5
  Time: 23:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSON</title>
</head>
<script type="text/javascript">
    // 1.json对象
    var j1 = {"sid":1,"sname":"张三"};
    document.write(j1.sid+" "+j1.sname+"<br/>");
    // 2.json数组
    var j2 = [{"sid":2,"sname":"张三"},{"sid":2,"sname":"张三"},{"sid":3,"sname":"张三"}];
    for(var i =0 ; i < j2.length; i++){
        document.write(j2[i].sid+" "+j2[i].sname+"<br/>");
    }
    // 3.json对象格式的字符串
    var j3 = '{"sid":100,"sname":"张三"}'; // "1+2"
    // 如果是json对象格式的字符串用eval方法的时候需要给字符串前后加"()"括起来
    var j4 = eval("("+j3+")");
    document.write(j4.sid+" "+j4.sname+"<br/>");
    // 4.json数组格式的字符串
    var j5 = '[{"sid":2,"sname":"张三"},{"sid":2,"sname":"张三"},{"sid":3,"sname":"张三"}]';
    var j6 = eval(j5);
    for(var i =0 ; i < j6.length; i++){
        document.write(j6[i].sid+" "+j6[i].sname+"<br/>");
    }

</script>
<body>

</body>
</html>
