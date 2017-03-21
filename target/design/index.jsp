<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="resources/js/jquery-3.2.0.js"></script>
    <style>
        html, body {
            margin: 0;
            padding: 0;
            height: 100%;
        }

        .frame-top {
            width: 100%;
            height: 48px;
        }

        .frame-right, .frame-left {
            width: 100%;
            height: 100%;
        }

        .div-bottom {
            width: 100%;
            height: 100%;
        }

        .div-left {
            height: 100%;
            width: 200px;
            float: left;
            background: #eeeeee;
            margin-left: -100%;
        }

        .div-right {
            width: 100%;
            height: 100%;
            background: white;
            float: left;
        }

        .div-right_in {
            margin-left: 200px;
            height: 100%;
        }
    </style>
</head>
<body>
<iframe frameborder="0" name="frame-top" class="frame-top" scrolling="no"></iframe>
<div class="div-bottom">
    <div class="div-right">
        <div class="div-right_in">
            <iframe frameborder="0" id="frame-right" name="frame-right" src="https://www.baidu.com" class="frame-right" scrolling="no"></iframe>
        </div>
    </div>
    <div class="div-left">
        <iframe frameborder="0" name="frame-left" src="left.jsp" class="frame-left" scrolling="no"></iframe>
    </div>
</div>
</body>
</html>
