<template>
  <div id="app">
      <!-- 정민언니 -->
      <ui-header></ui-header>
      <router-view></router-view>
      

      <!-- 혜수언니 -->
      <!-- <ui-main></ui-main> -->
      <ui-footer></ui-footer>
  </div>

</template>


<script>
// 정민언니
import FooterVue from './components/Footer.vue'
import HeaderVue from './components/Header.vue'

// 혜수언니
// import MainVue from './views/alleymain.vue'
// import DetailVue from './views/alleydetail.vue'

export default {
  components: {
    // 정민언니
    'ui-header': HeaderVue,
    'ui-footer': FooterVue,

    // 혜수언니
    // "ui-main" : MainVue,
    // "ui-detail" : DetailVue
  }
}
</script>

<style>

</style>
