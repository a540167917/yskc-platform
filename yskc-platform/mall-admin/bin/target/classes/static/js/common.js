
var layer=null;
var layform=null;
layui.use(['layer','form'],function () {
    layer=layui.layer;
    layform=layui.form;
    $(function () {
        layform.render();
    });
});

function loginFun(form) {
    $('button[lay-submit]',form).attr('disabled','disabled').addClass('layui-btn-disabled');
    $.ajax({
        type:'post',
        url:'/api/login/login',
        data:$(form).serialize(),
        success:function (res) {
            window.location.reload();
        },error:function (res) {
            layer.msg(res.responseText?res.responseText:"服务器错误", {icon: 2});
            $('button[lay-submit]',form).removeAttr('disabled').removeClass('layui-btn-disabled');
        }
    })
}
function logoutFun() {
    $.get('/api/login/logout',null,function () {
        window.location.reload()
    })
}
function sendFun(obj) {
    var form=$(obj).parents('form');
    if(!(/^1[34578]\d{9}$/.test(form.find('input[name="phone"]').val()))){
        layer.msg("手机号不正确!", {icon: 2});
        return;
    }
    $.ajax({
        type:'post',
        url:'/api/login/send',
        data:form.serialize(),
        success:function (res) {
            layer.msg("验证码发送成功", {icon: 1});
        },error:function (res) {
            layer.msg(res.responseText?res.responseText:"服务器错误", {icon: 2});
        }
    })
}
function regFun(form) {
    $('button[lay-submit]',form).attr('disabled','disabled').addClass('layui-btn-disabled');
    $.ajax({
        type:'post',
        url:'/api/login/reg',
        data:$(form).serialize(),
        success:function (res) {
            window.location.reload();
            // if(loginIndex)layer.close(loginIndex);
        },error:function (res) {
            layer.msg(res.responseText?res.responseText:"服务器错误", {icon: 2});
            $('button[lay-submit]',form).removeAttr('disabled').removeClass('layui-btn-disabled');
        }
    })
}
function forgotFun(form) {
    $('button[lay-submit]',form).attr('disabled','disabled').addClass('layui-btn-disabled');
    $.ajax({
        type:'post',
        url:'/api/login/forgot',
        data:$(form).serialize(),
        success:function (res) {
            window.location.reload();
            // if(loginIndex)layer.close(loginIndex);
        },error:function (res) {
            layer.msg(res.responseText?res.responseText:"服务器错误", {icon: 2});
            $('button[lay-submit]',form).removeAttr('disabled').removeClass('layui-btn-disabled');
        }
    })
}

