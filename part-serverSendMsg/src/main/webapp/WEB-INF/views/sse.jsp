<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html" charset="UTF-8">
    <title>SSE Demo</title>
</head>
<body>
    <div id="msgFromPush">

    </div>
<script type="text/javascript" src="../static/js/jquery-3.2.1.js"></script>
<script>

    //EventSource对象只有新式的浏览器才有 EventSource是SSE的客户端
    window.onload = function(){
        if(!!window.EventSource){
            //push 为服务器的handler地址
            var source = new EventSource('push');
            var s = '';
            source.addEventListener('message', function(e){
                s+=e.data + "<br/>";
                $("#msgFromPush").html(s);
            });

            source.addEventListener('open', function (e) {
                console.info('连接打开。')
            }, false);

            source.addEventListener('error', function (e) {
                if (e.readyState = EventSource.CLOSED) {
                    console.info('连接关闭');
                } else {
                    console.info(e.readyState);
                }
            }, false);

        } else{
            console.info('你的浏览器不支持SSE');
        }
    }
</script>
</body>
</html>
