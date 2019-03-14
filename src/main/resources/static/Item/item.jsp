<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <!-- 引入文件 -->
  <script src="${pageContext.request.contextPath}/lib/jquery/jquery-3.2.1.min.js"></script>
  <script src="${pageContext.request.contextPath}/lib/bootstrap/bootstrap.min.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/bootstrap/bootstrap.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/md-fonts/css/materialdesignicons.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/normalize/normalize.css">
  <!-- xyz组件 -->
   <script type="text/javascript">
    var loca = "${pageContext.request.contextPath}";
    var itemid="${user.id}";
  </script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/xyz_tpl/topbar/topbar.css">
  <script src="${pageContext.request.contextPath}/lib/xyz_tpl/topbar/topbar.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/xyz_tpl/top_btn/top_btn.css">
  <script src="${pageContext.request.contextPath}/lib/xyz_tpl/top_btn/top_btn.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/xyz_tpl/footer/footer.css">
  <!-- 私有 -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/Item/item.css">
  <script src="${pageContext.request.contextPath}/Item/item.js"></script>
  <title>商品详情</title>
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


    <input type="hidden" id="ss3" userId="${user.id}" itemId="${list.id}" >
  <!-- 商品信息 -->
  <div id="item_info" class="container">
  	<div class=" item_card row area_title">
	  	<div class="col-12">
	  		<span class="title">基本信息 <span class="mdi mdi-tag-faces"></span></span>
	  	</div>
  	</div>
    <div class="row">
      <div class="item_cover col-lg-6">
        <img src="${pageContext.request.contextPath}/Data/SecondHand/Item/${list.id}/cover" alt="">
        <div class="item_condition_box">
          <div class="item_condition">${list.conditions}新</div>
        </div>
      </div>
      <div class="item_detail col-lg-6">
        <div class="item_detail_inner">
          <!-- 商品信息 -->
          <label>商品名称</label>
          <div class="item_name item_text">
            ${list.title}
          </div>
          <label>原价</label>
          <div class="old_price item_text">RMB: ${list.oldprice}</div>
          <label>现价</label>
          <div class="price item_text">RMB: ${list.price}</div>
          <label>折扣幅度</label>
          <div class="percent"></div>
          <label>卖家</label>
          <div class="seller">
            <span class="seller_name">${list.name}</span>
            <span class="seller_level badge badge-success">${list.level}</span>
          </div>
          <hr class="d-block d-xl-none">
          <div class="row btn_box">
            <div class="col-6">
              <button id="want" type="button" class="btn btn-warning" data-toggle="modal" data-target="#enter_your_info">
                我想要<span class="mdi mdi-cash-multiple"></span>
              </button>
            </div>
            <div class="col-6">
              <button id="collection" type="button" class="btn btn-info">
                先收藏<span class="mdi mdi-folder-star"></span>
              </button>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- 交换信息模态框 -->
  <div class="modal fade" id="enter_your_info" tabindex="-1" role="dialog" aria-labelledby="ModalCenterTitle"
    aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="ModalLongTitle">交换信息</h5>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="modal-body">
          <div class="remind">说明：如果您想要得到物品发布者的联系方式，您需要先输入您的个人联系方式以便于交换信息</div>
          <form>
            <div class="form-group">
              <label for="your_name" class="col-form-label">您的称呼</label>
              <input type="text" class="form-control" id="your_name">
            </div>
            <div class="form-group">
              <label for="contact" class="col-form-label">联系方式</label>
              <div class="row">
                <div class="col-4">
                  <select id="contact_way" class="form-control">
                    <option>QQ</option>
                    <option>微信</option>
                    <option>手机</option>
                  </select>
                </div>
                <div style="padding-left: 0" class="col-8">
                  <input type="text" class="form-control" id="contact">
                </div>
              </div>
            </div>
          </form>
          <div id="your_info_alert" class="alert alert-danger" role="alert">
            请填写完整的信息
          </div>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
          <button type="button" id="change_info" class="btn btn-warning">确定交换</button>
        </div>
      </div>
    </div>
  </div>

  <div class="modal fade" id="seller_info" tabindex="-1" role="dialog" aria-labelledby="ModalCenterTitle" aria-hidden="true">
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
            卖家称呼：<span>${list.name}</span>
          </div>
          <div id="seller_contact">
            联系方式：
            <span>${list.sellercontact}</span>
            <span class="badge badge-pill badge-primary">${list.sellercontactway}</span>
          </div>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
        </div>
      </div>
    </div>
  </div>


  <!-- 商品描述 -->
  <div id="item_description" class="container">
    <div class="inner">
      <div class="area_title item_card row">
        <div class="col-12">
          商品描述<span class="mdi mdi-message-text"></span>
        </div>
      </div>

      <div class="description_text item_card row">
        <div class="col-12">
          ${list.description}
        </div>
      </div>
    </div>
  </div>

  <!-- 中心部分：商品图片&留言 -->
  <div id="center" class="container">
    <div class="row item_card">
      <div id="item_pic" class="col-md-7 col-lg-8">
        <!-- 展示图片 -->
        <img src="${pageContext.request.contextPath}/Data/SecondHand/Item/${list.id}/${list.id}_1" alt="">
        <img src="${pageContext.request.contextPath}/Data/SecondHand/Item/${list.id}/${list.id}_2" alt="">
        <img src="${pageContext.request.contextPath}/Data/SecondHand/Item/${list.id}/${list.id}_3" alt="">
        <img src="${pageContext.request.contextPath}/Data/SecondHand/Item/${list.id}/${list.id}_4" alt="">
        <img src="${pageContext.request.contextPath}/Data/SecondHand/Item/${list.id}/${list.id}_5" alt="">
      </div>
      <div id="message_board" class="col-md-5 col-lg-4">
        <div class="inner">
          <!-- 留言标题 -->
          <div class="title">
            留 言 板 <span class="mdi mdi-clipboard-text"></span>
          </div>
          <!-- 留言内容 -->
          <div id="message_box">
            <div id="message_null">
              这里还没有留言，快来留言吧！
            </div>

            <!-- 留言模板
            <div class="message row">
              <div class="messager_head col-3">
                <img src="${pageContext.request.contextPath}/Data/User/1001/head">
              </div>
              <div class="messager_info col-9">
                <div class="msg">
                  	这顶帽子挺不错的，能帮我留着吗。
                </div>
                <div class="messager_name">From：<span>EsunR</span></div>
              </div>
            </div>
                                   留言模板 -->
            
          </div>
          <!-- 撰写留言 -->
          <form id="leave_msg" action="">
            <textarea name="msg_text" id="msg_text" cols="45" rows="5" placeholder="请在此留言"></textarea>
            <input type="submit" class="btn btn-info" value="发布">
          </form>
        </div>
      </div>
    </div>
  </div>

  <!-- 返回顶部按钮 -->
  <div id="top_btn" href="#">
    <span class="mdi mdi-format-vertical-align-top"></span>
  </div>

  <!-- 底部 -->
  <div id="footer">
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
  </div>

</body>

</html>