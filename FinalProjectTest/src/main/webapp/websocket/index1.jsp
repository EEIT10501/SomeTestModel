<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>WebSocket P2P聊天範例</title>
</head>
<body>
	Welcome
	<br />
	<input id="text" type="text" />    
	<button onclick="send()">傳送訊息</button>
	<hr />
	<!--userno:發送消息方的編號-->
	傳送人
	<div id="userno">123</div>
	接收人：
	<input type="text" id="usernoto">
	<br>    
	<button onclick="closeWebSocket()">關閉WebSocket連線</button>
	<hr />
	<div id="message"></div>
</body>
<script src="../js/webSocketP2P.js"></script>
</html>