(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["registered"],{"44e7":function(e,r,t){var a=t("861d"),o=t("c6b6"),n=t("b622"),s=n("match");e.exports=function(e){var r;return a(e)&&(void 0!==(r=e[s])?!!r:"RegExp"==o(e))}},"4d63":function(e,r,t){var a=t("83ab"),o=t("da84"),n=t("94ca"),s=t("7156"),i=t("9bf2").f,c=t("241c").f,u=t("44e7"),f=t("ad6d"),l=t("9f7f"),m=t("6eeb"),p=t("d039"),d=t("69f3").set,g=t("2626"),v=t("b622"),b=v("match"),h=o.RegExp,w=h.prototype,x=/a/g,k=/a/g,y=new h(x)!==x,$=l.UNSUPPORTED_Y,E=a&&n("RegExp",!y||$||p((function(){return k[b]=!1,h(x)!=x||h(k)==k||"/a/i"!=h(x,"i")})));if(E){var P=function(e,r){var t,a=this instanceof P,o=u(e),n=void 0===r;if(!a&&o&&e.constructor===P&&n)return e;y?o&&!n&&(e=e.source):e instanceof P&&(n&&(r=f.call(e)),e=e.source),$&&(t=!!r&&r.indexOf("y")>-1,t&&(r=r.replace(/y/g,"")));var i=s(y?new h(e,r):h(e,r),a?this:w,P);return $&&t&&d(i,{sticky:t}),i},R=function(e){e in P||i(P,e,{configurable:!0,get:function(){return h[e]},set:function(r){h[e]=r}})},C=c(h),q=0;while(C.length>q)R(C[q++]);w.constructor=P,P.prototype=w,m(o,"RegExp",P)}g("RegExp")},7156:function(e,r,t){var a=t("861d"),o=t("d2bb");e.exports=function(e,r,t){var n,s;return o&&"function"==typeof(n=r.constructor)&&n!==t&&a(s=n.prototype)&&s!==t.prototype&&o(e,s),e}},"7a6a":function(e,r,t){"use strict";var a=t("861a"),o=t.n(a);o.a},"861a":function(e,r,t){},"8e83":function(e,r,t){"use strict";t.r(r);var a=function(){var e=this,r=e.$createElement,t=e._self._c||r;return t("div",{staticClass:"login"},[t("div",{staticClass:"login-form"},[t("el-form",{ref:"form",attrs:{model:e.form,rules:e.rules,"label-width":"80px"}},[t("el-form-item",{attrs:{label:"手机号",prop:"account"}},[t("el-input",{model:{value:e.form.account,callback:function(r){e.$set(e.form,"account",r)},expression:"form.account"}})],1),t("el-form-item",{attrs:{label:"邮箱",prop:"email"}},[t("el-input",{model:{value:e.form.email,callback:function(r){e.$set(e.form,"email",r)},expression:"form.email"}})],1),t("el-form-item",{attrs:{label:"密码：",prop:"password"}},[t("el-input",{attrs:{type:"password"},model:{value:e.form.password,callback:function(r){e.$set(e.form,"password",r)},expression:"form.password"}})],1),t("el-form-item",{attrs:{label:"确认密码：",prop:"checkPass"}},[t("el-input",{attrs:{type:"password"},model:{value:e.form.checkPass,callback:function(r){e.$set(e.form,"checkPass",r)},expression:"form.checkPass"}})],1),t("el-form-item",{attrs:{label:"验证码：",prop:"verifyCode"}},[t("el-input",{model:{value:e.form.verifyCode,callback:function(r){e.$set(e.form,"verifyCode",r)},expression:"form.verifyCode"}})],1),t("el-form-item",{attrs:{inline:!0}},[t("el-button",{attrs:{type:"primary"},on:{click:e.onSubmit}},[e._v("注册")]),t("el-button",{on:{click:e.resetForm}},[e._v("重置")])],1)],1)],1)])},o=[],n=(t("4d63"),t("ac1f"),t("25f0"),t("5319"),t("96cf"),t("1da1")),s=t("397c"),i=t("5350"),c={data:function(){var e=this;s["a"].close();var r=function(r,t,a){""===t?a(new Error("请输入密码")):(""!==e.form.checkPass&&e.$refs.form.validateField("checkPass"),a())},t=function(r,t,a){""===t?a(new Error("请再次输入密码")):t!==e.form.password?a(new Error("两次输入密码不一致!")):a()},a=function(e,r,t){new RegExp(/^[1]([3-9])[0-9]{9}$/).test(r)?t():t(new Error("手机号不正确"))};return{form:{account:"",password:"",verifyCode:"",checkPass:"",email:""},rules:{account:[{required:!0,message:"手机号不能为空"},{validator:a,trigger:"blur"}],password:[{required:!0,message:"密码不为空"},{validator:r,trigger:"blur"}],checkPass:[{required:!0,message:"确认密码不能为空"},{validator:t,trigger:"blur"}],verifyCode:[{required:!0,message:"验证码不为空"}],email:[{required:!0,message:"请输入邮箱地址",trigger:"blur"},{type:"email",message:"请输入正确的邮箱地址",trigger:["blur","change"]}]}}},methods:{onSubmit:function(){var e=this;return Object(n["a"])(regeneratorRuntime.mark((function r(){var t;return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:return r.prev=0,s["a"].show(),r.next=4,e.$refs.form.validate();case 4:if(t=r.sent,!t){r.next=9;break}e.axios({method:"post",url:"http://localhost:8802/app/register",data:e.Qs.stringify({email:e.form.email,password:e.form.password,type:1,phon:e.form.account,sign:123456})}).then((function(r){console.log(r.data),200==r.data.code?e.$confirm("点击确认跳转到云端首页, 是否继续?","注册成功",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then((function(){i["a"].set("token",r.data.data.token),e.$router.replace({path:"/"})})).catch((function(){e.$message({type:"info",message:"取消跳转"})})):e.$alert(r.data.message,"提示",{confirmButtonText:"确定"})})),r.next=10;break;case 9:return r.abrupt("return",!1);case 10:r.next=15;break;case 12:r.prev=12,r.t0=r["catch"](0),s["b"].error(r.t0.message);case 15:return r.prev=15,s["a"].close(),r.finish(15);case 18:case"end":return r.stop()}}),r,null,[[0,12,15,18]])})))()},resetForm:function(){this.$refs.form.resetFields()}},created:function(){}},u=c,f=(t("7a6a"),t("9817"),t("2877")),l=Object(f["a"])(u,a,o,!1,null,"5d0f4d26",null);r["default"]=l.exports},9817:function(e,r,t){"use strict";var a=t("da02"),o=t.n(a);o.a},da02:function(e,r,t){}}]);