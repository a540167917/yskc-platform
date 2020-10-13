import Vue from 'vue'
import ElementUI from 'element-ui'

import store from '@/stores/store'
import router from '@/routers/router'

import 'element-ui/lib/theme-chalk/index.css'
import '@/styles/root.css'

import App from './App.vue'

Vue.use(ElementUI)

Vue.config.productionTip = false
Vue.config.errorHandler = (...args) => {
  console.log(args)
}

new Vue({
  store,
  router,
  render: h => h(App),
}).$mount('#app')
