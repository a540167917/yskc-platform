import Vue from 'vue'
import Vuex from 'vuex'
import { _session } from './client'
import CLIENT_KEY from './client-key'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    token: null
  },
  getters: {
    getToken: state => () => {
      let value = state.token
      !value && (value = _session.get(CLIENT_KEY.ASSESS_TOKEN))
      return value
    }
  },
  mutations: {
    setToken(state, value) {
      state.token = value
      _session.set(CLIENT_KEY.ASSESS_TOKEN, value)
    }
  },
  actions: {
    async logout() {
      _session.clear(CLIENT_KEY.ASSESS_TOKEN)
    }
  },
  modules: {}
})
