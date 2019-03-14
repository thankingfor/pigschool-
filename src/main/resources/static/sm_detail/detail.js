$(document).ready(function () {

    $('#single_info').css('display', 'block');

    $('#work_info').css('display', 'block');

    $('#multiple_info').css('display', 'block');
  // 解析url，将url中的参数放在url_obj对象中
  /*var url = window.location.href;
  var url_arr = url.split('?')[1].split('&')
  var url_obj = {};
  for (let i = 0; i < url_arr.length; i++) {
    let arr = url_arr[i].split('=');
    url_obj[arr[0]] = arr[1];
  }

  // 解析出url后，选择性渲染信息
  switch (url_obj.part) {
    case "single":
      $('#single_info').css('display', 'block');
      break;
    case "work":
      $('#work_info').css('display', 'block');
      break;
    case "multiple":
    $('#multiple_info').css('display', 'block');
      break;
  }*/

  // 渲染薪资水平单位
  switch ($('#work_payWay').html()) {
    case ('按日结算'):
      $('#salary_unity').html('元/天');
      break;
    case ('按周结算'):
      $('#salary_unity').html('元/周');
      break;
    case ('按月结算'):
      $('#salary_unity').html('元/月');
      break;
    case ('按工作时长结算'):
      $('#salary_unity').html('元/小时');
      break;
    case ('工作完成后结算'):
      $('#salary_unity').html('元/工期');
      break;
  }

  // 点击接受需求按钮
  $('#accept_btn').click(function(){
      $.ajax({
          type: "post",
          dataType: "json",
          data: {needId:needId,userId:userId,needType:1},
          url: "/sm/need/fav",
          async: false,
          success:function (data) {
              alert("成功")
          }
      });
  })

  // 点击收藏按钮
  $('#collection_btn').click(function(){
      $.ajax({
          type: "post",
          dataType: "json",
          data: {needId:needId,userId:userId,needType:0},
          url: "/sm/need/fav",
          async: false,
          success:function (data) {
              alert("成功")
          }
      });
  })
});