var loginIndex=null;
var regIndex=null;
var forgotIndex=null;
function loginDialog() {
    if(loginIndex)layer.close(loginIndex);
    loginIndex=layer.open({
        type: 1,
        area: ["450px", "300px"],
        // offset:  "100px" ,
        title: "登录",
        maxmin: false, //开启最大化最小化按钮
        content: '<form class="layui-form" action="javascript:;" onsubmit="loginFun(this)">' +
            '  <div class="layui-form-item" style="margin-top: 20px;">' +
            '    <label class="layui-form-label">帐号</label>' +
            '    <div class="layui-input-inline">' +
            '      <input type="text" name="name" required  lay-verify="required" placeholder="用户名/手机号" autocomplete="off" class="layui-input">' +
            '    </div>' +
            '    <div class="layui-form-mid layui-word-aux">必填</div>' +
            '  </div>' +
            '  <div class="layui-form-item">' +
            '    <label class="layui-form-label">密码</label>' +
            '    <div class="layui-input-inline">' +
            '      <input type="password" name="pass" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">' +
            '    </div>' +
            '    <div class="layui-form-mid layui-word-aux"><a href="javascript:forgotDialog()">忘记密码</a></div>' +
            '  </div>' +
            '  <div class="layui-form-item">' +
            '    <label class="layui-form-label">记住我</label>' +
            '    <div class="layui-input-block">' +
            '      <input type="checkbox" name="remember" lay-skin="switch" value="1">' +
            '    </div>' +
            '  </div>' +
            '  <div class="layui-form-item">' +
            '    <div class="layui-input-block">' +
            '      <button class="layui-btn" lay-submit lay-filter="formDemo">登录</button>' +
            '      <button type="button" class="layui-btn layui-btn-primary" onclick="regDialog()">注册</button>' +
            '    </div>' +
            '  </div>' +
            '</form>'
    });
    setTimeout(function () {
        layform.render();
    },500)
}
function regDialog() {
    if(regIndex)layer.close(regIndex);
    regIndex=layer.open({
        type: 1,
        area: ["500px", "400px"],
        // offset:  "100px" ,
        title: "注册",
        maxmin: false, //开启最大化最小化按钮
        content: '<form class="layui-form" action="javascript:;" onsubmit="regFun(this)">' +
            '  <div class="layui-form-item" style="margin-top: 20px;">' +
            '    <label class="layui-form-label">手机号</label>' +
            '    <div class="layui-input-inline">' +
            '      <input type="number" name="phone" required  lay-verify="required" placeholder="请输入手机号" autocomplete="off" class="layui-input">' +
            '    </div>' +
            '    <div class="layui-form-mid layui-word-aux">必填</div>' +
            '  </div>' +
            '  <div class="layui-form-item">' +
            '    <label class="layui-form-label">密码</label>' +
            '    <div class="layui-input-inline">' +
            '      <input type="password" name="pass" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">' +
            '    </div>' +
            '    <div class="layui-form-mid layui-word-aux">必填</div>' +
            '  </div>' +
            '  <div class="layui-form-item" style="margin-top: 20px;">' +
            '    <label class="layui-form-label">验证码</label>' +
            '    <div class="layui-input-inline">' +
            '      <input type="number" name="code" required  lay-verify="required" placeholder="短信验证码" autocomplete="off" class="layui-input">' +
            '    </div>' +
            '    <div class="layui-form-mid layui-word-aux"><button type="button" class="layui-btn layui-btn-sm layui-btn-radius layui-btn-normal login-btn" onclick="sendFun(this)">获取验证码</button></div>' +
            '  </div>' +
            '  <div class="layui-form-item" style="margin-top: 20px;">' +
            '    <label class="layui-form-label">昵称</label>' +
            '    <div class="layui-input-inline">' +
            '      <input type="text" name="nick" placeholder="好看的昵称哦" autocomplete="off" class="layui-input">' +
            '    </div>' +
            '    <div class="layui-form-mid layui-word-aux">可不填</div>' +
            '  </div>' +
            '  <div class="layui-form-item">' +
            '    <div class="layui-input-block">' +
            '      <input type="hidden" name="reg" value="1">' +
            '      <button class="layui-btn" lay-submit lay-filter="formDemo">注册</button>' +
            // '      <button type="button" class="layui-btn layui-btn-primary">注册</button>' +
            '    </div>' +
            '  </div>' +
            '</form>'
    });
    setTimeout(function () {
        layform.render();
    },500)
}
function forgotDialog() {
    if(forgotIndex)layer.close(forgotIndex);
    forgotIndex=layer.open({
        type: 1,
        area: ["500px", "350px"],
        // offset:  "100px" ,
        title: "忘记密码",
        maxmin: false, //开启最大化最小化按钮
        content: '<form class="layui-form" action="javascript:;" onsubmit="forgotFun(this)">' +
            '  <div class="layui-form-item" style="margin-top: 20px;">' +
            '    <label class="layui-form-label">手机号</label>' +
            '    <div class="layui-input-inline">' +
            '      <input type="number" name="phone" required  lay-verify="required" placeholder="请输入手机号" autocomplete="off" class="layui-input">' +
            '    </div>' +
            '    <div class="layui-form-mid layui-word-aux">必填</div>' +
            '  </div>' +
            '  <div class="layui-form-item">' +
            '    <label class="layui-form-label">新密码</label>' +
            '    <div class="layui-input-inline">' +
            '      <input type="password" name="pass" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">' +
            '    </div>' +
            '    <div class="layui-form-mid layui-word-aux">必填</div>' +
            '  </div>' +
            '  <div class="layui-form-item" style="margin-top: 20px;">' +
            '    <label class="layui-form-label">验证码</label>' +
            '    <div class="layui-input-inline">' +
            '      <input type="number" name="code" required  lay-verify="required" placeholder="短信验证码" autocomplete="off" class="layui-input">' +
            '    </div>' +
            '    <div class="layui-form-mid layui-word-aux"><button type="button" class="layui-btn layui-btn-sm layui-btn-radius layui-btn-normal login-btn" onclick="sendFun(this)">获取验证码</button></div>' +
            '  </div>' +
            '  <div class="layui-form-item">' +
            '    <div class="layui-input-block">' +
            '      <button class="layui-btn" lay-submit lay-filter="formDemo">修改密码</button>' +
            // '      <button type="button" class="layui-btn layui-btn-primary">注册</button>' +
            '    </div>' +
            '  </div>' +
            '</form>'
    });
    setTimeout(function () {
        layform.render();
    },500)
}

var userOutTime=null;
$('#userinfoDiv').ready(function () {
    var userinfoDiv=$('#userinfoDiv');
    var usermoreDiv=$('#usermoreDiv');
   $.ajax({
       type:'post',
       url:'/api/login/info',
       success:function (json) {
           if (json.login) {
               var nick=userinfoDiv.find('.nick');
               nick.text(json.user_nick);
               userinfoDiv.find('i').show();
               userinfoDiv.on("click",function () {
                   window.location='/user/';
               }).on("mouseover",function () {
                   clearTimeout(userOutTime);
                   userOutTime=null;
                   usermoreDiv.show();
               }).on("mouseout",function () {
                   userOutTime=setTimeout(function () {
                       usermoreDiv.hide();
                   },500);
               });
               usermoreDiv.on("mouseover",function () {
                   clearTimeout(userOutTime);
                   userOutTime=null;
                   usermoreDiv.show();
               }).on("mouseout",function () {
                   userOutTime=setTimeout(function () {
                       usermoreDiv.hide();
                   },500);
               });
           }else{
               userinfoDiv.on("click",function () {
                   loginDialog()
               });
           }
       }
   })
});

