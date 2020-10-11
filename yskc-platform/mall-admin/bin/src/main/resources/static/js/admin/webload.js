/**
 * Created by mgr on 2017/10/6.
 */
/*$(function () {
    $('.js-toggle-menu').click(function(e){
        e.preventDefault();
        $('.mobile-header-nav').slideToggle();
        $(this).toggleClass('open');
    });

    loadPage('#tab1',{
        success:function () {
            $('div[name="tabs-page"]').each(function (index) {
                var obj=$(this);
                if(obj.attr('id')!="tab1")
                    loadPage(obj);
            });
        }
    });
});*/


var contUrl=null;
var urlParams={};
function loadPage(url) {
    loadPages(url,{});
}
function loadPages(url,pars,tar,opts) {
    if(!url) url=contUrl;
    else contUrl=url;
    if(pars)urlParams=pars;
    //alert(pars);
    var _target=tar?$(tar):$('#mainContent');
    _target.load(url,urlParams,function () {
        try{
            opts.success();
        }catch (e){}
    });
}

function refreshPage(tar) {
    if(contUrl)
        loadPages(contUrl,urlParams,tar);
}
function refreshPages(pars,tar) {
    $.extend(urlParams, pars);
    if(contUrl)
        loadPages(contUrl,urlParams,tar);
}