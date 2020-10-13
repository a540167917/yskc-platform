<template>
  <div class="overview">
    <el-row style="height: 50%">
      <el-col :span="12" style="height: 100%">
        <canvas ref="signin1"></canvas>
      </el-col>
      <el-col :span="6" style="height: 100%">
        <canvas ref="signin2"></canvas>
      </el-col>
      <el-col :span="6" style="height: 100%">
        <canvas ref="signin3"></canvas>
      </el-col>
    </el-row>
    <el-row style="height: 50%">
      <el-col :span="12" style="height: 100%">
        <canvas ref="signin4"></canvas>
      </el-col>
      <el-col :span="12" style="height: 100%">
        <div class="o-notices-box">
          <h2>消息通知</h2>
          <ul>
            <li v-for="(li, i) in noticeList" :key="i">【系统通知】如何建立良好的客户关系</li>
          </ul>
        </div>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import Echarts from 'echarts'

export default {
  name: 'overview',
  data() {
    return {
      echarts1: null,
      echarts2: null,
      echarts3: null,
      echarts4: null,
      noticeList: [{}, {}, {}, {}, {}],
      luan: null
    }
  },
  methods: {
    initCanvas() {
      this.$refs.signin1.width = this.$refs.signin1.clientWidth
      this.$refs.signin1.height = this.$refs.signin1.clientHeight
      this.$refs.signin2.width = this.$refs.signin1.clientWidth
      this.$refs.signin2.height = this.$refs.signin1.clientWidth
      this.$refs.signin3.width = this.$refs.signin1.clientWidth
      this.$refs.signin3.height = this.$refs.signin1.clientWidth
      this.$refs.signin4.width = this.$refs.signin1.clientWidth
      this.$refs.signin4.height = this.$refs.signin1.clientHeight
      this.echarts1 = Echarts.init(this.$refs.signin1)
      this.echarts2 = Echarts.init(this.$refs.signin2)
      this.echarts3 = Echarts.init(this.$refs.signin3)
      this.echarts4 = Echarts.init(this.$refs.signin4)
      this.renderCanvas()
    },
    renderCanvas() {
      this.echarts1.setOption({
        title: {
          text: '今日签到人群、人数'
        },
        tooltip: {},
        legend: {
          data:['销量']
        },
        xAxis: {
          data: ["衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子","袜子","袜子","袜子","袜子","袜子"]
        },
        yAxis: {},
        series: [{
          name: '销量',
          type: 'bar',
          data: [5, 20, 36, 10, 10, 20, 20, 20, 20, 20, 20]
        }]
      })
      this.echarts2.setOption({
        title: {
          text: '登录人群行业占比'
        },
        tooltip: {},
        legend: {
          data:['销量']
        },
        series: [{
          name: '销量',
          type: 'pie',
          data: [5, 20, 36, 10, 10, 20]
        }]
      })
      this.echarts3.setOption({
        title: {
          text: '男女占比'
        },
        tooltip: {},
        legend: {
          data:['销量']
        },
        series: [{
          name: '销量',
          type: 'pie',
          data: [5, 20, 36, 10, 10, 20]
        }]
      })
      this.echarts4.setOption({
        title: {
          text: '地区签到人数占比'
        },
        tooltip: {},
        legend: {
          data:['销量']
        },
        xAxis: {
          data: ["衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","高跟鞋","高跟鞋","高跟鞋","高跟鞋","高跟鞋","袜子"]
        },
        yAxis: {},
        series: [{
          name: '销量',
          type: 'bar',
          data: [5, 20, 36, 36, 36, 36, 36, 10, 10, 20]
        }]
      })
    }
  },
  mounted() {
    this.initCanvas()
  }
}
</script>

<style scoped>
.overview{ display: block; height: 100%; text-align: center; }
canvas{ width: 100%; height: 100%; }
.o-notices-box{ text-align: left; }
</style>
