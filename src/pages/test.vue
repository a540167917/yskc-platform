<template>
  <div class="test">
    test
    <el-button>asd</el-button>
  </div>
</template>

<script>
export default {
  name: 'test',
  created() {
    throw new Error('test')
  }
}
</script>

<style scoped>
.test{ display: flex; }
</style>
