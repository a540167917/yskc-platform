export default [
    {
      path: '/groupManagement',
      name: 'groupManagement',
      component: () => import(/* webpackChunkName: 'groupManagement' */'@/pages/chat/groupManagement.vue'),
      meta: {
        requiredLogin: true,
        title: '群管理',
        mapName: '群管理'
      }
    }
  ]
  