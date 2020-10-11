/**
 * Created by mgr on 2017/10/5.
 */

/*======================对话框相关 start ======================*/

/**
 * 表单提交操作方法
 * @param formInfo 表单参数信息 formInfo = {
                    id : "", //表单ID
                    action : "", //请求响应路径
                    method : "", //请求的方式
                    paramData : "", //参数信息
                    preValid : true, //用户自定义验证是否已经验证通过
                    formValid : false, //表单是否已经进行过Jquery.validate验证
                    saveOkFun : "", //保存成功后的回调
                    saveFailFun : "",//保存失败的回调
                    saveErrorFun : ""//保存出错的回调
                };
 * @param index 当前打开的layer的index参数
 * @returns {boolean}
 */
function formAjaxSave(formInfo, index) {
    //定义Form信息
    var initFormInfo = {
        formValid : true //表单是否进行Jquery.validate验证
    };
    if(formInfo !== undefined){
        formInfo = $.extend({}, initFormInfo, formInfo);
    }

    //未定义，则默认获取该页面的第一个Form
    var body = layer.getChildFrame('body', index);
    body = body ? body : $("body");
    var inputForm = formInfo.id ? body.find('#' + formInfo.id) : body.find("form")[0] ;

    if(formInfo.formValid) {//false表示需要进行表单验证
        var validateForm = inputForm.validate({
            errorElement: "em",
            submitHandler: function () {
                alert("What happened!");
            }
        });
        if(!validateForm.form()){
            layer.msg("信息验证有误，请检查", {icon: 2});
            return false;
        }
        if (formInfo.customValidFun && typeof formInfo.customValidFun === 'function') {
            if(formInfo.customValidFun()==false)
                return false;
        }
    }

    if (formInfo.customOKFun && typeof formInfo.customOKFun === 'function') {
        formInfo.customOKFun();
        return false;
    }
    if(formInfo.action!="") {
        //表单是否正在提交中
        if(!inputForm.attr("submitting")){
            inputForm.attr("submitting",true);
        }else{
            layer.msg("操作正在处理，请勿重复操作", {icon: 0});
            return false;
        }
        alert(formInfo.action)
        alert(formInfo.method)
        alert(formInfo.paramData ? formInfo.paramData : inputForm.serialize())

        $.ajax({
            url: formInfo.action,
            type: formInfo.method ? formInfo.method : (inputForm.attr("method") ? inputForm.attr("method") : "get"),
            dataType: "json",
            data: formInfo.paramData ? formInfo.paramData : inputForm.serialize(),
            success: function (ret) {
                inputForm.removeAttr("submitting");//删除提交中标识属性
                //执行成功后的回调方法
                layer.msg("信息保存成功", {icon: 1, time: 1000});
                var isclose = true;
                if (formInfo.saveOkFun && typeof formInfo.saveOkFun === 'function') {
                    if (formInfo.saveOkFun($("html"), ret))//把当前页面的Windows对象传递给saveOkFun
                        isclose = false;
                }
                if (isclose && index) {
                    layer.close(index)
                }
            },
            error: function (req, status, e) {
                layer.msg("信息保存出错！" + req.responseText, {icon: 5, time: 1000});
                inputForm.removeAttr("submitting");//删除提交中标识属性
                if (formInfo.saveErrorFun && typeof formInfo.saveErrorFun === 'function') {
                    formInfo.saveErrorFun($("html"), req, status, e);//把当前页面的Windows对象传递给回调方法
                }
            }
        });
    }
}
/**
 * 打开对话框
 * @param title 标题
 * @param url 窗口打开的页面URL地址
 * @param width 窗口宽度
 * @param height 窗口高度
 * @param yesFun 自定义的回调操作方法，可选，不传则默认会提交Form表单（以下【】的描述在yesFun方法未定义的情况下有效：
 *              【页面可定义一个名为：formSubmitInit的方法。该方法返回JSON数据，字段格式有：{
                    id : "", //表单Form的标识ID，可选传，不传则使用页面上的第一个Form提交
                    action : "", //表单请求的URL，可选传，不传则使用Form对应的action属性
                    method : "GET", //表单提交的方式，POST/GET，可选传，不传则使用Form对应的method属性
                    paramData : {key1:value1,key2:value2}, //自定义的Form表单的参数，JSON格式，可选，不传则使用form的序列化作为参数
                    formValid : false,// 默认为false，表示这里会进行form验证（这里是jQuery.validate插件来验证），true：表示无需再验证
                    preValid ：true, //自定义的验证标识开关，可选，true标识验证通过，false标识验证不通过（为false时，
                        就算jQuery.validate插件验证通过，表单也不会提及），默认为true
                    saveOkFun : function(){} //表单提交成功后调用的方法，可选传，不传则没有回调
                }），从这里可以知道，formSubmitInit方法也是可以不定义的】
 * @param closeFun 自定义的关闭操作方法，默认直接关闭窗口，没有回调
 * @param yesName 自定义的确认按钮名称，默认“确定”
 * @param closeName 自定义的关闭按钮名称，默认“关闭”
 */
