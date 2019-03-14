$(document).ready(function () {
  // 显示回到顶部按钮
  $('#top_btn').click(function () {
    $('html, body').animate({
      scrollTop: $('body').offset().top
    }, 1000);
  })
  let scrollY = 0;
  $(window).scroll(function () {
    if (window.scrollY > scrollY) {
      $('#top_btn').removeClass('slideOutDown').addClass('slideInUp').show();
    } else {
      $('#top_btn').removeClass('slideInUp').addClass('slideOutDown');
    }
    scrollY = window.scrollY;
  });
});