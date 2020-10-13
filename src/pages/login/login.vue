<template>
  <div class="login">
    <div class="login-form">
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="登录名：" prop="account">
          <el-input v-model="form.account"></el-input>
        </el-form-item>
        <el-form-item label="密码："  prop="password">
          <el-input type="password" v-model="form.password"></el-input>
        </el-form-item>
        <el-form-item label="验证码："  prop="verifyCode">
          <el-input v-model="form.verifyCode"></el-input>
        </el-form-item>
        <el-form-item  :inline="true">
          <el-button type="primary" @click="onSubmit">立即创建</el-button>
          <el-button @click="resetForm">重置</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
import { login } from '@/lib/login'
import { loading, message } from '@/components/notice'

export default {
  name: 'login',
  data() {
    return {
      form: {
        account: '',
        password: '',
        verifyCode: ''
      },
      rules: {
        account: [
          { required: true, message: '登录名不为空' }
        ],
        password: [
          { required: true, message: '密码不为空' }
        ],
        verifyCode: [
          { required: true, message: '验证码不为空' }
        ]
      }
    }
  },
  methods: {
    async onSubmit() {
      try {
        loading.show()
        const valid = await this.$refs.form.validate()
        if (valid) {
          const isLogined = await login()
          if (isLogined) {
            this.$router.replace({ path: '/' })
          }
        } else {
          return false
        }
      } catch (error) {
        message.error(error.message)
      } finally {
        loading.close()
      }
    },
    resetForm() {
      this.$refs.form.resetFields()
    }
  },
  created() {
    // console.log(this.$message)
  }
}
</script>

<style scoped>
.login{ height: 100vh; background: url('../../images/bg_login.jpg') no-repeat center center; background-size: cover; overflow: hidden; }
.login-form{ position: absolute; top: 20%; right: 200px; width: 20%; padding: 32px; background-color: #004193; border-radius: 20px; box-shadow: 0 0 50px 10px #dddddd; }
</style>
<style>
.login .el-form-item__label{ color: #ffffff; }
</style>
