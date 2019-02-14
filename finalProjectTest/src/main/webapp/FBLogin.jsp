<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>第三方登入</title>
</head>
<body>
	<!--jQuery-->
	<script
		src='//ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js'></script>
	<!--Bootstrap-->
	<link
		href='//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'
		rel='stylesheet'></link>

	<!--登入、登出按鈕-->
	<button id="FB_login" class="btn btn-large btn-primary">FB 登入</button>
	<button id="FB_logout" class="btn btn-large btn-warning">FB 登出</button>

	目前狀態：
	<span id="FB_STATUS_2"></span>

	<script>
		window.fbAsyncInit = function() {
			FB.init({
				appId : '305413036993160', // 填入 FB APP ID
				cookie : true,
				xfbml : true,
				version : 'v3.2'
			});

			FB.getLoginStatus(function(response) {
				statusChangeCallback(response);
			});
		};

		// 處理各種登入身份
		function statusChangeCallback(response) {
			console.log(response);
			var target = document.getElementById("FB_STATUS_2"), html = "";

			// 登入 FB 且已加入會員
			if (response.status === 'connected') {
				html = "已登入 FB，並加入您的應用程式<br/>";

				FB.api('/me?fields=id,name,email', function(response) {
					console.log(response);
					html += "會員姓名：" + response.name + "<br/>";
					html += "會員 email：" + response.email + "<br/>";
					html += "會員識別ID：" + response.id;
					target.innerHTML = html;
				});
			}

			// 登入 FB, 未偵測到加入會員
			else if (response.status === "not_authorized") {
				target.innerHTML = "已登入 FB，但未加入您的應用程式";
			}

			// 未登入 FB
			else {
				target.innerHTML = "未登入 FB";
			}
		}

		// 點擊登入
		$("#FB_login").click(function() {
			// 進行登入程序
			FB.login(function(response) {
				statusChangeCallback(response);
			}, {
				scope : 'public_profile,email'
			});
		});

		// 點擊登出
		$("#FB_logout").click(function() {
			FB.logout(function(response) {
				statusChangeCallback(response);
			});
		});

		// 載入 FB SDK
		(function(d, s, id) {
			var js, fjs = d.getElementsByTagName(s)[0];
			if (d.getElementById(id))
				return;
			js = d.createElement(s);
			js.id = id;
			js.src = "https://connect.facebook.net/zh_TW/sdk.js";
			fjs.parentNode.insertBefore(js, fjs);
		}(document, 'script', 'facebook-jssdk'));
	</script>
</body>
</html>