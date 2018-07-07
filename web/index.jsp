<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/5
  Time: 23:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <script type="text/javascript">
      function getCity(id){
          //alert(id);
          // 通过ajax将请求提交到服务器
          var xmlhttp = new XMLHttpRequest();
          xmlhttp.open("GET","ajax?id="+id,true);
          xmlhttp.send();
          // 获取响应的数据
          xmlhttp.onreadystatechange = function(){
              if(xmlhttp.readyState == '4' && xmlhttp.status=='200'){
                  // 获取返回的数据同时转化成为一个json数组
                  var res = eval(xmlhttp.responseText);
                  var city = document.getElementById("myCity");
                  city.length = 0 ;
                  for(var i = 0 ; i < res.length;  i ++){
                      var obj = res[i];
                      var opt = document.createElement("option");
                      opt.innerHTML=obj.name;
                      // 将option添加到select中
                      city.appendChild(opt);
                  }
              }
          }
      }

  </script>

  <!--
      1.触发第一个下拉列表的选择事件
      2.通过ajax将用户选择选项传递个服务器
      3.服务器得到请求后将对应的数据返回个客户端
      4.客户端得到信息后将数据显示在第二个下拉列表中

   -->
  省份:<select onchange="getCity(this.value);">
    <option value="0">请选择省份</option>
    <option value="1">广东省</option>
    <option value="2">福建省</option>
  </select>
  城市:<select id="myCity">
    <option value="0">请选择城市</option>
  </select>
  </body>

</html>
