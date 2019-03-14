<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>校园猪-赚钱在校园</title>
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery/jquery-3.2.1.min.js"></script>
  <!-- bootstrap -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/bootstrap/bootstrap.min.css">
  <script src="${pageContext.request.contextPath}/lib/bootstrap/bootstrap.min.js"></script>
  <!--私有-->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/animate/animate.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Login//login.css" />
  <script  src="${pageContext.request.contextPath}/Login/login.js">
  </script>
  <script type="text/javascript">
  var loca="${pageContext.request.contextPath}";
  </script>
</head>

<body>
  <div id="main_box" class="clear container">
    <div class="row">

      <div id="left_box" class="col-md-6">
        <div id="logo"></div>
        <div id="left_title">Welcome to</div>
        <div id="left_subtitle">校园猪：二手市场</div>
        <div id="hitokoto">
          <div id="hitokoto_title">Hitokoto · 一言</div>
          <div id="hitokoto_text"></div>
          <div id="hitokoto_from"></div>
        </div>
        <div id="footer"><span>SchoolPig @ 2018</span><a href="#">用户使用条例</a></div>
      </div>


      <div id="right_box" class="col-md-6">
        <form id="login_box" >
          <div class="title">登 录</div>
          <div class="subtitle">登录校园猪后您可以发布校园需求信息，<br>以及浏览校园猪需求市场和二手市场，开启完整的体验。</div>
          <div id="login_form">
            <label for="name" class="subtitle">用户名</label>
            <input type="text" name="name" id="name" class="input_text">
            <label for="password" class="subtitle">密码</label>
            <input type="password" name="password" id="password" class="input_text">
            <div id="checkbox" class="clear">
              <input type="checkbox" name="remember_me" id="remember_me">
              <label for="remember_me">记住我</label>
              <a id="forget_btn" href="#">忘记密码?</a>
            </div>
            <input id="login_btn" class="log_reg_btn" type="button" value="登 录">
            <a href="#login_box" id="goto_register" class="goto_log_reg">快速注册</a>
          </div>
        </form>

        <form id="register_box" >
          <div class="title">快速注册</div>
          <div id="register_form">
            <label for="reg_name" class="subtitle">用户名</label>
            <input type="reg_name" name="name" id="reg_name" class="input_text">
            <label for="reg_realName" class="subtitle">真实姓名</label>
            <input type="reg_realName" name="realname" id="reg_realName" class="input_text">
            <label for="phone" class="subtitle">手机号</label>
            <input type="text" name="phone" id="reg_phone" class="input_text">
            <label for="password" class="subtitle">密码</label>
            <input type="password" name="password" id="reg_password" class="input_text">
            <label for="password" class="subtitle">确认密码</label>
            <input type="password"  id="reg_repassword" class="input_text">
            <input id="register_btn" class="log_reg_btn" type="button" value="注 册">
            <a href="#login_box" id="goto_login" class="goto_log_reg">返回登录</a>
          </div>
        </form>

      </div>

    </div>
  </div>

  <div id="alert" class="alert alert-danger" role="alert">
    警告信息
  </div>
</body>

</html>