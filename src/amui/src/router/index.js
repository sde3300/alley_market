import Vue from 'vue'
import VueRouter from 'vue-router'

import DetailVue from '../views/Detail.vue'
import Index from '../views/Index.vue'
import Main from '../views/Main.vue'
import AdminMainVue from '../views/AdminMain.vue'
import AdminProductStock from '../views/AdminProductStock.vue'
import CusManagementVue from '../views/CusManagement.vue'
import AdminQnaVue from '../views/AdminQna.vue'
import Login from '../views/Login.vue'
import Join from '../views/Join.vue'
import ReviewWrite from '../views/ReviewWrite.vue'
import QnAWrite from '../views/QnAWrite.vue'
import Mypage from '../views/Mypage.vue'
import AdminProductInsert from '../views/AdminProductInsert.vue'
import IntroductionVue from '../views/Introduction.vue'
import NoticeListVue from '../views/NoticeList.vue'
import NoticeDetailVue from '../views/NoticeDetail.vue'
import Order from '../views/Order.vue'
import CartList from '../views/CartList.vue'
import AdminNoticeList from '../views/AdminNoticeList.vue'
import AdminNoticeWrite from '../views/AdminNoticeWrite.vue'
import P1board from '../views/P1Board.vue'
import P2board from '../views/P2Board.vue'
import P3board from '../views/P3Board.vue'
import P4board from '../views/P4Board.vue'
import P5board from '../views/P5Board.vue'


Vue.use(VueRouter)

const routes = [
  // 혜수언니
  {
    path: '/',
    name: 'Index',
    component: Index
  },
  {
    path: '/main',
    name: 'Main',
    component: Main
  },
    {
    path: '/detail',
    name: 'Detail',
    component: DetailVue,
  },
  {
    path: '/cartlist',
    name: 'CartList',
    component: CartList,
  },
  {
    path: '/p1board',
    name: 'P1board',
    component: P1board,
  },
  {
    path: '/p2board',
    name: 'P2board',
    component: P2board,
  },
  {
    path: '/p3board',
    name: 'P3board',
    component: P3board,
  },
  {
    path: '/p4board',
    name: 'P4board',
    component: P4board,
  },
  {
    path: '/p5board',
    name: 'P5board',
    component: P5board,
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
    path: '/adminProductStock',
    name: 'AdminProductStock',
    component: AdminProductStock
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
    path: '/mypage',
    name: 'Mypage',
    component: Mypage
  },
  {
    path: '/adminProductInsert',
    name: 'AdminProductInsert',
    component: AdminProductInsert
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
