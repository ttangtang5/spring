<%--
  Created by IntelliJ IDEA.
  User: RLY
  Date: 2018/12/14
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>servlet async support</title>
</head>
<body>
    <script type="text/javascript" src="../static/js/jquery-3.2.1.js"></script>
    <script>

        window.onload = function(){
            deferred();
        }

        function deferred(){
            $.get('defer', function(data){
                console.info(data);
                deferred();
            })
        }
    </script>
</body>
</html>
