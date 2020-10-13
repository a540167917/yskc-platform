export const _local = {
  get(key) {
    return localStorage.getItem(key) || null
  },
  set(key, value) {
    localStorage.setItem(key, value)
  },
  clear(key) {
    localStorage.removeItem(key)
  }
}

export const _session = {
  get(key) {
    return sessionStorage.getItem(key) || null
  },
  set(key, value) {
    sessionStorage.setItem(key, value)
  },
  clear(key) {
    sessionStorage.removeItem(key)
  }
}
