(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["manager"],{cebe:function(t,a,e){"use strict";e.r(a);var n=function(){var t=this,a=t.$createElement,e=t._self._c||a;return e("div",{staticClass:"manager"},[e("div",{staticClass:"manager-head"},[e("div",{staticClass:"search"},[e("el-form",{staticClass:"search-form"},[e("el-form-item",{staticClass:"search-left"},[e("el-input",{staticClass:"search-input",attrs:{placeholder:"输入帐号或名称"},model:{value:t.input,callback:function(a){t.input=a},expression:"input"}}),e("el-button",{staticClass:"search-button",attrs:{type:"primary"}},[e("i",{staticClass:"el-icon-search search-icon"}),t._v(" 搜索 ")])],1)],1)],1)]),e("div",{staticClass:"manager-table"},[e("div",{staticClass:"table-head"},[e("el-table",{staticClass:"table-set",staticStyle:{width:"100%"},attrs:{data:t.data}},[e("el-table-column",{staticClass:"group-accout",attrs:{prop:"account",label:"帐号"}}),e("el-table-column",{staticClass:"table-title",attrs:{label:"违规总次数",align:"center",prop:"count"}}),e("el-table-column",{staticClass:"table-title",attrs:{label:"查看违规内容",align:"center"},scopedSlots:t._u([{key:"default",fn:function(a){return[e("el-button",{attrs:{type:"text",title:a.$index},on:{click:function(a){return t.open()}}},[t._v("查看")])]}}])})],1)],1),e("div",{staticClass:"table-pages"},[e("el-pagination",{attrs:{background:"","page-size":1,layout:"total,prev, pager, next, jumper",total:t.total},on:{"current-change":t.handleCurrentChange}})],1)])])},l=[],o=(e("b0c0"),{methods:{open:function(){this.$prompt(null,"搜索违规内容",{confirmButtonText:"搜索",cancelButtonText:"取消",showInput:!0,inputPlaceholder:"请输入用户帐号",inputType:"text",dangerouslyUseHTMLString:!1,callback:function(t,a){console.log(t),console.log(a),"confirm"===t&&a.Commont({url:"http://localhost:9909/backstageTotalManage/selectPmsContentList?account="+a.inputValue,fn:function(t){console.log(t.data[0].name),console.log(t.data[0].count),t.$alert("违规次数："+t.data[0].count,t.data[0].name,{confirmButtonText:"确定"})}})}})},handleCurrentChange:function(t){console.log("当前页: ".concat(t)+"02")},viewContent:function(t,a){console.log("查看违规内容"+t+a)},warning:function(t,a){console.log(t,a)},seal_number:function(t,a){console.log(t,a)},handleDelete:function(t,a){console.log("注销"+t+a)}},data:function(){return this.Commont({url:"http://localhost:8802/pmsBackstageTotalManage/getBackstageTotalManage"}),{total:12,input:"",data:null}}}),s=o,c=e("2877"),i=Object(c["a"])(s,n,l,!1,null,null,null);a["default"]=i.exports}}]);