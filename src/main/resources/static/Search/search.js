$(document).ready(function () {
  function renderPercent() {
    $('.price_box').each(function () {
      let price = $(this).find('.now').eq(0).text().split('￥')[1];
      let old_price = $(this).find('.old').eq(0).text().split('￥')[1];
      let percent = ((old_price - price) / old_price).toFixed(2) * 100;
      $(this).children('.percent').eq(0).text('-' + percent + '%');
    })
  }
  function renderNone() {
    if ($('.item').length == 0) {
      $('#noFound').show();
    }
  }
  // TODO: 发送Ajax请求渲染搜索列表
  
  // 商品列表渲染出后再执行该方法，该方法为计算显示商品的降价幅度
  renderPercent();
  // 如果没有查找到任何商品就执行这个方法：
  renderNone();


});
function item_click(id) {
    window.location.href = "/item/"+id;
}