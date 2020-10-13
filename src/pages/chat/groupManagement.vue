<template>
  <section>
    <!-- 工具条 -->
    <el-col :span="24" class="toolbar" style="padding-bottom: 0px;">
      <el-form :inline="true">
        <el-form-item>
          <el-input placeholder="输入账号"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" icon="el-icon-search" v-on:click="getRows"
            >搜索hahah</el-button
          >
        </el-form-item>
        <el-form-item>
          <el-button
            type="success"
            icon="el-icon-refresh"
            v-on:click="resetFrom"
            >重置</el-button
          >
        </el-form-item>
      </el-form>
    </el-col>

    <!-- 数据列表 -->
    <el-table
      :data="tableData"
      style="width:100%;"
      default-expand-all
      v-loading="loading"
      :tree-props="{ children: 'children', hasChildren: 'hasChildren' }"
    >
      <el-table-column prop="account" label="用户账号"></el-table-column>
      <el-table-column prop="contentViolation" label="聊天内容是否违规"></el-table-column>
      <el-table-column prop="lookContentViolation" label="查看违规内容"></el-table-column>
      <el-table-column prop="accountApplicationTime" label="账号申请时间"></el-table-column>
      <el-table-column label="操作">
        <template slot-scope="scope">
          <el-button @click="warn(scope.row)" type="text" size="small"
            >警告</el-button
          >
          <el-button @click="ban(scope.row)" type="text" size="small"
            >封号</el-button
          >
          <el-button @click="logout(scope.row)" type="text" size="small"
            >注销</el-button
          >
        </template>
      </el-table-column>
    </el-table>

    <!-- 分页  -->
    <el-col :span="24" class="toolbar">
      <el-pagination
        background
        layout="total,prev, pager, next"
        :total="total"
        @current-change="handleCurrentChange"
        :page-size="10"
        style="float:right;"
      >
      </el-pagination>
    </el-col>
  </section>
</template>

<script>
export default {
  data() {
    return {
      tableData: [{
        account: '43252343',
        contentViolation: '是',
        lookContentViolation: '查看',
        accountApplicationTime:'8888:99:000',
      }],
      filters: {},
      loading: false,
      total: 0,
    };
  },
  methods: {
    getRows() {},
    resetFrom() {},
    handleCurrentChange() {},
    warn(){},
    ban(){},
    logout(){}
  },
};
</script>
