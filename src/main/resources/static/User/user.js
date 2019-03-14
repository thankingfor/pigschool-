$(function () {
    // 显示面板
    showPanel();
    var url = window.location.href.split('#')[0];

    /*
    //切换面板变换url
    $('#info_tab').click(function(){
        window.location.href = url + '#info';
    })
    $('#publish_tab').click(function(){
        window.location.href = url + '#publish';
    })
    $('#want_tab').click(function(){
        window.location.href = url + '#want';
    })
    $('#collection_tab').click(function(){
        window.location.href = url + '#collection';
    })
    $('#userMsg_tab').click(function(){
        window.location.href = url + '#userMsg';
    })
    $('#sysMsg_tab').click(function(){
        window.location.href = url + '#sysMsg';
    })
    */


    //url变化监听器
    if (('onhashchange' in window) && ((typeof document.documentMode === 'undefined') || document.documentMode == 8)) {
        window.onhashchange = hashChange;
    }

    function hashChange() {
        showPanel();
        let hash = window.location.hash;
        /*
        switch(hash){
        case '#info':
            console.log('info');
            break;
        case '#publish':
            console.log('publish');
            break;
        case '#want_tab':
            console.log('want_tab');
            break;
        case '#collection_tab':
            console.log('collection_tab');
            break;
        }
        */
    }


    // 个人信息面板相关=========================
    // 点击“更改信息按钮”
    let show_submit_change = true;
    $('#change').click(function () {
        if (show_submit_change == true) {
            $('fieldset').removeAttr('disabled');
            $('#submit_change').removeAttr('disabled')
                .removeClass('btn-secondary').addClass('btn-primary');
            $(this).text('取消更改')
            show_submit_change = false;
        }
        else {
            $('fieldset').attr('disabled', 'disabled');
            $('#submit_change').attr('disabled', 'disabled').removeClass('btn-primary').addClass('btn-secondary');
            ;
            $(this).text('更改信息')
            show_submit_change = true;
        }
    })
    // 点击“提交更改”按钮
    $('#submit_change').click(function () {
        // TODO: 提交更改信息
        var upload_cover = $('#file')[0];
        if (upload_cover.files[0] != null) {
            var formData1 = new FormData();
            formData1.append('smfile', upload_cover.files[0]);
            var url = loc(formData1);
            $('#user_icon').val(url);
        }
        $.ajax({
            type: "post",
            dataType: "json",
            data: $('#userEdit').serialize(),
            url: "/user/edit",
            async: false,
            success: function (data) {
                if (data.code == 1) {
                    window.location.reload();
                }
                else {
                    alert(data.msg);
                }
            },
            error: function (data) {
                alert("系统出错");
            }
        });
    })


    // 商品信息面板相关=========================
    renderItemPic();  // 该函数应该放在渲染出商品列表中的图片（页面DOM树生成）之后执行
    // 点击商品获取商品ID后跳转到商品页面
    // TODO: 由商品ID跳转到商品页面
    $('.item_card').click(function () {
        item_id = $(this).attr('item_id');
        if (item_id != null){
            window.location.href = '/item/' + item_id;
        }
        need_id = $(this).attr('need_id');
        if (need_id != null){
            /*window.location.href = '/sm/' + need_id;*/
        }

    })

    // 点击“发布-已售出”按钮
    $('.publish_sold').click(function () {
        event.stopPropagation();
        item_id = $(this).parents('.item_card').attr('item_id');
        $('#ensure_publish_sold').modal('toggle');
    })

    // 点击“发布-删除”按钮
    $('.publish_delete').click(function () {
        event.stopPropagation();
        item_id = $(this).parents('.item_card').attr('item_id');
        $('#ensure_publish_delete').modal('toggle');
    })

    // 点击“想要-删除”按钮
    $('.want_delete').click(function () {
        event.stopPropagation();
        change_id = $(this).parents('.item_card').attr('change_id');
        $("#want_delete_Hid").val(change_id)
        $('#ensure_want_delete').modal('show')
    })

    // 点击“想要-删除”按钮
    $('.fav_delete').click(function () {
        event.stopPropagation();
        fav_id = $(this).parents('.item_card').attr('fav_id');
        $("#want_fav_Hid").val(fav_id)
        $('#ensure_fav_delete').modal('show')
    })

    // 点击“查看卖家信息”按钮
    $('.seller_info').click(function () {
        event.stopPropagation();
        item_id = $(this).parents('.item_card').attr('item_id');
        $('#seller_info').modal('show')
        // TODO: 发送Ajax请求渲染出模态框中的卖家信息，下方示例
        // Ajax返回的对象
        let seller_info = {
            sellerName: $(this).parents('.item_card').attr('item_sellerName'),
            sellerContactWay: $(this).parents('.item_card').attr('item_contactWay'),
            sellerContact: $(this).parents('.item_card').attr('item_contact')
        }
        // Ajax接收数据成功后执行的函数
        renderSellerInfo(seller_info);
    })
    // 点击“收藏-删除”按钮
    $('.fav_delete').click(function () {
        event.stopPropagation();
        change_id = $(this).parents('.item_card').attr('change_id');
        /*$.ajax({
            type: "post",
            dataType: "json",
            data: {changeId:change_id},
            url: "/exchange/del",
        });*/
        $('#ensure_want_delete').modal('show')
    })
});

function loc(formData) {
    var url;
    $.ajax({
        type: "post",
        dataType: "json",
        url: "/upload",
        async: false,//异步  true 同步
        cache: false,//缓存 false的话会在url后面加一个时间缀，让它跑到服务器获取结果。
        contentType: false,//上传的时候必须要
        processData: false,
        data: formData,
        success: function (data) {
            url = data.data.fileName;
            /*url = data.data.url;*/

        },
        error: function (data) {
            alert("上传失败")
        },
    })
    return "/" + url;
}

function need_click_del(fav_id) {
    $.ajax({
        type: "post",
        dataType: "json",
        data: {favId:fav_id},
        url: "/sm/need/fav/del",
        async: false,
        success: function (data) {
            if (data.code == 1) {
                window.location.reload();
            }
            else {
                alert(data.msg);
            }
        },
        error: function (data) {
            alert("系统出错");
        }
    });
}