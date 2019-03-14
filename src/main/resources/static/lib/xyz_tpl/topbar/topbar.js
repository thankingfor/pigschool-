var USERID;

$(document).ready(function () {
  // 渲染Topbar中的用户信息
  function renderTopbar(user_info) {
    // USERID = user_info.id
    // $('#topbar .school_name').eq(0).text(user_info.school);
    // $('#user_name .name').eq(0).text(user_info.name);
    $('#user_head').attr('src','/Data/User/Default/head')
  }



  // TODO: 将其移动到获取用户信息后的Ajax回调函数中
  
  // 返回数据示例：
  var user_info = {
    id: 1001,
    name: 'EsunR',
    school: '伦敦皇家学院',
    level: '3',
    // 后续要添加消息通知数量
  }
  // Ajax回调成功后执行
  renderTopbar(user_info);



  // 跳转主页
  $("#topbar .title").eq(0).click(function () {
    window.location.href = '/index'
  })
  $('.home_btn').eq(0).click(function () {
    window.location.href = '/index'
  })

  // 消息通知下拉动画
  $("#user_list").hover(function () {
    $("#user_info").slideDown('fast');
  }, function () {
    $("#user_info").slideUp('fast');
  })

  // 聚合通知
  let user_msg_num = parseInt($('#user_msg').text());
  let sys_msg_num = parseInt($('#user_msg').text());
  $('#user_name .badge-primary').text(user_msg_num + sys_msg_num)

  // TODO:　跳转按钮的链接
  //let user_url = '/Users/'+itemid
  let user_url = '/user'

  let nav_btn_url = ['#publish', '#want', '#collection'];
  for (let i = 0; i < 3; i++) {
    $('.nav_btn').eq(i).click(function () {
      window.location.href = user_url + nav_btn_url[i];
    })
  }
  $('#user_name').click(function () {
    window.location.href = user_url + '#info'
  })
  $('.user_list_btn').eq(0).click(function () {
    window.location.href = user_url + '#userMsg'
  })
  $('.user_list_btn').eq(1).click(function () {
    window.location.href = user_url + '#sysMsg'
  })
  $('.user_list_btn').eq(2).click(function () {
    window.location.href = '/login/logout'
  })


});