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
    var itemid = "${user.id}";
  </script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/xyz_tpl/topbar/topbar.css">
  <script src="${pageContext.request.contextPath}/lib/xyz_tpl/topbar/topbar.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/xyz_tpl/top_btn/top_btn.css">
  <script src="${pageContext.request.contextPath}/lib/xyz_tpl/top_btn/top_btn.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/xyz_tpl/footer/footer.css">
  <!-- self -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/User/user.css">
  <script src="${pageContext.request.contextPath}/User/user.js" type="text/javascript"></script>
  <title>Document</title>
  <script src="${pageContext.request.contextPath}/User/user_gloable.js"></script>
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
          <img id="user_head" src="../Data/User/Default/head"></img>
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


  <!-- 模态框组 -->
  <div class="modal fade" id="ensure_publish_sold" tabindex="-1" role="dialog" aria-labelledby="publish_sold_title"
    aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="publish_sold_title">提醒</h5>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="modal-body">
          您确定该商品已被卖出吗？
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-dismiss="modal">取消</button>
          <button onclick="publish_sold()" type="button" class="btn btn-primary">确定</button>
        </div>
      </div>
    </div>
  </div>
  <div class="modal fade" id="ensure_publish_delete" tabindex="-1" role="dialog" aria-labelledby="publish_delete_title"
    aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="publish_delete_title">提醒</h5>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="modal-body">
          您确定下架该商品吗？
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-dismiss="modal">取消</button>
          <button onclick="publish_delete()" type="button" class="btn btn-primary">确定</button>
        </div>
      </div>
    </div>
  </div>
  <div class="modal fade" id="ensure_publish_sold" tabindex="-1" role="dialog" aria-labelledby="publish_sold_title"
    aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="publish_sold_title">提醒</h5>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="modal-body">
          您确定该商品已被卖出吗？
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-dismiss="modal">取消</button>
          <button onclick="publish_sold()" type="button" class="btn btn-primary">确定</button>
        </div>
      </div>
    </div>
  </div>
  <div class="modal fade" id="ensure_want_delete" tabindex="-1" role="dialog" aria-labelledby="want_delete_title"
    aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="want_delete_title">提醒</h5>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="modal-body">
          您确定删除该商品吗？
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-dismiss="modal">取消</button>
          <button onclick="want_delete()" type="button" class="btn btn-primary">确定</button>
        </div>
      </div>
    </div>
  </div>
  <div class="modal fade" id="seller_info" tabindex="-1" role="dialog" aria-labelledby="seller_info_title" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="seller_info_title">卖家信息</h5>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="modal-body">
          <div id="seller_name">
            卖家称呼：<span>SellerName</span>
          </div>
          <div id="seller_contact">
            联系方式：
            <span>Contact</span>
            <span class="badge badge-pill badge-primary">ContactWay</span>
          </div>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
        </div>
      </div>
    </div>
  </div>


  <!-- 主要 -->
  <div id="main_box" class="container">
    <ul class="nav nav-pills mb-3" id="pills-tab" role="tablist">
      <li class="nav-item">
        <a class="nav-link active" id="info_tab" data-toggle="pill" href="#info" role="tab" aria-controls="info"
          aria-selected="true">个人信息</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" id="publish_tab" data-toggle="pill" href="#publish" role="tab" aria-controls="publish"
          aria-selected="false">我发布的</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" id="want_tab" data-toggle="pill" href="#want" role="tab" aria-controls="want" aria-selected="false">我想要的</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" id="collection_tab" data-toggle="pill" href="#collection" role="tab" aria-controls="collection"
          aria-selected="false">收藏</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" id="userMsg_tab" data-toggle="pill" href="#userMsg" role="tab" aria-controls="userMsg"
          aria-selected="false">用户消息</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" id="sysMsg_tab" data-toggle="pill" href="#sysMsg" role="tab" aria-controls="sysMsg"
          aria-selected="false">系统通知</a>
      </li>
    </ul>
    <div class="tab-content" id="pills-tabContent">
      <!-- 个人信息 -->
      <div class="tab-pane fade" id="info" role="tabpanel" aria-labelledby="info_tab">
        <div class="row">
          <div id="user_img_name" class="col-md-6">
            <div class="inner">
              <img id="user_head_preview" src="../Data/User/Default/head" alt="" srcset="">
              <div id="user_info_name">${user.name}</div>
            </div>
          </div>
          <div class="col-md-6" id="user_info_box">
            <form id="ss1">
              <fieldset disabled>
                <input type="hidden" name="id" value="${user.id}">
                <div class="row">
                  <div class="form-group col-6">
                    <label for="userName">用户名</label>
                    <input type="text" id="name" name="name" class="form-control" value="${user.name}">
                  </div>

                  <div class="form-group col-6">
                    <label for="realName">真实姓名</label>
                    <input type="text" id="realname" name="realname" class="form-control" value="${user.realname}">
                  </div>
                </div>

                <div class="form-group">
                  <label for="school">所在学校</label>
                  <input type="text" id="school" name="school" class="form-control" value="${user.school}">
                </div>

                <div class="form-group">
                  <label for="phone">联系电话</label>
                  <input type="text" id="phone" name="phone" class="form-control" value="${user.phone}">
                </div>

                <div class="form-group">
                  <label for="qq">QQ</label>
                  <input type="text" id="qq" name="qq" class="form-control" value="${user.qq}">
                </div>

                <div class="form-group">
                  <label for="wechat">微信</label>
                  <input type="text" id="wechat" name="wechat" class="form-control" value="${user.wechat}">
                </div>
                <div class="file_btn">
                  <input type="file" id="file" name="file" onchange="showPreview(this)" />
                  <button class="btn btn-success">修改头像</button>
                </div>
              </fieldset>
              <div class="btn_box">
                <button id="change" class="btn btn-danger" type="button">更改信息</button>
                <button id="submit_change" class="btn btn-" type="button" disabled>提交更改</button>
              </div>
            </form>
          </div>
        </div>
      </div>
      <!-- 我发布的 -->
      <div class="tab-pane fade" id="publish" role="tabpanel" aria-labelledby="publish_tab">
        <div class="row">

          <!-- 模板 -->
          <c:forEach items="${userpublish}" var="userpublish">

            <div class="item_card col-lg-6" item_id="${userpublish.id}">
              <div class="row">
                <div class="img_box col-4">
                  <img class="item_img" src="" test="1111">
                </div>
                <div class="item_info col-8">
                  <div class="title">
                    ${userpublish.title}
                  </div>
                  <div class="price_box clearfix">
                    <div id="oldPrice" class="price_inner">
                      <span class="title">原价:</span>
                      ￥<span class="num">${userpublish.oldprice}</span>
                    </div>
                    <div id="price" class="price_inner">
                      <span class="title">现价:</span>
                      ￥<span class="num">${userpublish.price}</span>
                    </div>
                  </div>
                </div>
              </div>
              <div class="btn_box clearfix">
                <div class="publish_sold button badge-secondary" data-toggle="modal" data-target="#ensure_publish_sold">
                  <span class="mdi mdi-cash-usd"></span>
                </div>
                <div class="publish_delete button badge-danger">
                  <span class="mdi mdi-delete"></span>
                </div>
              </div>
            </div>

          </c:forEach>
          <!-- 模板 -->

        </div>

      </div>

      <!-- 我想要的 -->
      <div class="tab-pane fade" id="want" role="tabpanel" aria-labelledby="want_tab">
        <div class="row">
          <c:forEach var="userwant" items="${userwant}">
            <!-- 模板 -->
            <div class="item_card col-lg-6" item_id="${userwant.id}" item_sellerName="${userwant.sellername}" item_contact="${userwant.sellercontact}" item_contactWay="${userwant.sellercontactway}" >
              <div class="row">
                <div class="img_box col-4">
                  <img class="item_img" src="" test="1111">
                </div>
                <div class="item_info col-8">
                  <div class="title">
                    ${userwant.title}
                  </div>
                  <div class="price_box clearfix">
                    <div id="oldPrice" class="price_inner">
                      <span class="title">原价:</span>
                      ￥<span class="num">${userwant.oldprice}</span>
                    </div>
                    <div id="price" class="price_inner">
                      <span class="title">现价:</span>
                      ￥<span class="num">${userwant.price}</span>
                    </div>
                  </div>
                </div>
              </div>
              <div class="btn_box clearfix">
                <div class="seller_info button badge-primary" data-toggle="modal" data-target="#seller_info">
                  <span class="mdi mdi-account"></span>
                </div>
                <div class="want_delete button badge-danger">
                  <span class="mdi mdi-delete"></span>
                </div>
              </div>
            </div>
            <!-- 模板 -->
          </c:forEach>

        </div>
      </div>

      <!-- 收藏 -->
      <div class="tab-pane fade" id="collection" role="tabpanel" aria-labelledby="collection_tab">
        我知道你想看收藏，但是真开发不完了，理解一下吧 இдஇ
      </div>

      <!-- 用户消息 -->
      <div class="tab-pane fade" id="userMsg" role="tabpanel" aria-labelledby="userMsg_tab">
        两周开发时间太短了，这真的开发不完了，理解一下吧 இдஇ
      </div>

      <!-- 系统消息 -->
      <div class="tab-pane fade" id="sysMsg" role="tabpanel" aria-labelledby="sysMsg_tab">
        恩没错，这是真的真的开发不完了 இдஇ
      </div>



    </div>
  </div>

  <div id="tag">
    什么都没有了哦 <span class="mdi mdi-playlist-check"></span>
  </div>

</body>

</html>