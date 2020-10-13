export default [
  {
    path: '/chat',
    name: 'chat',
    component: () => import(/* webpackChunkName: 'chat' */'@/pages/chat/chat.vue'),
    meta: {
      requiredLogin: false,
      title: '聊天',
      mapName: '聊天'
    }
  }
]
