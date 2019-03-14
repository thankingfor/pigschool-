<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <!-- jquery -->
  <script src="${pageContext.request.contextPath}/lib/jquery/jquery-3.2.1.min.js"></script>
  <!-- bootstrap -->
  <script src="${pageContext.request.contextPath}/lib/bootstrap/bootstrap.min.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/bootstrap/bootstrap.min.css">

  <!-- md icon -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/md-fonts/css/materialdesignicons.min.css">
  <!-- xyz -->
   <script type="text/javascript">
    var loca = "${pageContext.request.contextPath}";
  </script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/xyz_tpl/topbar/topbar.css">
  <script src="${pageContext.request.contextPath}/lib/xyz_tpl/topbar/topbar.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/xyz_tpl/top_btn/top_btn.css">
  <script src="${pageContext.request.contextPath}/lib/xyz_tpl/top_btn/top_btn.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/xyz_tpl/footer/footer.css">
  <!-- fileinput -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/fileinput/fileinput.css">
  <script src="${pageContext.request.contextPath}/lib/fileinput/fileinput.min.js"></script>
  <script src="${pageContext.request.contextPath}/lib/fileinput/zh.js"></script>
  <script src="${pageContext.request.contextPath}/lib/fileinput/theme.min.js"></script>
  <link href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
  <!-- self -->
  <script type="text/javascript">
  var loca="${pageContext.request.contextPath}";
  var itemid="${user.id}";
  </script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/Publish/publish.css">
  <script src="${pageContext.request.contextPath}/Publish/publish.js"></script>

  <title>发布二手</title>
</head>

