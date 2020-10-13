<template>
  <div class="home">
    <div class="home-left">
      <div class="home-logo">
        <img :src="require('@/images/logo.png')" alt="" srcset="">
      </div>
      <luan-nav-menu></luan-nav-menu>
    </div>
    <div class="home-right">
      <div class="home-header">
        <div class="hh-item hh-left">
          当前位置：<span v-text="routeMap"></span>
        </div>
        <div class="hh-item hh-center">
          <el-input placeholder="请输入搜索内容" size="mini" v-model="searchText" class="input-with-select">
            <el-button slot="append" icon="el-icon-search"></el-button>
          </el-input>
        </div>
        <div class="hh-item hh-right">
          <el-avatar size="large" :src="circleUrl"></el-avatar>
          <span class="hh-hello">hello，<span>李小明</span></span>
          <span class="hh-logout" @click="logout">退出登录</span>
        </div>
      </div>
      <div class="home-content">
        <router-view></router-view>
      </div>
    </div>
  </div>
</template>

<script>
import { LuanNavMenu } from '@/layout/nav-menu'
import { logout } from '@/lib/login'
import { loading, message, messageBox } from '@/components/notice'

export default {
  name: 'home',
  components: {
    [LuanNavMenu.name]: LuanNavMenu
  },
  data() {
    return {
      searchText: ''
    }
  },
  computed: {
    routeMap () {
      return this.$route.meta.mapName
    },
    circleUrl() {
      return require('@/images/avator.png')
    }
  },
  methods: {
    // 退出登录
    async logout() {
      const isConfirm = await messageBox.confirm('确认退出系统吗？')
      if (!isConfirm) return false
      try {
        loading.show()
        const isLogouted = await logout()
        if (isLogouted) {
          this.$router.replace({ path: '/login' })
        }
      } catch (error) {
        message.error(error.message)
      } finally {
        loading.close()
      }
    }
  }
}
</script>

<style scoped>
.home{ display: block; width: 100vw; height: 100vh; overflow: hidden; }
.home-left{ width: 200px; height: 100%; float: left; background-color: #02394E; overflow: hidden auto; }
.home-logo{ height: 100px; background-color: #FFFFFF; }
.home-logo img{ width: 100%; height: 100%; }
.home-header{ height: 100px; background-color: #FFFFFF; padding: 20px; display: flex; align-items: center; }
.hh-item{ flex-grow: 1; }
.hh-left{ text-align: left; }
.hh-center{ text-align: center; max-width: 200px; }
.hh-right{ text-align: right; align-items: center; display: flex; justify-content: flex-end; }
.hh-hello{ margin: 0 10px; }
.hh-logout{ margin-left: 10px; color: blue; cursor: pointer; }
.home-right{ width: calc(100% - 200px); height: 100%; float: right; display: block; background-color: #E8F9FF; }
.home-content{ height: calc(100% - 100px); padding: 25px; }
.home-container{ height: 100%; border-radius: 20px; background-color: #FFFFFF; overflow: auto; box-shadow: 0 0 15px 0px #D0D0D0; }
</style>
