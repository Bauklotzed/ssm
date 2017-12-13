<%--
  Created by IntelliJ IDEA.
  User: Zed
  Date: 2017/12/12
  Time: 22:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>detail</title>
</head>
<script type="text/javascript">

    var xmlhttp;

    // 创建XMLHTTPRequest对象
    function createXMLHTTPRequest(){
        if(window.ActiveXObject){//如果当前浏览器为IE
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP")
        }else if(window.XMLHttpRequest){//如果是其他浏览器
            xmlhttp = new XMLHttpRequest();
        }else{
            alert("Your brower does not support XMLHttp");
        }
    }

    //http://blog.csdn.net/thl331860203/article/details/7196690
    function getInfo(){
        var studentId = document.getElementById("studentId").value;
        var statement = "studentId=" + studentId;
        //var url = "/book/${book.bookId}/appoint?studentId=" + studentId;
        var url = "/book/${book.bookId}/appoint";
        //console.log(url);
        //console.log(statement);
        createXMLHTTPRequest();
        xmlhttp.onreadystatechange = returnInfo;
        xmlhttp.open("POST", url, true);

        //http://blog.csdn.net/mhmyqn/article/details/25561535
        xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

        xmlhttp.send(statement);
    }

    function returnInfo(){
        if(xmlhttp.readyState == 4 && xmlhttp.status == 200){
            var info = xmlhttp.responseText;
            eval("var json=" + info);
            var success = json.success;
            eval("var data=" + JSON.stringify(json.data));
            //var data = json.data;
            var error = json.error;
            //console.log("success:" + success);
            console.log("data:" + data.state);
        }
    }

</script>
<body>
ID:${book.bookId}<br/>
书名:${book.name}<br/>
库存:${book.number}<br/>
<input id="studentId" type="text" name="studentId" />
<input id="submit" type="button" value="appoint" onclick="getInfo();" />
</body>
</html>
