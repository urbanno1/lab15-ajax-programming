<%--
  Created by IntelliJ IDEA.
  User: Eduur
  Date: 9/20/2019
  Time: 11:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<h1>Welcome to guest page</h1>

<p>Enter a name to be added to the guest list </p>
<p>First <input id='first' type='text' name='first'  /></p>
<p>Last <input id='last' type='text' name='last'  /></p>
<p><input id='send' type='button' value='Send'  /></p>
<p>Names so far</p>
<div id='guestList' ></div>

<script src="JQuery.3.4.1.js"></script>
<script src="guest.js" ></script>
</body>
</html>
