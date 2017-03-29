<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2017/3/21
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="resources/js/jquery-3.2.0.js"></script>
    <link rel="stylesheet" href="resources/css/bootstrap.min.css">
    <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
    <title>Title</title>
    <script>
        $(function () {
            $(".go").click(function () {
                var iFrame = $("#frame-right",window.parent.document);
                iFrame.attr("src","https://www.so.com");
            });
        })
    </script>
</head>
<body>
    <input type="button" value="go" class="go">
</body>
</html>
