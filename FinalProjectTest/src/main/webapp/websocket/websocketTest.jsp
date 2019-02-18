<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>WebSocket Test</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="../js/webSocket.js"></script>
</head>
<body>
	<div>
		<form id="chatRoomForm" onsubmit="return false;">
			聊天室 名字: 
			<input type="text" id="userNameInput" />
			<input type="button" id="loginBtn" value="登入" />
			<span id="infoWindow"></span>
			<input type="text" id="userinput" />
			<input type="submit" value="送出訊息" />
		</form>
	</div>
	<div id="messageDisplay"></div>
</body>
</html>