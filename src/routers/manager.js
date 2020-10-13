export default [
  {
    path: '/manager',
    name: 'manager',
    component: () => import(/* webpackChunkName: 'manager' */'@/pages/manager/manager.vue'),
    meta: {
      requiredLogin: true,
      title: '后台总管',
      mapName: '后台总管'
    }
  }
]
