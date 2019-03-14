$(document).ready(function () {
    // 初始化上传封面框
    $("#upload_cover").fileinput({
        language: "zh",
        theme: "fa",
        showCaption: false, // 不显示本地文件名
        allowedFileTypes: ['image'], // 只允许上传图片
        allowedFileExtensions: ['jpg', 'png', "webp"],
        uploadAsync: false,
        showUpload: false, //是否显示上传按钮
        // showRemove: false, //是否显示删除按钮
        browseClass: "btn btn-warning", //按钮样式
        required: true,
        showClose: false,
        removeFromPreviewOnError: true,  //当文件不符合规则，就不显示预览
        initialPreviewShowDelete: true,
        frameClass: 'cover krajee-default',
    });
    $("#upload_pic").fileinput({
        language: "zh",
        theme: "fa",
        showCaption: false, // 不显示本地文件名
        allowedFileTypes: ['image'], // 只允许上传图片
        allowedFileExtensions: ['jpg', 'png', "webp"],
        uploadAsync: false,
        showUpload: false, //是否显示上传按钮
        // showRemove: false, //是否显示删除按钮
        browseClass: "btn btn-warning", //按钮样式
        required: true,
        showClose: false,
        maxFileCount: 5,  // 上传最大限制是5
        removeFromPreviewOnError: true,  //当文件不符合规则，就不显示预览
        initialPreviewShowDelete: true,
        frameClass: 'pic krajee-default',
    });
    //  TODO : 发布商品
    $('#publish_btn').click(function () {
        console.log("开始准备提交表单....")
        console.log("上传图片到sm....")
        /*首页图片上传到sm*/
        var upload_cover = $('#upload_cover')[0];
        if (upload_cover.files[0] != null) {
            var formData1 = new FormData();
            formData1.append('smfile', upload_cover.files[0]);
            var url = loc(formData1);
            $('#photoSM').val(url);
        }
        /*首页图片上传到sm*/
        /*其他图片*/
        var file = $('#upload_pic')[0];
        if (file.files[0] != null) {
            for (var i = 0; i < file.files.length; i++) {
                var formData = new FormData();
                formData.append('smfile', file.files[i]);
                var imgUrls = loc(formData);
                if ($('#imageSM').val() == "") {
                    $('#imageSM').val(imgUrls);
                } else {
                    //用,号区分
                    $('#imageSM').val($('#imageSM').val() + "," + imgUrls);
                }
            }
        }
        /*其他图片*/
        console.log("封面地址：" + url)
        $('#photoSM').val(url)
        console.log("打印数据....")
        console.log("表单数据：" + $('#item_info').serialize())
        console.log("ajax上传....")
        //准备开始上传item
        $.ajax({
            type: "post",
            dataType: "json",
            data: $('#item_info').serialize(),
            url: "/publish/item",
            async: false,
            success: function (data) {
                if (data.code == 1) {
                    alert("success")
                } else {
                    alert(data.msg)
                }
            },
            error: function (data) {
                alert("上传失败")
            }
        });
    })
});

function sm(formData) {
    var url;
    $.ajax({
        type: "post",
        dataType: "json",
        url: "https://sm.ms/api/upload",
        async: false,//异步  true 同步
        cache: false,//缓存 false的话会在url后面加一个时间缀，让它跑到服务器获取结果。
        contentType: false,//上传的时候必须要
        processData: false,
        data: formData,
        success: function (data) {
            url = data.data.url;
        },
        error: function (data) {
            alert("上传失败")
        },
    })
    return url;
}

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