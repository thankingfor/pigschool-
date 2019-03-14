$(document).ready(function () {
    // 计算折扣
    /*var percent = ((old_price - price) / old_price).toFixed(2) * 100;*/
    $('.percent').eq(0).html('<span class="mdi mdi-arrow-down-bold-box-outline"></span>' + percent + "%");

    // 点击“交换信息”按钮
    $('#change_info').click(function () {
        if ($('#your_name').val() && $('#contact').val()) {
            $('#enter_your_info').modal('hide');
            $('#seller_info').modal('show');
            $.ajax({
                type: "post",
                dataType: "json",
                data: $('#exchange_info').serialize(),
                url: "/iwant",
                async: false,
            });
        } else {
            $('#your_info_alert').fadeIn().delay('1000').fadeOut();
        }
    })

    /*留言的上传*/
    $('#msg_button').click(function () {
        if ($("#msg_text").val=="" || $("#msg_text").val==null){
            alert("内容不能为空")
            return;
        }
        $.ajax({
            type: "post",
            dataType: "json",
            data: $('#leave_msg').serialize(),
            url: "/leave/message",
            async: false,
            success :function (data) {
                window.location.href = "/item/"+itemID;
            }
        });
    })
    /*收藏collection*/
    $('#collection').click(function () {
        if (IdFavorite=="先收藏"){
            $.ajax({
                type: "post",
                dataType: "json",
                data: {itemId:itemID,userId:userid},
                url: "/item/favorite",
                async: false,
                success :function (data) {
                    window.location.href = "/item/"+itemID;
                }
            });
        } else if (IdFavorite=="已收藏"){
            $.ajax({
                type: "post",
                dataType: "json",
                data: {itemId:itemID,userId:userid},
                url: "/item/Nofavorite",
                async: false,
                success :function (data) {
                    window.location.href = "/item/"+itemID;
                }
            });
        }
    })
    // 留言板消息渲染
    // TODO: 这条代码是当Ajax返回该物品的留言列表后执行的，如果留言列表为空就显示“没有留言”的提示，如果留言列表中有留言则不显示该提示
    if ($('#message_box .message').length == 0) {
        $('#message_null').show();
    }


});