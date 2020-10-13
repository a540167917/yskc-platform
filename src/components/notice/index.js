import { Loading, Message, MessageBox } from 'element-ui'

let instanceLoading = null

// loading
export const loading = {
  show() {
    instanceLoading = Loading.service({
      fullscreen: true,
      lock: true,
      text: 'Loading',
      spinner: 'el-icon-loading',
      background: 'rgba(0, 0, 0, 0.7)'
    })
  },
  close() {
    instanceLoading.close()
  }
}

// message
export const message = {
  info(msg) {
    Message({
      showClose: true,
      message: msg || '消息',
      type: 'info'
    })
  },
  success(msg) {
    Message({
      showClose: true,
      message: msg || '成功',
      type: 'success'
    })
  },
  warning(msg) {
    Message({
      showClose: true,
      message: msg || '警告',
      type: 'warning'
    })
  },
  error(msg) {
    Message({
      showClose: true,
      message: msg || '错误',
      type: 'error'
    })
  }
}

// messageBox
export const messageBox = MessageBox
