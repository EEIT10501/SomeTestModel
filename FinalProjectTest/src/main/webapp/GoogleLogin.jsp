<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="google-signin-scope" content="profile email">
<meta name="google-signin-client_id"
	content="784516300990-g9mc0al77s74lmmi0q6hb9777k3om0qj.apps.googleusercontent.com">
<script src="https://apis.google.com/js/platform.js" async defer></script>
</head>
<body>
	<div class="g-signin2" data-onsuccess="onSignIn" data-theme="dark"></div>
	<a href="#" onclick="signOut();">Sign out</a>
	<div id="show"></div>

	<script>
		function onSignIn(googleUser) {
			// 客戶端如果有需要的話可以通過profile來獲取使用者資訊
			var profile = googleUser.getBasicProfile();
			var showDiv = document.getElementById("show");
			var id_token = googleUser.getAuthResponse().id_token;

			showDiv.innerHTML = '<br>ID: ' + profile.getId() + '<br>Name: '
					+ profile.getName() + '<br>Image URL: '
					+ profile.getImageUrl() + '<br>Email: '
					+ profile.getEmail() + '<br>id_token:' + id_token;
			// 傳回後臺驗證，並獲取userid，可改用jQuery、AJAX
			// Controller寫法參考 https://www.itread01.com/content/1541820309.html
			// var id_token = googleUser.getAuthResponse().id_token;
			// console.log("ID Token: " + id_token);
			// var xhr = new XMLHttpRequest();
			// xhr.open('POST', 'http://gntina.iok.la/googleVerify');
			// xhr.setRequestHeader('Content-Type',	'application/x-www-form-urlencoded');
			// xhr.onload = function() {
			// 	console.log('Signed in as: ' + xhr.responseText);
			// };
			// xhr.send('idtokenstr=' + id_token);
		};

		function signOut() {
			var auth2 = gapi.auth2.getAuthInstance();
			auth2.signOut().then(function() {
				console.log('User signed out.');
				var showDiv = document.getElementById("show");
				showDiv.innerHTML = "<br>用戶已登出"
			});
		}
	</script>
</body>
</html>