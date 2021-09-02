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
#routerlink {
    color: rgb(62, 64, 68);
}
#routerlink:hover {
  text-decoration: none;
}
.jumbotron {
  background-color: rgb(255, 251, 215);
  color: rgb(95, 95, 93);
}
/* rgb(255, 251, 215); color */
#btnwrite {
    background-color: rgb(250, 197, 25);
    color: white;
    border-radius: 50px;
}
#btnList {
    margin-right: 20px;
    background-color: rgb(106, 110, 105);
    color: white;
    border-radius: 50px;
}
#btndel {
    background-color: rgb(228, 86, 30);
    color: white;
    border-radius: 50px;
}
#btnmodi {
    background-color: rgb(93,141,91);
    color: white;
    border-radius: 50px;
}
#btnRe {
    background-color: rgb(93, 141, 91);
    color: white;
    border-radius: 50px;
}
* {
  /* font-family: 'Jua', sans-serif; */
  /* font-family: 'Do Hyeon', sans-serif; */
  /* font-family: 'IBM Plex Sans KR', sans-serif; */
  /* font-family: 'Noto Sans KR', sans-serif; */
  /* font-family: 'Nanum Gothic', sans-serif; */
  font-family: 'IBM Plex Sans KR', sans-serif;
}
</style>
