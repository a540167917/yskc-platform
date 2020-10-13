import Vue from 'vue'
import VueRouter from 'vue-router'
import store from '@/stores/store'

import { loading } from '@/components/notice'

import overview from './overview'
import manager from './manager'
import login from './login'
import chat from './chat'
import groupManagement from './groupManagement'
Vue.use(VueRouter)

const home = () => import(/* webpackChunkName: 'home' */'@/pages/home.vue')
const test = () => import(/* webpackChunkName: 'test' */'@/pages/test.vue')
const routes = [
  {
    path: '/',
    redirect: '/home'
  },
  {
    path: '/home',
    name: 'home',
    component: home,
    redirect: '/overview',
    meta: {
      requiredLogin: true,
      title: '主页',
      mapName: '主页'
    },
    children: [
      ...overview,
      ...manager,
      ...groupManagement
    ]
  },
  ...login,
  {
    path: '/test',
    name: 'test',
    component: test,
    meta: {
      requiredLogin: false,
      title: '测试',
      mapName: '测试'
    }
  },
  ...chat,
  {
    path: '/chat',
    name: 'chat',
    component: chat,
    meta: {
      requiredLogin: false,
      title: '测试1',
      mapName: '测试1'
    }
  }
]

const router = new VueRouter({
  // mode: 'history',
  routes
})

// 进入路由前
router.beforeEach((to, from, next) => {
  loading.show()
  if (to.matched.some(r => r.meta.requiredLogin)) {
    if (!store.getters.getToken()) {
      next({ path: '/login' })
    }
  }
  next()
})

// 进入路由后
router.afterEach((to) => {
  loading.close()
  document.title = to.meta.title
})

export default router
