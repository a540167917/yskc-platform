

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
/*删除*/
function dels(url) {
    delFun({
        url:url,
        delOkFun:function () {
            refreshPage();
        }
    });
}
/*是否启用*/
function enable(data,enable){
     enableFun({
            url:data,
            delOkFun:function () {
                refreshPage();
            }
        },enable);
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

