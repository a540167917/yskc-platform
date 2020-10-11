

var layer=null;
var layform=null;
layui.use(['layer','form','element'], function(){
    layer=layui.layer;
    layform=layui.form;
    var element = layui.element;
});

$(function () {
    $('body').on('page.reload',function () {
        refreshPage();
    });

    $('#searchText').on('keyup',function (e) {
        // console.log(e);
        if(e.keyCode==13)
            searchFun()
    })
});

function dels(url) {
    delFun({
        url:url,
        delOkFun:function () {
            refreshPage();
        }
    });
}

function clearCache() {
    $.get("/api/admin/common/cache/clear",function () {
        layer.msg("清除成功",{icon:1})
    });
}

function searchFun() {
    var q=$('#searchText').val();
    if(q=='')return;
    refreshPages({offset:null,q:q});
}