function openDialogForm(title,url,width,height, yesFun, closeFun, yesName, closeName){
	$("body").css("height","100%");
    if(navigator.userAgent.match(/(iPhone|iPod|Android|ios)/i)){//如果是移动端，就使用自适应大小弹窗
        width='auto';
        height='auto';
    }
    layer.open({
        type: 2,
        area: [width ? width : "80%", height ? height : "80%"],
        // offset:  "100px" ,
        title: title,
        maxmin: true, //开启最大化最小化按钮
        content: url,
        btn: [yesName ? yesName : '确定', closeName ? closeName : '关闭'],
        yes: function (index, layero) {
            //自定义了yes操作的方法
            if(yesFun && typeof yesFun === "function"){
                var yesFunRet = yesFun(layero, index);//执行yesFun
                if(yesFunRet === undefined || yesFunRet){//undefined表示方法没有定义return
                    layer.close(index);
                }
            }else {
                //定义Form信息
                var formInfo = {
                    id : "", //表单ID
                    action : "", //请求响应路径
                    method : "", //请求的方式
                    paramData : "", //参数信息
                    saveOkFun : "", //保存成功后的回调
                    saveFailFun : "",//保存失败的回调
                    saveErrorFun : ""//保存出错的回调
                };

                var iframeWin = layero.find('iframe')[0]; //得到iframe页的窗口对象，执行iframe页的方法：iframeWin.method();
                var contentWindow = iframeWin.contentWindow;
                if(contentWindow.formSubmitInit && typeof contentWindow.formSubmitInit === 'function'){
                    $.extend(formInfo, contentWindow.formSubmitInit());
                }
                //表单提交保存
                formAjaxSave(formInfo, index);
            }
        },
        btn2 : function (index) {
            //自定义了cancel操作的方法
            if(closeFun && typeof closeFun === "function"){
                closeFun();//执行yesFun
            }
        },
        cancel: function (index) {
            //自定义了cancel操作的方法
            if(closeFun && typeof closeFun === "function"){
                closeFun();//执行yesFun
            }
        }
    });

}

//打开对话框(查看)
/**
 *
 * @param title 标题
 * @param url 窗口打开的页面URL地址
 * @param width 窗口宽度
 * @param height 窗口高度
 * @param closeFun 自定义的关闭操作方法，默认直接关闭窗口，没有回调
 * @param closeName 自定义的关闭按钮名称，默认“关闭”
 */
function openDialogView(title,url,width,height,closeFun, closeName){
    $("body").css("height","100%");
    if(navigator.userAgent.match(/(iPhone|iPod|Android|ios)/i)){//如果是移动端，就使用自适应大小弹窗
        width='auto';
        height='auto';
    }
    layer.open({
        type: 2,
        area: [width ? width : "80%", height ? height : "80%"],
        // offset:  "100px" ,
        title: title,
        maxmin: true, //开启最大化最小化按钮
        content: url,
        cancel: function(index,layero){
            //自定义了cancel操作的方法
            if(closeFun && typeof closeFun === "function"){
                closeFun(layero);//执行yesFun
            }
        }
    });
}

//打开对话框(上传)
/**
 *
 * @param title 标题
 * @param url 窗口打开的页面URL地址
 * @param width 窗口宽度
 * @param height 窗口高度
 * @param closeFun 自定义的关闭操作方法，默认直接关闭窗口，没有回调
 * @param closeName 自定义的关闭按钮名称，默认“关闭”
 */
function openDialogUpload(OKFun){
    $("body").css("height","100%");
    layer.open({
        type: 2,
        area: ['600px','300px'],
        title: "上传文件",
        content: '/adm/conts/file/forms' ,
        btn: ['确定', '关闭'],
        yes: function (index, layero) {
            var iframeWin = layero.find('iframe')[0]; //得到iframe页的窗口对象，执行iframe页的方法：iframeWin.method();
            var contentWindow = iframeWin.contentWindow;
            if(contentWindow.uploadFun && typeof contentWindow.uploadFun === 'function'){
                contentWindow.uploadFun(function (id) {
                    layer.close(index);
                    if (OKFun && typeof OKFun === "function") {
                        OKFun(id);
                    }
                });
            }
        }/*,cancel: function(index,layero){
            //自定义了cancel操作的方法
            if(closeFun && typeof closeFun === "function"){
                closeFun(layero);//执行yesFun
            }
        }*/
    });
}
/*======================对话框相关 end ======================*/


//默认的删除方法，如果不使用该方法，则自行定义
//这里的url参数可以直接时url，也可以是json对象，json对象是必须传入url，还可以选择传入delOkFun，delFailFun,delErrorFun
function delFun(url) {
    $("body").css("height","100%");
    layer.confirm('您确定要删除该数据吗？', {
        btn: ['确定','取消'] //按钮
    }, function(){
        $.ajax({
            url: (url && typeof url === "string") ? url : url.url,
            type: "get",
            dataType: "json",
            success: function (ret) {
                layer.msg((ret.msg?ret.msg:"删除成功！"),{icon : 1, time : 1000});
                if(url.delOkFun && $.isFunction(url.delOkFun)){
                    url.delOkFun(ret);//执行删除成功后的回调
                }
            },
            error: function (req, status, e) {
                layer.msg("删除失败，请稍后再试",{icon : 5, time : 1000});
                if(url.delFailFun && $.isFunction(url.delFailFun)){
                    url.delFailFun(req, status, e);//执行删除成功后的回调
                }
            }
        });
    }, function(){

    });
}

/*======================按钮相关 start ======================*/