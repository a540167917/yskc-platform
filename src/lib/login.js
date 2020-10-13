import store from '@/stores/store'

export const login = async () => {
  if (Math.random() > 0.3) {
    store.commit('setToken', Math.random().toString(36).substr(2))
    return true
  } else {
    throw new Error('登录失败 ~ 随机出错，机率3成')
  }
}

export const logout = async () => {
  if (Math.random() > 0.3) {
    await store.dispatch('logout')
    return true
  } else {
    throw new Error('登出失败 ~ 随机出错，机率3成')
  }
}