<body>
  <!-- Topbar -->
  <nav id="topbar" class="navbar navbar-expand-lg navbar-light bg-warning nav-shadow">

    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
      aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
      <span class="navbar_toggler_title">菜单</span>
    </button>
    <button class="navbar-toggler home_btn" type="button">
      <span class="mdi mdi-home"></span>
      <span class="navbar_toggler_title">主页</span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
            aria-haspopup="true" aria-expanded="false">
            <span class="mdi mdi-near-me d-none d-sm-block"></span>板块导航
          </a>
          <div class="dropdown-menu" aria-labelledby="navbarDropdown">
            <a class="dropdown-item" href="#">发布需求</a>
            <a class="dropdown-item" href="#">供给市场</a>
            <a class="dropdown-item" href="../Index/index.jsp">二手市场</a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">首 页</a>
          </div>
        </li>
      </ul>
      <div class="title d-none d-md-block">
        校园猪&nbsp;|&nbsp;
        <span class="school_name">${user.school}</span>
      </div>

      <a class="nav_btn">
        <span class="mdi mdi-apple-keyboard-caps"></span> 我发布的
      </a>
      <a class="nav_btn">
        <span class="mdi mdi-cards-heart"></span> 我想要的
      </a>
      <a class="nav_btn">
        <span class="mdi mdi-folder-star"></span> 收藏
      </a>

      <div id="user_list">
        <a id="user_name">
          <span class="name">${user.name}</span>
          <img id="user_head" src=""></img>
          <span class="badge badge-pill badge-primary">8</span>
        </a>

        <div id="user_info">
          <ul>
            <li class="user_list_btn">
              <a>用户消息</a>
              <span id="user_msg" class="badge badge-warning">4</span>
            </li>
            <li class="user_list_btn">
              <a>系统通知</a>
              <span id="sys_msg" class="badge badge-warning">4</span>
            </li>
            <li class="user_list_btn">
              <a>注销</a>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </nav>
  <!-- TopBar -->

  <!-- 标题 -->
  <div id="publish_banner" class="container">
    <div class="row">
      <div class="col-12" class="title">
        <div>二手物品发布</div>
        <div class="subtitle">- 请确保信息真实有效 -</div>
      </div>
    </div>
  </div>

  <!-- 填写信息 -->
  <form id="item_info"  action="${pageContext.request.contextPath}/publishs" method="post"  class="container" enctype="multipart/form-data">
    <!-- STEP PART1 -->
    <input type="hidden" name="sellerid" value="${user.id}">
    <div class="step row" style="margin-top: 0;margin-bottom: 2rem">
      <div>- Step1. 添加商品的基本信息 -</div>
    </div>
    <!-- 商品标题 -->
    <div class="row">
      <div class="form-group col-12">
        <label for="item_title">发布标题</label>
        <input class="form-control" type="text" name="title" id="item_title">
      </div>
    </div>
    <!-- 商品描述 -->
    <div class="row">
      <div class="form-group col-12">
        <label for="description">商品描述</label>
        <textarea class="form-control" name="description" id="description" rows="6" placeholder="请花一些时间来详细描述一下你的商品信息吧，信息越详细售出的概率越高哦！"></textarea>
      </div>
    </div>
    <!-- 商品原价、价格、成色 -->
    <div class="row">
      <div class="form-group col-6 col-md-4">
        <label for="price">售价</label>
        <input class="form-control" type="text" name="price" id="price">
        <small class="form-text text-muted">您想出售的价格</small>
      </div>
      <div class="form-group col-6 col-md-4">
        <label for="oldPrice">原价</label>
        <input class="form-control" type="text" name="oldprice" id="oldPrice">
        <small class="form-text text-muted">您购买该商品时的价格</small>
      </div>
      <div class="form-group col-12 col-md-4">
        <label for="condition">物品成色</label>
        <input class="form-control" type="text" name="conditions" id="condition">
        <small class="form-text text-muted">填写1~10的数字，请看下方的详细说明</small>
      </div>
    </div>
    <!-- 帮助菜单 - 成色说明 -->
    <div class="alert alert-warning alert-dismissible fade show help" role="alert">
        <span class="mdi mdi-alert"></span><strong>成色说明：</strong> 物品成色分为<span>1~10</span>个等级代表二手物品的新旧程度。其中<span>1~3</span>代表商品已经无法正常使用，<span>4~6</span>代表商品部分功能无法使用，<span>7~9</span>代表商品功能正常，<span>10</span>代表该商品为全新
      <button type="button" class="close" data-dismiss="alert" aria-label="Close">
        <span aria-hidden="true">&times;</span>
      </button>
    </div>


    <!-- STEP PART2 -->
    <div class="step row">
      <div>- Step2. 为商品添加图片 -</div>
    </div>
    <div id="upload_box" class="row">
      <div class="col-xl-3 box">
        <label for="upload_cover">商品封面</label>
        <input type="file" id="upload_cover" name="file" data-preview-file-type="text" accept="image/jpeg,image/jpg,image/png">
      </div>
      <div class="col-xl-9 box">
        <label for="upload_pic">请再上传几商品图片</label>
        <input type="file" id="upload_pic" name="files" data-preview-file-type="text" accept="image/jpeg,image/jpg,image/png"
          multiple="multiple">
      </div>
    </div>


    <!-- STEP PART3 -->
    <div class="step row">
      <div>- Step3. 留下你的联系方式 -</div>
    </div>
    <div id="seller_info" class="row">

      <div class="form-group col-md-5">
        <label for="sellername">称呼</label>
        <input class="form-control" type="text" name="sellername" id="sellerName" placeholder="您希望对方在交易时怎么称呼您">
      </div>

      <div class="form-group col-4 col-md-2">
        <label for="sellerContactWay">联系方式</label>
        <select name="sellercontactway" id="sellerContactWay" class="form-control">
          <option value="3" selected>手机</option>
          <option value="1">QQ</option>
          <option value="2">微信</option>
        </select>
      </div>
      <div class="form-group col-8 col-md-5">
        <label for="sellercontact">联系号码</label>
        <input type="text" name="sellercontact" class="form-control" id="sellerContact" placeholder="填写联系方式对应的号码">
      </div>

    </div>
    <div class="alert alert-warning alert-dismissible fade show help" role="alert">
        <span class="mdi mdi-alert"></span><strong>说明：</strong>为保护您的隐私，您的联系方式不会显示在商品信息页面中，只有在买家选择与您交换信息后才会向买家展示。
      <button type="button" class="close" data-dismiss="alert" aria-label="Close">
        <span aria-hidden="true">&times;</span>
      </button>
    </div>
  <button type="submit" id="publish_btn" class="btn btn-primary">确认发布</button>
  </form>

  
</body>

<!-- 底部 -->
<footer id="footer">
    <div class="container">
      <div class="row">
        <div class="col-md-6">
          <img class="img_bg" src="${pageContext.request.contextPath}/Data/SecondHand/System/foot_bg.png" alt="">
        </div>
        <div class="col-md-6">
          <div class="footer_text">
            <h1>校园猪 | SchoolPig</h1>
            <h2>感谢你的加入</h2>
            <hr>
            <h3>SchoolPig @ 2018</h3>
          </div>
        </div>
      </div>
    </div>
  </footer>

</html>