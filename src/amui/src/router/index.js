import Vue from 'vue'
import VueRouter from 'vue-router'

import DetailVue from '../views/Detail.vue'
import Main from '../views/Main.vue'
import AdminMainVue from '../views/AdminMain.vue'
import AdminProductVue from '../views/AdminProduct.vue'
import CusManagementVue from '../views/CusManagement.vue'
import AdminQnaVue from '../views/AdminQna.vue'
import Login from '../views/Login.vue'
import Join from '../views/Join.vue'
import ReviewWrite from '../views/ReviewWrite.vue'
import QnAWrite from '../views/QnAWrite.vue'
import NoticeWrite from '../views/NoticeWrite.vue'
import Mypage from '../views/Mypage.vue'
import ProductInsertVue from '../views/ProductInsert.vue'
import IntroductionVue from '../views/Introduction.vue'
import NoticeListVue from '../views/NoticeList.vue'
import NoticeDetailVue from '../views/NoticeDetail.vue'
import Order from '../views/Order.vue'
import CartList from '../views/CartList.vue'
import AdminNoticeList from '../views/AdminNoticeList.vue'
import AdminNoticeWrite from '../views/AdminNoticeWrite.vue'

Vue.use(VueRouter)

const routes = [
  // 혜수언니
  {
    path: '/',
    name: 'Main',
    component: Main
  },
  {
    path: '/detail',
    name: 'detail',
    component: DetailVue,
  },
  {
    path: '/cartli',
    name: 'cartli',
    component: CartList,
  },

  
  // 정민언니
  {
    path: '/login',
    name: 'Login',
    component: Login
  },
  {
    path: '/join',
    name: 'Join',
    component: Join
  },

  {
  path: '/adminMain',
  name: 'AdminMain',
  component: AdminMainVue
  },
  {
    path: '/adminProduct',
    name: 'AdminProduct',
    component: AdminProductVue
  },
  {
    path: '/cusManagement',
    name: 'CusManagement',
    component: CusManagementVue
  },
  {
    path: '/adminQna',
    name: 'AdminQna',
    component: AdminQnaVue
  },
  {
    path: '/reviewWrite',
    name: 'ReviewWrite',
    component: ReviewWrite
  },
  {
    path: '/qnaWrite',
    name: 'QnAWrite',
    component: QnAWrite
  },
  {
    path: '/noticeWrite',
    name: 'NoticeWrite',
    component: NoticeWrite
  },
  {
    path: '/mypage',
    name: 'Mypage',
    component: Mypage
  },
  {
    path: '/productInsert',
    name: 'ProductInsert',
    component: ProductInsertVue
  },
  {
    path: '/introduction',
    name: 'Introduction',
    component: IntroductionVue
  },
  {
    path: '/noticeList',
    name: 'NoticeList',
    component: NoticeListVue
  },
  {
    path: '/noticeDetail',
    name: 'NoticeDetail',
    component: NoticeDetailVue
  },
  {
    path: '/order',
    name: 'Order',
    component: Order
  },
  {
    path: '/adminNoticeList',
    name: 'AdminNoticeList',
    component: AdminNoticeList
  },
  {
    path: '/adminNoticeWrite',
    name: 'AdminNoticeWrite',
    component: AdminNoticeWrite
  }
]

const router = new VueRouter({
  routes
})

export default router
