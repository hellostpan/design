<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2017/3/23
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="resources/js/jquery-3.2.0.js"></script>
<html>
<head>
    <title>Title</title>
    <style>
        .show-image{

        }
    </style>
    <script>
        $(function () {
            $(".file1").change(function (e) {
                //获取文件的大小
                var files = e.target.files;
                if(files.length){
                    var file = files[0];
                    console.log("file.size: "+file.size/1024);

                    //图片压缩，长宽
                    var image = $(".show-image");
                    var imageScale = $(".show-image-scale");
                    var reader = new FileReader();
                    reader.onload = function () {
                        image.attr("src",this.result);
                        var width = image.width();
                        var height = image.height();
                        console.log(width+" --- "+height);
                        var canvas = document.createElement("canvas");
                        var ctx = canvas.getContext("2d");
                        canvas.width = width/2;
                        canvas.height = height/2;
                        ctx.drawImage(image[0],0,0,width/2,height/2);
                        console.log("size: "+this.result.length/1024);
                        var base64 = canvas.toDataURL('image/jpeg',0.5);
                        console.log("size: "+base64.length/1024);
                        imageScale.attr("src",base64);

                    };
                    reader.readAsDataURL(file);
                }
                //
            });
        })
    </script>
</head>
<body>
    <input type="file" class="file1"><br>
    <img class='show-image' /><br>
    <img class='show-image-scale' />
</body>
</html>
