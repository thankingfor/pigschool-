<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <!-- jquery -->
  <script src="${pageContext.request.contextPath}/lib/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>
  <!-- bootstrap -->
  <script src="${pageContext.request.contextPath}/lib/bootstrap/bootstrap.min.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/bootstrap/bootstrap.min.css">

  <!-- md icon -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/md-fonts/css/materialdesignicons.min.css">
  <!-- xyz -->
  <script type="text/javascript">
    var loca = "${pageContext.request.contextPath}";
    var itemid="${user.id}";
  </script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/xyz_tpl/topbar/topbar.css">
  <script src="${pageContext.request.contextPath}/lib/xyz_tpl/topbar/topbar.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/xyz_tpl/top_btn/top_btn.css">
  <script src="${pageContext.request.contextPath}/lib/xyz_tpl/top_btn/top_btn.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/xyz_tpl/footer/footer.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/xyz_tpl/search_bar/search_bar.css">
  <script src="${pageContext.request.contextPath}/lib/xyz_tpl/search_bar/search_bar.js"></script>
  <!-- self -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/Search/search.css">
  <script src="${pageContext.request.contextPath}/Search/search.js" type="text/javascript"></script>
  <title>搜索</title>
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

  <!-- 搜索框 -->
  <div id="search_box">
    <div id="index_subtitle">二手物品发布 & 交易市场</div>
    <button id="publish" class="btn btn-outline-light" type="button">
      <img src="" alt="">
      <a href="../Publish/publish.html">发布物品</a>
    </button>
    <form id="search" class="container" action="">
      <div class="input-group">
        <input id="search_input" type="text" class="form-control" placeholder="搜索你想要的东西" aria-label="Search what you want"
          aria-describedby="basic-addon2">
        <div class="input-group-append">
          <button class="btn btn-outline-light" type="button">
            搜索
            <span class="mdi mdi-magnify"></span>
          </button>
        </div>
      </div>
      <div id="associative_box" class="row col-12 col-sm-6 mt-2">
        <ul id="associative_list"></ul>
      </div>
    </form>
  </div>
  <!-- 搜索框 -->

  <!-- 标题 -->
  <div id="big_title" class="container">
    <div class="row">
      <div class="col-12 title">搜索结果<span class="mdi mdi-cloud-search-outline"></span></div>
    </div>
  </div>

  <!-- 搜索列表 -->
  <div id="search_list" class="container">

    <div class="item_list">
      <div class="row">
        <div id="noFound" class="col-12">
          <div class="icon"><span class="mdi mdi-cloud-question"></span></div>
          <div class="title">
            Emmmmm 抱歉 ......
            <br>
            <span>目前还没有人发布您想要搜索的商品</span>
          </div>
        </div>

        <!-- 商品模板 -->
        <c:forEach items="${searchItem }" var="searchItem">
        <div class="item col-6 col-lg-3">
          <div class="item_innerbox">
            <div class="img_border">
              <img src="../Data/SecondHand/Item/1001/cover" alt="">
            </div>
            <div class="price_box clearfix">
              <div class="percent"></div>
              <div class="price clearfix">
                <div class="now">￥${searchItem.price}</div>
                <div class="old">￥${searchItem.oldprice}</div>
              </div>
            </div>
            <div class="item_title">
              <a>${searchItem.title}</a>
            </div>
            <div class="seller clearfix">
              <div class="seller_name">
                <span class="mdi mdi-account-box"></span>${searchItem.name}
              </div>
              <div class="seller_level">信誉等级：<span>${searchItem.level}</span></div>
            </div>
          </div>
        </div>
        </c:forEach>
        <!-- --------- -->

      </div>
    </div>
  </div>

  <!-- 标题 -->
  <div id="big_title_bottom" class="container">
    <div class="row">
      <div class="col-12 title">什么都没有了哦<span class="mdi mdi-playlist-check"></span></div>
    </div>
  </div>

</body>

</html>