$(document).ready(function () {
  // 新手提示
  $('#dontshow').click(function () {
    $('#new_user_to_show').slideUp();
    $.cookie('new_user', '0', { expires: 365 });
  })
  if (!$.cookie('new_user')) {
    $('#new_user_brand').slideDown();
  }

  // 点击商品跳转
  $(".item").click(function () {
      item_id = $(this).attr('item_id');
    window.location.href = '/item/'+item_id;
  })

  $("#search .btn-outline-light").click(function () {
      let search = $("#search_input").val();
      window.location.href = '/search?param='+ search;
  })
});