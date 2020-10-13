<template>
  <el-menu :unique-opened="true">
    <template v-for="(menu, i) in menuList">
      <el-menu-item v-if="menu.children.length == 0" :index="i.toString()" :key="i" @click="clickItem(menu)">
        <i :class="menu.icon"></i>
        <span slot="title" class="nm-item" v-text="menu.title"></span>
      </el-menu-item>
      <el-submenu v-if="menu.children.length > 0" :index="i.toString()" :key="i">
        <template slot="title">
          <i :class="menu.icon"></i>
          <span class="nm-item" v-text="menu.title"></span>
        </template>
        <template v-for="(item, j) in menu.children">
          <el-menu-item :index="i + '-' + j" :key="i + '-' + j" @click="clickItem(item)">
            <i :class="item.icon"></i>
            <span slot="title" class="nm-item" v-text="item.title"></span>
          </el-menu-item>
        </template>
      </el-submenu>
    </template>
  </el-menu>
</template>

<script>
import { Row, Col, Menu, Submenu, MenuItemGroup, MenuItem } from 'element-ui'

export default {
  name: 'luanNavMenu',
  components: {
    [Row.name]: Row,
    [Col.name]: Col,
    [Menu.name]: Menu,
    [Submenu.name]: Submenu,
    [MenuItemGroup.name]: MenuItemGroup,
    [MenuItem.name]: MenuItem
  },
  data() {
    return {
      menuList: [
        { title: '登录总览 - 0.5', icon: 'el-icon-menu', url: '/overview', children: [] },
        { title: '聊天', icon: 'el-icon-menu', url: '', children: [
            { title: '管理群', icon: 'el-icon-menu', url: '/groupManagement', children: [] },
            { title: '聊天记录', icon: 'el-icon-menu', url: '', children: [] }
          ]
        },
        { title: '视频', icon: 'el-icon-menu', url: '', children: [
            { title: '视频播放', icon: 'el-icon-menu', url: '', children: [] },
            { title: '直播', icon: 'el-icon-menu', url: '', children: [] },
            { title: '录播', icon: 'el-icon-menu', url: '', children: [] },
            { title: '插播', icon: 'el-icon-menu', url: '', children: [] },
            { title: '点播', icon: 'el-icon-menu', url: '', children: [] }
          ]
        },
        { title: '人脉商圈', icon: 'el-icon-menu', url: '', children: [
            { title: '商圈', icon: 'el-icon-menu', url: '', children: [] },
            { title: '朋友圈', icon: 'el-icon-menu', url: '', children: [] }
          ]
        },
        { title: '财务管理', icon: 'el-icon-menu', url: '', children: [
            { title: '红包列表', icon: 'el-icon-menu', url: '', children: [] },
            { title: '红包领取记录', icon: 'el-icon-menu', url: '', children: [] },
            { title: '钱包管理', icon: 'el-icon-menu', url: '', children: [] },
            { title: '提现审核', icon: 'el-icon-menu', url: '', children: [] }
          ]
        },
        { title: '消息管理', icon: 'el-icon-menu', url: '', children: [
            { title: '外链管理', icon: 'el-icon-menu', url: '', children: [] },
            { title: '历史推送', icon: 'el-icon-menu', url: '', children: [] }
          ]
        },
        { title: '系统管理', icon: 'el-icon-menu', url: '', children: [] },
        { title: '用户管理', icon: 'el-icon-menu', url: '', children: [] },
        { title: '设置', icon: 'el-icon-menu', url: '', children: [] },
        { title: '后台总管 - 0.1', icon: 'el-icon-menu', url: '/manager', children: [] }
      ]
    }
  },
  methods: {
    clickItem(item) {
      if (!item.url || item.url == this.$route.path) return false
      this.$router.push({ path: item.url })
    },
    handleOpen(key, keyPath) {
      console.log(key, keyPath);
    },
    handleClose(key, keyPath) {
      console.log(key, keyPath);
    }
  }
}
</script>

<style scoped>
.el-menu{ border-right: none; }
.el-submenu, .el-submenu__title, .el-menu-item{ background-color: #02394E; color: #CCCCCC; }
.el-submenu:hover, .el-submenu__title:hover, .el-menu-item:hover{ background-color: #E8F9FF; color: #000000; }
.el-submenu.is-active, .el-submenu__title.is-active, .el-menu-item.is-active{ background-color: #E8F9FF; color: #000000; }
.el-submenu .el-menu-item{ min-width: auto; }
.el-submenu__title .nm-item{ color: #CCCCCC; }
.el-submenu__title:hover .nm-item, .el-submenu__title.is-active .nm-item{ color: #CCCCCC; }
</style>
