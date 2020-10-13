export default [
  {
    path: '/login',
    name: 'login',
    component: () => import(/* webpackChunkName: 'login' */'@/pages/login/login.vue'),
    meta: {
      requiredLogin: false,
      title: '登录',
      mapName: '登录'
    }
  }
]
