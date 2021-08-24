<template>
  <div id="app">
      <ui-header></ui-header>
      <router-view></router-view>
      <ui-footer></ui-footer>
  </div>

</template>


<script>
// 정민언니
import FooterVue from './components/Footer.vue'
import HeaderVue from './components/Header.vue'

export default {
  components: {

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
