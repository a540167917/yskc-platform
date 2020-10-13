export default [
  {
    path: '/overview',
    name: 'overview',
    component: () => import(/* webpackChunkName: 'overview' */'@/pages/overview/overview.vue'),
    meta: {
      requiredLogin: true,
      title: '登录总览',
      mapName: '登录总览'
    }
  }
]
